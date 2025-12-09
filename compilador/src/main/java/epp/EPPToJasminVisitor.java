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
        
        SymbolTable.Variable var = symbolTable.declareVariable(varName, SymbolTable.VarType.UNKNOWN);
        
        visit(ctx.expresion());
        jasminCode.append("    istore_").append(var.localIndex).append("\n");
        popStack(1);
        
        return "";
    }
    
    @Override
    public String visitAsignacionSimple(EPPParser.AsignacionSimpleContext ctx) {
        String varName = ctx.VARIABLE().getText();
        
        SymbolTable.Variable var = symbolTable.declareVariable(varName, SymbolTable.VarType.UNKNOWN);
        
        visit(ctx.expresion());
        jasminCode.append("    istore_").append(var.localIndex).append("\n");
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
            return primCtx.expresionPrimaria() instanceof EPPParser.ExprTextoContext;
        }
        return false;
    }
    
    @Override
    public String visitExprNumero(EPPParser.ExprNumeroContext ctx) {
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
    public String visitExprNumeroNegativo(EPPParser.ExprNumeroNegativoContext ctx) {
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
    public String visitExprVariable(EPPParser.ExprVariableContext ctx) {
        String varName = ctx.VARIABLE().getText();
        SymbolTable.Variable var = symbolTable.getVariable(varName);
        
        if (var == null) {
            throw new RuntimeException("Variable no declarada: " + varName);
        }
        
        jasminCode.append("    iload_").append(var.localIndex).append("\n");
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
        visit(ctx.expresion(0));
        visit(ctx.expresion(1));
        
        String op = ctx.operadorMultiplicativo().getText();
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
        visit(ctx.expresionAritmetica(0));
        visit(ctx.expresionAritmetica(1));
        
        String op = ctx.operadorMultiplicativo().getText();
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
        
        jasminCode.append("    iload_").append(var.localIndex).append("\n");
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
        SymbolTable.Variable var = symbolTable.declareVariable(varName, SymbolTable.VarType.UNKNOWN);
        
        // TODO: Implementar lectura de entrada
        // Por ahora, simplemente asignamos 0
        jasminCode.append("    iconst_0\n");
        pushStack(1);
        jasminCode.append("    istore_").append(var.localIndex).append("\n");
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
        jasminCode.append("    istore_").append(var.localIndex).append("\n");
        popStack(1);
        
        String startLabel = newLabel("for_start");
        String endLabel = newLabel("for_end");
        
        jasminCode.append(startLabel).append(":\n");
        
        // Condición: variable < hasta
        jasminCode.append("    iload_").append(var.localIndex).append("\n");
        pushStack(1);
        visit(ctx.expresionAritmetica(1)); // hasta
        jasminCode.append("    if_icmpge ").append(endLabel).append("\n");
        popStack(2);
        
        // Bloque del for
        visit(ctx.bloque());
        
        // Incremento: variable + paso
        jasminCode.append("    iload_").append(var.localIndex).append("\n");
        pushStack(1);
        
        if (ctx.expresionAritmetica().size() > 2) {
            visit(ctx.expresionAritmetica(2)); // paso explícito
        } else {
            jasminCode.append("    iconst_1\n"); // paso por defecto = 1
            pushStack(1);
        }
        
        jasminCode.append("    iadd\n");
        popStack(1);
        jasminCode.append("    istore_").append(var.localIndex).append("\n");
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
        
        jasminCode.append("    iload_").append(var.localIndex).append("\n");
        pushStack(1);
        
        return "";
    }
    
    // ===== EXPRESIONES CON COMPARACIÓN (para asignaciones) =====
    
    @Override
    public String visitExprComparacion(EPPParser.ExprComparacionContext ctx) {
        String trueLabel = newLabel("cmp_true");
        String endLabel = newLabel("cmp_end");
        
        visit(ctx.expresion(0));
        visit(ctx.expresion(1));
        
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
            
            visit(compCtx.expresionComparable(0));
            visit(compCtx.expresionComparable(1));
            
            String op = compCtx.operadorComparacion().getText();
            
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
