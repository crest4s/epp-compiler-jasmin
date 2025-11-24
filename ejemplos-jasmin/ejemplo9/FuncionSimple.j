.class public FuncionSimple
.super java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static main([Ljava/lang/String;)V
    .limit stack 1
    .limit locals 1
    
    ; Llamar a la función saludar()
    invokestatic FuncionSimple/saludar()V
    
    return
    
.end method

; Función saludar sin parámetros ni retorno
.method public static saludar()V
    .limit stack 2
    .limit locals 0
    
    ; System.out.println("Hola desde la función")
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "Hola desde la función"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
    
    return
    
.end method
