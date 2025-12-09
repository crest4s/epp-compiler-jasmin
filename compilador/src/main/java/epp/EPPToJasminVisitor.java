package epp;

import org.antlr.v4.runtime.tree.ParseTree;
import java.util.HashMap;
import java.util.Map;

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
    public String visitMientras(EPPParser.MientrasContext ctx) {
        String startLabel = newLabel("while_start");
        String endLabel = newLabel("while_end");
        
        jasminCode.append(startLabel).append(":\n");
        
        // Evaluar condición y saltar si es falsa
        String condCode = visitCondition(ctx.expresionBooleana(), endLabel);
        jasminCode.append(condCode);
        
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
    
    // Generar código de comparación (salta a falseLabel si la condición es falsa)
    private String visitCondition(EPPParser.ExpresionBooleanaContext ctx, String falseLabel) {
        StringBuilder code = new StringBuilder();
        
        if (ctx instanceof EPPParser.ExprBooleanaComparacionContext) {
            EPPParser.ExprBooleanaComparacionContext compCtx = (EPPParser.ExprBooleanaComparacionContext) ctx;
            
            visit(compCtx.expresionComparable(0));
            visit(compCtx.expresionComparable(1));
            
            String op = compCtx.operadorComparacion().getText();
            switch (op) {
                case ">":
                    code.append("    if_icmple ").append(falseLabel).append("\n");
                    break;
                case "<":
                    code.append("    if_icmpge ").append(falseLabel).append("\n");
                    break;
                case "==":
                    code.append("    if_icmpne ").append(falseLabel).append("\n");
                    break;
                case "!=":
                    code.append("    if_icmpeq ").append(falseLabel).append("\n");
                    break;
                case ">=":
                    code.append("    if_icmplt ").append(falseLabel).append("\n");
                    break;
                case "<=":
                    code.append("    if_icmpgt ").append(falseLabel).append("\n");
                    break;
            }
            popStack(2);
        }
        
        return code.toString();
    }
    
    public String getJasminCode() {
        return jasminCode.toString();
    }
}
