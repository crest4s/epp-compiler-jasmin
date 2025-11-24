.class public FuncionConRetorno
.super java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static main([Ljava/lang/String;)V
    .limit stack 2
    .limit locals 2
    
    ; int resultado = calcular()
    invokestatic FuncionConRetorno/calcular()I
    istore_1
    
    ; System.out.println(resultado)
    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload_1
    invokevirtual java/io/PrintStream/println(I)V
    
    return
    
.end method

; Función calcular que devuelve un entero
.method public static calcular()I
    .limit stack 1
    .limit locals 0
    
    ; return 42
    bipush 42
    ireturn
    
.end method
