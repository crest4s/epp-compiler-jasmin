.class public Multiplicacion
.super java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static main([Ljava/lang/String;)V
    .limit stack 2
    .limit locals 4
    
    ; int a = 7
    bipush 7
    istore_1
    
    ; int b = 8
    bipush 8
    istore_2
    
    ; int resultado = a * b
    iload_1
    iload_2
    imul
    istore_3
    
    ; System.out.println(resultado)
    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload_3
    invokevirtual java/io/PrintStream/println(I)V
    
    return
    
.end method
