package epp;

import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Visitor que genera código Jasmin a partir del AST de E++.
 * Gestiona la traducción de todas las construcciones del lenguaje.
 */
public class EPPToJasminVisitor extends EPPParserBaseVisitor<String> {
    
    private StringBuilder jasminCode;
    private SymbolTable symbolTable;
    private String className;
    private int labelCounter;
    private int maxStack;
    private int currentStack;
    
    public EPPToJasminVisitor(String className) {
        this.jasminCode = new StringBuilder();
        this.symbolTable = new SymbolTable();
        this.className = className;
        this.labelCounter = 0;
        this.maxStack = 0;
        this.currentStack = 0;
    }
    
    private String newLabel(String prefix) {
        return prefix + "_" + (labelCounter++);
    }
    
    private void pushStack(int n) {
        currentStack += n;
        if (currentStack > maxStack) {
            maxStack = currentStack;
        }
    }
    
    private void popStack(int n) {
        currentStack -= n;
    }
    
    /**
     * Genera la instrucción iload correcta según el índice.
     * iload_N solo funciona para N = 0, 1, 2, 3.
     * Para índices >= 4, se debe usar iload N.
     */
    private void generateIload(int localIndex) {
        if (localIndex >= 0 && localIndex <= 3) {
            jasminCode.append("    iload_").append(localIndex).append("\n");
        } else {
            jasminCode.append("    iload ").append(localIndex).append("\n");
        }
    }
    
    /**
     * Genera la instrucción istore correcta según el índice.
     * istore_N solo funciona para N = 0, 1, 2, 3.
     * Para índices >= 4, se debe usar istore N.
     */
    private void generateIstore(int localIndex) {
        if (localIndex >= 0 && localIndex <= 3) {
            jasminCode.append("    istore_").append(localIndex).append("\n");
        } else {
            jasminCode.append("    istore ").append(localIndex).append("\n");
        }
    }
    
    /**
     * Genera la instrucción astore correcta según el índice (para objetos/strings).
     */
    private void generateAstore(int localIndex) {
        if (localIndex >= 0 && localIndex <= 3) {
            jasminCode.append("    astore_").append(localIndex).append("\n");
        } else {
            jasminCode.append("    astore ").append(localIndex).append("\n");
        }
    }
    
    /**
     * Genera la instrucción aload correcta según el índice (para objetos/strings).
     */
    private void generateAload(int localIndex) {
        if (localIndex >= 0 && localIndex <= 3) {
            jasminCode.append("    aload_").append(localIndex).append("\n");
        } else {
            jasminCode.append("    aload ").append(localIndex).append("\n");
        }
    }
    
    /**
     * Determina el tipo de una expresión.
     */
    private SymbolTable.VarType getExpressionType(EPPParser.ExpresionContext ctx) {
        if (ctx instanceof EPPParser.ExprPrimariaContext) {
            EPPParser.ExpresionPrimariaContext primCtx = ((EPPParser.ExprPrimariaContext) ctx).expresionPrimaria();
            if (primCtx instanceof EPPParser.ExprTextoContext) {
                return SymbolTable.VarType.STRING;
            } else if (primCtx instanceof EPPParser.ExprNumeroContext || 
                       primCtx instanceof EPPParser.ExprNumeroNegativoContext) {
                return SymbolTable.VarType.INT;
            } else if (primCtx instanceof EPPParser.ExprVariableContext) {
                String varName = ((EPPParser.ExprVariableContext) primCtx).VARIABLE().getText();
                SymbolTable.Variable var = symbolTable.getVariable(varName);
                return var != null ? var.type : SymbolTable.VarType.INT;
            }
        } else if (ctx instanceof EPPParser.ExprComparacionContext) {
            // Las comparaciones devuelven booleanos
            return SymbolTable.VarType.BOOLEAN;
        }
        return SymbolTable.VarType.INT; // Por defecto, asumimos entero
    }
    
    @Override
    public String visitPrograma(EPPParser.ProgramaContext ctx) {
        // Estructura base de la clase
        jasminCode.append(".class public ").append(className).append("\n");
        jasminCode.append(".super java/lang/Object\n\n");
        
        // Constructor por defecto
        jasminCode.append(".method public <init>()V\n");
        jasminCode.append("    aload_0\n");
        jasminCode.append("    invokenonvirtual java/lang/Object/<init>()V\n");
        jasminCode.append("    return\n");
        jasminCode.append(".end method\n\n");
        
        // Método main
        jasminCode.append(".method public static main([Ljava/lang/String;)V\n");
        
        // Procesar todas las instrucciones
        for (EPPParser.InstruccionContext instr : ctx.instruccion()) {
            visit(instr);
        }
        
        jasminCode.append("    return\n");
        
        // Insertar límites calculados al principio del main
        jasminCode.insert(jasminCode.indexOf("main") + "main([Ljava/lang/String;)V\n".length(),
                "    .limit stack " + Math.max(maxStack, 3) + "\n" +
                "    .limit locals " + symbolTable.getMaxLocals() + "\n\n");
        
        jasminCode.append(".end method\n");
        
        return jasminCode.toString();
    }
    
    @Override
    public String visitAsignacion(EPPParser.AsignacionContext ctx) {
        String varName = ctx.VARIABLE().getText();
        
        // Determinar el tipo de la expresión
        SymbolTable.VarType type = getExpressionType(ctx.expresion());
        SymbolTable.Variable var = symbolTable.declareVariable(varName, type);
        
        visit(ctx.expresion());
        
        // Usar store apropiado según el tipo
        if (type == SymbolTable.VarType.STRING) {
            generateAstore(var.localIndex);
        } else {
            generateIstore(var.localIndex);
        }
        popStack(1);
        
        return "";
    }
    
    @Override
    public String visitAsignacionSimple(EPPParser.AsignacionSimpleContext ctx) {
        String varName = ctx.VARIABLE().getText();
        
        // Determinar el tipo de la expresión
        SymbolTable.VarType type = getExpressionType(ctx.expresion());
        SymbolTable.Variable var = symbolTable.declareVariable(varName, type);
        
        visit(ctx.expresion());
        
        // Usar store apropiado según el tipo
        if (type == SymbolTable.VarType.STRING) {
            generateAstore(var.localIndex);
        } else {
            generateIstore(var.localIndex);
        }
        popStack(1);
        
        return "";
    }
    
    @Override
    public String visitMostrar(EPPParser.MostrarContext ctx) {
        jasminCode.append("    getstatic java/lang/System/out Ljava/io/PrintStream;\n");
        pushStack(1);
        
        // Determinar el tipo de expresión para usar la firma correcta de println
        ParseTree expr = ctx.expresion();
        boolean isString = isStringExpression(expr);
        
        visit(ctx.expresion());
        pushStack(1);
        
        if (isString) {
            jasminCode.append("    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V\n");
        } else {
            jasminCode.append("    invokevirtual java/io/PrintStream/println(I)V\n");
        }
        popStack(2);
        
        return "";
    }
    
    // Método auxiliar para determinar si una expresión es de tipo String
    private boolean isStringExpression(ParseTree expr) {
        if (expr instanceof EPPParser.ExprPrimariaContext) {
            EPPParser.ExprPrimariaContext primCtx = (EPPParser.ExprPrimariaContext) expr;
            EPPParser.ExpresionPrimariaContext primaria = primCtx.expresionPrimaria();
            
            // String literal
            if (primaria instanceof EPPParser.ExprTextoContext) {
                return true;
            }
            
            // Variable de tipo string
            if (primaria instanceof EPPParser.ExprVariableContext) {
                String varName = ((EPPParser.ExprVariableContext) primaria).VARIABLE().getText();
                SymbolTable.Variable var = symbolTable.getVariable(varName);
                return var != null && var.type == SymbolTable.VarType.STRING;
            }
        }
        return false;
    }
    
    // Método auxiliar para determinar si una expresión comparable es de tipo String
    private boolean isStringComparable(EPPParser.ExpresionComparableContext expr) {
        if (expr instanceof EPPParser.ExprCompStringContext) {
            return true;
        }
        if (expr instanceof EPPParser.ExprCompVariableContext) {
            String varName = ((EPPParser.ExprCompVariableContext) expr).VARIABLE().getText();
            SymbolTable.Variable var = symbolTable.getVariable(varName);
            return var != null && var.type == SymbolTable.VarType.STRING;
        }
        return false;
    }
    
    @Override
    public String visitExprNumero(EPPParser.ExprNumeroContext ctx) {
        String numText = ctx.NUM().getText();
        
        // Verificar si es un número decimal
        if (numText.contains(".")) {
            // Convertir decimal a entero (truncar la parte decimal)
            double numDouble = Double.parseDouble(numText);
            int num = (int) numDouble;
            
            if (num >= -128 && num <= 127) {
                jasminCode.append("    bipush ").append(num).append("\n");
            } else if (num >= -32768 && num <= 32767) {
                jasminCode.append("    sipush ").append(num).append("\n");
            } else {
                jasminCode.append("    ldc ").append(num).append("\n");
            }
        } else {
            // Número entero
            int num = Integer.parseInt(numText);
            
            if (num >= -128 && num <= 127) {
                jasminCode.append("    bipush ").append(num).append("\n");
            } else if (num >= -32768 && num <= 32767) {
                jasminCode.append("    sipush ").append(num).append("\n");
            } else {
                jasminCode.append("    ldc ").append(num).append("\n");
            }
        }
        pushStack(1);
        
        return "";
    }
    
    @Override
    public String visitExprNumeroNegativo(EPPParser.ExprNumeroNegativoContext ctx) {
        String numText = ctx.NUM().getText();
        
        // Verificar si es un número decimal
        if (numText.contains(".")) {
            // Convertir decimal a entero (truncar la parte decimal)
            double numDouble = Double.parseDouble(numText);
            int num = -(int) numDouble;
            
            if (num >= -128 && num <= 127) {
                jasminCode.append("    bipush ").append(num).append("\n");
            } else if (num >= -32768 && num <= 32767) {
                jasminCode.append("    sipush ").append(num).append("\n");
            } else {
                jasminCode.append("    ldc ").append(num).append("\n");
            }
        } else {
            // Número entero
            int num = -Integer.parseInt(numText);
            
            if (num >= -128 && num <= 127) {
                jasminCode.append("    bipush ").append(num).append("\n");
            } else if (num >= -32768 && num <= 32767) {
                jasminCode.append("    sipush ").append(num).append("\n");
            } else {
                jasminCode.append("    ldc ").append(num).append("\n");
            }
        }
        pushStack(1);
        
        return "";
    }
    
    @Override
    public String visitExprVariable(EPPParser.ExprVariableContext ctx) {
        String varName = ctx.VARIABLE().getText();
        SymbolTable.Variable var = symbolTable.getVariable(varName);
        
        if (var == null) {
            throw new RuntimeException("Variable no declarada: " + varName);
        }
        
        // Usar load apropiado según el tipo
        if (var.type == SymbolTable.VarType.STRING) {
            generateAload(var.localIndex);
        } else {
            generateIload(var.localIndex);
        }
        pushStack(1);
        
        return "";
    }
    
    @Override
    public String visitExprTexto(EPPParser.ExprTextoContext ctx) {
        String text = ctx.STRING().getText();
        // Remover las comillas del string
        text = text.substring(1, text.length() - 1);
        jasminCode.append("    ldc \"").append(text).append("\"\n");
        pushStack(1);
        
        return "";
    }
    
    @Override
    public String visitExprPrimaria(EPPParser.ExprPrimariaContext ctx) {
        // Delegar a la expresión primaria específica
        return visit(ctx.expresionPrimaria());
    }
    
    @Override
    public String visitExprParentesis(EPPParser.ExprParentesisContext ctx) {
        // Los paréntesis no generan código, solo afectan la precedencia
        return visit(ctx.expresion());
    }
    
    @Override
    public String visitExprBooleanoVerdadero(EPPParser.ExprBooleanoVerdaderoContext ctx) {
        jasminCode.append("    iconst_1\n");
        pushStack(1);
        return "";
    }
    
    @Override
    public String visitExprBooleanoFalso(EPPParser.ExprBooleanoFalsoContext ctx) {
        jasminCode.append("    iconst_0\n");
        pushStack(1);
        return "";
    }
    
    @Override
    public String visitExprAritmeticaSumaResta(EPPParser.ExprAritmeticaSumaRestaContext ctx) {
        visit(ctx.expresion(0));
        visit(ctx.expresion(1));
        
        String op = ctx.operadorAditivo().getText();
        if (op.equals("+")) {
            jasminCode.append("    iadd\n");
        } else {
            jasminCode.append("    isub\n");
        }
        popStack(1);
        
        return "";
    }
    
    @Override
    public String visitExprAritmeticaMultDiv(EPPParser.ExprAritmeticaMultDivContext ctx) {
        String op = ctx.operadorMultiplicativo().getText();
        
        // Verificar división/módulo por cero con literales
        if (op.equals("/") || op.equals("%")) {
            EPPParser.ExpresionContext divisor = ctx.expresion(1);
            if (isZeroLiteralExpresionGeneral(divisor)) {
                String errorMsg = op.equals("/") ? "División por cero detectada" : "Módulo por cero detectado";
                throw new RuntimeException("Error semántico: " + errorMsg + " en línea " + ctx.getStart().getLine());
            }
        }
        
        visit(ctx.expresion(0));
        visit(ctx.expresion(1));
        
        switch (op) {
            case "*":
                jasminCode.append("    imul\n");
                break;
            case "/":
                jasminCode.append("    idiv\n");
                break;
            case "%":
                jasminCode.append("    irem\n");
                break;
        }
        popStack(1);
        
        return "";
    }
    
    /**
     * Verifica si una expresión general es el literal cero.
     */
    private boolean isZeroLiteralExpresionGeneral(EPPParser.ExpresionContext ctx) {
        if (ctx instanceof EPPParser.ExprPrimariaContext) {
            EPPParser.ExprPrimariaContext primCtx = (EPPParser.ExprPrimariaContext) ctx;
            EPPParser.ExpresionPrimariaContext primaria = primCtx.expresionPrimaria();
            if (primaria instanceof EPPParser.ExprNumeroContext) {
                EPPParser.ExprNumeroContext numCtx = (EPPParser.ExprNumeroContext) primaria;
                String numText = numCtx.NUM().getText();
                try {
                    return Integer.parseInt(numText) == 0 || Double.parseDouble(numText) == 0.0;
                } catch (NumberFormatException e) {
                    return false;
                }
            }
        }
        return false;
    }
    
    // Visitores para expresiones aritméticas (usadas en bucles para)
    @Override
    public String visitExprAritSumaResta(EPPParser.ExprAritSumaRestaContext ctx) {
        visit(ctx.expresionAritmetica(0));
        visit(ctx.expresionAritmetica(1));
        
        String op = ctx.operadorAditivo().getText();
        if (op.equals("+")) {
            jasminCode.append("    iadd\n");
        } else {
            jasminCode.append("    isub\n");
        }
        popStack(1);
        
        return "";
    }
    
    @Override
    public String visitExprAritMultDiv(EPPParser.ExprAritMultDivContext ctx) {
        String op = ctx.operadorMultiplicativo().getText();
        
        // Verificar división/módulo por cero con literales
        if (op.equals("/") || op.equals("%")) {
            EPPParser.ExpresionAritmeticaContext divisor = ctx.expresionAritmetica(1);
            if (isZeroLiteralExpresion(divisor)) {
                String errorMsg = op.equals("/") ? "División por cero detectada" : "Módulo por cero detectado";
                throw new RuntimeException("Error semántico: " + errorMsg + " en línea " + ctx.getStart().getLine());
            }
        }
        
        visit(ctx.expresionAritmetica(0));
        visit(ctx.expresionAritmetica(1));
        
        switch (op) {
            case "*":
                jasminCode.append("    imul\n");
                break;
            case "/":
                jasminCode.append("    idiv\n");
                break;
            case "%":
                jasminCode.append("    irem\n");
                break;
        }
        popStack(1);
        
        return "";
    }
    
    /**
     * Verifica si una expresión aritmética es el literal cero.
     */
    private boolean isZeroLiteralExpresion(EPPParser.ExpresionAritmeticaContext ctx) {
        if (ctx instanceof EPPParser.ExprAritPrimariaContext) {
            EPPParser.ExprAritPrimariaContext primCtx = (EPPParser.ExprAritPrimariaContext) ctx;
            EPPParser.ExpresionAritmeticaPrimariaContext primaria = primCtx.expresionAritmeticaPrimaria();
            if (primaria instanceof EPPParser.ExprAritNumeroContext) {
                EPPParser.ExprAritNumeroContext numCtx = (EPPParser.ExprAritNumeroContext) primaria;
                String numText = numCtx.NUM().getText();
                try {
                    return Integer.parseInt(numText) == 0 || Double.parseDouble(numText) == 0.0;
                } catch (NumberFormatException e) {
                    return false;
                }
            }
        }
        return false;
    }
    
    @Override
    public String visitExprAritPrimaria(EPPParser.ExprAritPrimariaContext ctx) {
        return visit(ctx.expresionAritmeticaPrimaria());
    }
    
    @Override
    public String visitExprAritVariable(EPPParser.ExprAritVariableContext ctx) {
        String varName = ctx.VARIABLE().getText();
        SymbolTable.Variable var = symbolTable.getVariable(varName);
        
        if (var == null) {
            throw new RuntimeException("Variable no declarada: " + varName);
        }
        
        // Usar load apropiado según el tipo
        if (var.type == SymbolTable.VarType.STRING) {
            generateAload(var.localIndex);
        } else {
            generateIload(var.localIndex);
        }
        pushStack(1);
        
        return "";
    }
    
    @Override
    public String visitExprAritNumero(EPPParser.ExprAritNumeroContext ctx) {
        int num = Integer.parseInt(ctx.NUM().getText());
        
        if (num >= -128 && num <= 127) {
            jasminCode.append("    bipush ").append(num).append("\n");
        } else if (num >= -32768 && num <= 32767) {
            jasminCode.append("    sipush ").append(num).append("\n");
        } else {
            jasminCode.append("    ldc ").append(num).append("\n");
        }
        pushStack(1);
        
        return "";
    }
    
    @Override
    public String visitExprAritNumeroNegativo(EPPParser.ExprAritNumeroNegativoContext ctx) {
        int num = -Integer.parseInt(ctx.NUM().getText());
        
        if (num >= -128 && num <= 127) {
            jasminCode.append("    bipush ").append(num).append("\n");
        } else if (num >= -32768 && num <= 32767) {
            jasminCode.append("    sipush ").append(num).append("\n");
        } else {
            jasminCode.append("    ldc ").append(num).append("\n");
        }
        pushStack(1);
        
        return "";
    }
    
    @Override
    public String visitExprAritParentesis(EPPParser.ExprAritParentesisContext ctx) {
        return visit(ctx.expresionAritmetica());
    }
    
    @Override
    public String visitCondicional(EPPParser.CondicionalContext ctx) {
        String elseLabel = newLabel("else");
        String endLabel = newLabel("end_if");
        
        // Evaluar condición y saltar al else si es falsa
        visitConditionForBranch(ctx.expresionBooleana(), elseLabel);
        
        // Bloque del 'si'
        visit(ctx.bloque(0));
        
        if (ctx.bloque().size() > 1) {
            // Hay un bloque 'no' (else)
            jasminCode.append("    goto ").append(endLabel).append("\n");
            jasminCode.append(elseLabel).append(":\n");
            visit(ctx.bloque(1));
            jasminCode.append(endLabel).append(":\n");
        } else {
            // No hay bloque 'no'
            jasminCode.append(elseLabel).append(":\n");
        }
        
        return "";
    }
    
    @Override
    public String visitLeer(EPPParser.LeerContext ctx) {
        String varName = ctx.VARIABLE().getText();
        SymbolTable.Variable var = symbolTable.declareVariable(varName, SymbolTable.VarType.INT);
        
        // Crear un Scanner para leer desde System.in
        jasminCode.append("    ; Leer entrada del usuario\n");
        jasminCode.append("    new java/util/Scanner\n");
        pushStack(1);
        jasminCode.append("    dup\n");
        pushStack(1);
        jasminCode.append("    getstatic java/lang/System/in Ljava/io/InputStream;\n");
        pushStack(1);
        jasminCode.append("    invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V\n");
        popStack(2);
        jasminCode.append("    invokevirtual java/util/Scanner/nextInt()I\n");
        popStack(1);
        pushStack(1);
        generateIstore(var.localIndex);
        popStack(1);
        
        return "";
    }
    
    @Override
    public String visitMientras(EPPParser.MientrasContext ctx) {
        String startLabel = newLabel("while_start");
        String endLabel = newLabel("while_end");
        
        jasminCode.append(startLabel).append(":\n");
        
        // Evaluar condición y saltar si es falsa
        visitConditionForBranch(ctx.expresionBooleana(), endLabel);
        
        // Bloque del while
        visit(ctx.bloque());
        
        jasminCode.append("    goto ").append(startLabel).append("\n");
        jasminCode.append(endLabel).append(":\n");
        
        return "";
    }
    
    @Override
    public String visitPara(EPPParser.ParaContext ctx) {
        String varName = ctx.VARIABLE().getText();
        SymbolTable.Variable var = symbolTable.declareVariable(varName, SymbolTable.VarType.INT);
        
        // Inicializar variable del bucle
        visit(ctx.expresionAritmetica(0)); // desde
        generateIstore(var.localIndex);
        popStack(1);
        
        String startLabel = newLabel("for_start");
        String endLabel = newLabel("for_end");
        
        jasminCode.append(startLabel).append(":\n");
        
        // Condición: variable < hasta
        generateIload(var.localIndex);
        pushStack(1);
        visit(ctx.expresionAritmetica(1)); // hasta
        jasminCode.append("    if_icmpge ").append(endLabel).append("\n");
        popStack(2);
        
        // Bloque del for
        visit(ctx.bloque());
        
        // Incrementar variable
        generateIload(var.localIndex);
        pushStack(1);
        
        if (ctx.expresionAritmetica().size() > 2) {
            visit(ctx.expresionAritmetica(2)); // paso explícito
        } else {
            jasminCode.append("    iconst_1\n"); // paso por defecto = 1
            pushStack(1);
        }
        
        jasminCode.append("    iadd\n");
        popStack(1);
        generateIstore(var.localIndex);
        popStack(1);
        
        jasminCode.append("    goto ").append(startLabel).append("\n");
        jasminCode.append(endLabel).append(":\n");
        
        return "";
    }
    
    // ===== EXPRESIONES BOOLEANAS =====
    
    @Override
    public String visitExprBooleanaOr(EPPParser.ExprBooleanaOrContext ctx) {
        String trueLabel = newLabel("or_true");
        String endLabel = newLabel("or_end");
        
        // Si la primera es verdadera, resultado es verdadero
        visitBooleanExpressionWithLabels(ctx.expresionBooleana(0), trueLabel, null);
        
        // Si llegamos aquí, la primera era falsa, evaluar la segunda
        visitBooleanExpressionWithLabels(ctx.expresionBooleana(1), trueLabel, null);
        
        // Ambas son falsas
        jasminCode.append("    iconst_0\n");
        pushStack(1);
        jasminCode.append("    goto ").append(endLabel).append("\n");
        
        jasminCode.append(trueLabel).append(":\n");
        jasminCode.append("    iconst_1\n");
        pushStack(1);
        
        jasminCode.append(endLabel).append(":\n");
        
        return "";
    }
    
    @Override
    public String visitExprBooleanaAnd(EPPParser.ExprBooleanaAndContext ctx) {
        String falseLabel = newLabel("and_false");
        String endLabel = newLabel("and_end");
        
        // Si la primera es falsa, resultado es falso
        visitBooleanExpressionWithLabels(ctx.expresionBooleana(0), null, falseLabel);
        
        // Si llegamos aquí, la primera era verdadera, evaluar la segunda
        visitBooleanExpressionWithLabels(ctx.expresionBooleana(1), null, falseLabel);
        
        // Ambas son verdaderas
        jasminCode.append("    iconst_1\n");
        pushStack(1);
        jasminCode.append("    goto ").append(endLabel).append("\n");
        
        jasminCode.append(falseLabel).append(":\n");
        jasminCode.append("    iconst_0\n");
        pushStack(1);
        
        jasminCode.append(endLabel).append(":\n");
        
        return "";
    }
    
    @Override
    public String visitExprBooleanaNot(EPPParser.ExprBooleanaNotContext ctx) {
        String trueLabel = newLabel("not_true");
        String endLabel = newLabel("not_end");
        
        // Evaluar la expresión y negar el resultado
        visitBooleanExpressionWithLabels(ctx.expresionBooleana(), null, trueLabel);
        
        // La expresión era verdadera, devolver falso
        jasminCode.append("    iconst_0\n");
        pushStack(1);
        jasminCode.append("    goto ").append(endLabel).append("\n");
        
        jasminCode.append(trueLabel).append(":\n");
        jasminCode.append("    iconst_1\n");
        pushStack(1);
        
        jasminCode.append(endLabel).append(":\n");
        
        return "";
    }
    
    @Override
    public String visitExprBooleanaComparacion(EPPParser.ExprBooleanaComparacionContext ctx) {
        String trueLabel = newLabel("cmp_true");
        String endLabel = newLabel("cmp_end");
        
        visit(ctx.expresionComparable(0));
        visit(ctx.expresionComparable(1));
        
        String op = ctx.operadorComparacion().getText();
        switch (op) {
            case ">":
                jasminCode.append("    if_icmpgt ").append(trueLabel).append("\n");
                break;
            case "<":
                jasminCode.append("    if_icmplt ").append(trueLabel).append("\n");
                break;
            case "==":
                jasminCode.append("    if_icmpeq ").append(trueLabel).append("\n");
                break;
            case "!=":
                jasminCode.append("    if_icmpne ").append(trueLabel).append("\n");
                break;
            case ">=":
                jasminCode.append("    if_icmpge ").append(trueLabel).append("\n");
                break;
            case "<=":
                jasminCode.append("    if_icmple ").append(trueLabel).append("\n");
                break;
        }
        popStack(2);
        
        jasminCode.append("    iconst_0\n");
        pushStack(1);
        jasminCode.append("    goto ").append(endLabel).append("\n");
        
        jasminCode.append(trueLabel).append(":\n");
        jasminCode.append("    iconst_1\n");
        pushStack(1);
        
        jasminCode.append(endLabel).append(":\n");
        
        return "";
    }
    
    @Override
    public String visitExprBooleanaVerdadero(EPPParser.ExprBooleanaVerdaderoContext ctx) {
        jasminCode.append("    iconst_1\n");
        pushStack(1);
        return "";
    }
    
    @Override
    public String visitExprBooleanaFalso(EPPParser.ExprBooleanaFalsoContext ctx) {
        jasminCode.append("    iconst_0\n");
        pushStack(1);
        return "";
    }
    
    @Override
    public String visitExprBooleanaParentesis(EPPParser.ExprBooleanaParentesisContext ctx) {
        return visit(ctx.expresionBooleana());
    }
    
    // ===== EXPRESIONES COMPARABLES =====
    
    @Override
    public String visitExprCompAritmetica(EPPParser.ExprCompAritmeticaContext ctx) {
        return visit(ctx.expresionAritmetica());
    }
    
    @Override
    public String visitExprCompString(EPPParser.ExprCompStringContext ctx) {
        String text = ctx.STRING().getText();
        text = text.substring(1, text.length() - 1);
        jasminCode.append("    ldc \"").append(text).append("\"\n");
        pushStack(1);
        return "";
    }
    
    @Override
    public String visitExprCompVerdadero(EPPParser.ExprCompVerdaderoContext ctx) {
        jasminCode.append("    iconst_1\n");
        pushStack(1);
        return "";
    }
    
    @Override
    public String visitExprCompFalso(EPPParser.ExprCompFalsoContext ctx) {
        jasminCode.append("    iconst_0\n");
        pushStack(1);
        return "";
    }
    
    @Override
    public String visitExprCompVariable(EPPParser.ExprCompVariableContext ctx) {
        String varName = ctx.VARIABLE().getText();
        SymbolTable.Variable var = symbolTable.getVariable(varName);
        
        if (var == null) {
            throw new RuntimeException("Variable no declarada: " + varName);
        }
        
        // Usar load apropiado según el tipo
        if (var.type == SymbolTable.VarType.STRING) {
            generateAload(var.localIndex);
        } else {
            generateIload(var.localIndex);
        }
        pushStack(1);
        
        return "";
    }
    
    // ===== EXPRESIONES CON COMPARACIÓN (para asignaciones) =====
    
    @Override
    public String visitExprComparacion(EPPParser.ExprComparacionContext ctx) {
        String trueLabel = newLabel("cmp_true");
        String endLabel = newLabel("cmp_end");
        
        // Verificar si estamos comparando strings
        boolean isStringComparison = isStringExpression(ctx.expresion(0)) || isStringExpression(ctx.expresion(1));
        String op = ctx.operadorComparacion().getText();
        
        if (isStringComparison && (op.equals("==") || op.equals("!="))) {
            // Comparación de strings usando equals
            visit(ctx.expresion(0));
            visit(ctx.expresion(1));
            
            // Llamar a String.equals()
            jasminCode.append("    invokevirtual java/lang/String/equals(Ljava/lang/Object;)Z\n");
            popStack(1); // Queda el resultado boolean en la pila
            
            if (op.equals("!=")) {
                // Invertir el resultado para !=
                jasminCode.append("    iconst_1\n");
                pushStack(1);
                jasminCode.append("    ixor\n");
                popStack(1);
            }
        } else {
            // Comparación de enteros
            visit(ctx.expresion(0));
            visit(ctx.expresion(1));
            
            switch (op) {
                case ">":
                    jasminCode.append("    if_icmpgt ").append(trueLabel).append("\n");
                    break;
                case "<":
                    jasminCode.append("    if_icmplt ").append(trueLabel).append("\n");
                    break;
                case "==":
                    jasminCode.append("    if_icmpeq ").append(trueLabel).append("\n");
                    break;
                case "!=":
                    jasminCode.append("    if_icmpne ").append(trueLabel).append("\n");
                    break;
                case ">=":
                    jasminCode.append("    if_icmpge ").append(trueLabel).append("\n");
                    break;
                case "<=":
                    jasminCode.append("    if_icmple ").append(trueLabel).append("\n");
                    break;
            }
            popStack(2);
            
            jasminCode.append("    iconst_0\n");
            pushStack(1);
            jasminCode.append("    goto ").append(endLabel).append("\n");
            
            jasminCode.append(trueLabel).append(":\n");
            jasminCode.append("    iconst_1\n");
            pushStack(1);
            
            jasminCode.append(endLabel).append(":\n");
        }
        
        return "";
    }
    
    // ===== MÉTODOS AUXILIARES =====
    
    // Método auxiliar para evaluar expresiones booleanas con saltos condicionales
    private void visitConditionForBranch(EPPParser.ExpresionBooleanaContext ctx, String falseLabel) {
        visitBooleanExpressionWithLabels(ctx, null, falseLabel);
    }
    
    // Evaluar expresión booleana y saltar a trueLabel si es verdadera o falseLabel si es falsa
    private void visitBooleanExpressionWithLabels(EPPParser.ExpresionBooleanaContext ctx, 
                                                    String trueLabel, String falseLabel) {
        if (ctx instanceof EPPParser.ExprBooleanaComparacionContext) {
            EPPParser.ExprBooleanaComparacionContext compCtx = (EPPParser.ExprBooleanaComparacionContext) ctx;
            
            EPPParser.ExpresionComparableContext expr0 = compCtx.expresionComparable(0);
            EPPParser.ExpresionComparableContext expr1 = compCtx.expresionComparable(1);
            
            // Verificar si es comparación de strings
            boolean isStringComp = isStringComparable(expr0) || isStringComparable(expr1);
            String op = compCtx.operadorComparacion().getText();
            
            if (isStringComp && (op.equals("==") || op.equals("!="))) {
                // Comparación de strings
                visit(expr0);
                visit(expr1);
                
                jasminCode.append("    invokevirtual java/lang/String/equals(Ljava/lang/Object;)Z\n");
                popStack(1);
                
                if (falseLabel != null) {
                    if (op.equals("==")) {
                        jasminCode.append("    ifeq ").append(falseLabel).append("\n");
                    } else { // !=
                        jasminCode.append("    ifne ").append(falseLabel).append("\n");
                    }
                } else if (trueLabel != null) {
                    if (op.equals("==")) {
                        jasminCode.append("    ifne ").append(trueLabel).append("\n");
                    } else { // !=
                        jasminCode.append("    ifeq ").append(trueLabel).append("\n");
                    }
                }
            } else {
                // Comparación de enteros
                visit(expr0);
                visit(expr1);
                
                if (falseLabel != null) {
                    // Saltar si la condición es falsa
                    switch (op) {
                        case ">":
                            jasminCode.append("    if_icmple ").append(falseLabel).append("\n");
                            break;
                        case "<":
                            jasminCode.append("    if_icmpge ").append(falseLabel).append("\n");
                            break;
                        case "==":
                            jasminCode.append("    if_icmpne ").append(falseLabel).append("\n");
                            break;
                        case "!=":
                            jasminCode.append("    if_icmpeq ").append(falseLabel).append("\n");
                            break;
                        case ">=":
                            jasminCode.append("    if_icmplt ").append(falseLabel).append("\n");
                            break;
                        case "<=":
                            jasminCode.append("    if_icmpgt ").append(falseLabel).append("\n");
                            break;
                    }
                } else if (trueLabel != null) {
                    // Saltar si la condición es verdadera
                    switch (op) {
                        case ">":
                            jasminCode.append("    if_icmpgt ").append(trueLabel).append("\n");
                            break;
                        case "<":
                            jasminCode.append("    if_icmplt ").append(trueLabel).append("\n");
                            break;
                        case "==":
                            jasminCode.append("    if_icmpeq ").append(trueLabel).append("\n");
                            break;
                        case "!=":
                            jasminCode.append("    if_icmpne ").append(trueLabel).append("\n");
                            break;
                        case ">=":
                            jasminCode.append("    if_icmpge ").append(trueLabel).append("\n");
                            break;
                        case "<=":
                            jasminCode.append("    if_icmple ").append(trueLabel).append("\n");
                            break;
                    }
                }
                popStack(2);
            }
        } else if (ctx instanceof EPPParser.ExprBooleanaVerdaderoContext) {
            // Si es literal 'verdadero', no hacer nada (continuar) o saltar al trueLabel
            if (trueLabel != null) {
                jasminCode.append("    goto ").append(trueLabel).append("\n");
            }
        } else if (ctx instanceof EPPParser.ExprBooleanaFalsoContext) {
            // Si es literal 'falso', saltar al falseLabel
            if (falseLabel != null) {
                jasminCode.append("    goto ").append(falseLabel).append("\n");
            }
        } else if (ctx instanceof EPPParser.ExprBooleanaParentesisContext) {
            EPPParser.ExprBooleanaParentesisContext parCtx = (EPPParser.ExprBooleanaParentesisContext) ctx;
            visitBooleanExpressionWithLabels(parCtx.expresionBooleana(), trueLabel, falseLabel);
        } else if (ctx instanceof EPPParser.ExprBooleanaAndContext) {
            EPPParser.ExprBooleanaAndContext andCtx = (EPPParser.ExprBooleanaAndContext) ctx;
            if (falseLabel != null) {
                // Para AND: si la primera es falsa, saltar a falseLabel
                visitBooleanExpressionWithLabels(andCtx.expresionBooleana(0), null, falseLabel);
                // Si llegamos aquí, evaluar la segunda
                visitBooleanExpressionWithLabels(andCtx.expresionBooleana(1), null, falseLabel);
            } else if (trueLabel != null) {
                String nextCheck = newLabel("and_check");
                // Para AND: ambas deben ser verdaderas
                visitBooleanExpressionWithLabels(andCtx.expresionBooleana(0), null, nextCheck);
                visitBooleanExpressionWithLabels(andCtx.expresionBooleana(1), trueLabel, nextCheck);
                jasminCode.append(nextCheck).append(":\n");
            }
        } else if (ctx instanceof EPPParser.ExprBooleanaOrContext) {
            EPPParser.ExprBooleanaOrContext orCtx = (EPPParser.ExprBooleanaOrContext) ctx;
            if (trueLabel != null) {
                // Para OR: si la primera es verdadera, saltar a trueLabel
                visitBooleanExpressionWithLabels(orCtx.expresionBooleana(0), trueLabel, null);
                // Si llegamos aquí, evaluar la segunda
                visitBooleanExpressionWithLabels(orCtx.expresionBooleana(1), trueLabel, null);
            } else if (falseLabel != null) {
                String nextCheck = newLabel("or_check");
                // Para OR: ambas deben ser falsas para saltar a falseLabel
                visitBooleanExpressionWithLabels(orCtx.expresionBooleana(0), nextCheck, null);
                visitBooleanExpressionWithLabels(orCtx.expresionBooleana(1), nextCheck, falseLabel);
                jasminCode.append(nextCheck).append(":\n");
            }
        } else if (ctx instanceof EPPParser.ExprBooleanaNotContext) {
            EPPParser.ExprBooleanaNotContext notCtx = (EPPParser.ExprBooleanaNotContext) ctx;
            // Para NOT: invertir los labels
            visitBooleanExpressionWithLabels(notCtx.expresionBooleana(), falseLabel, trueLabel);
        }
    }
    
    public String getJasminCode() {
        return jasminCode.toString();
    }
}
