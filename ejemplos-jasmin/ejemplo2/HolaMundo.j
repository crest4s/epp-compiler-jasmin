.class public HolaMundo
.super java/lang/Object

; Constructor por defecto
.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

; Método main
.method public static main([Ljava/lang/String;)V
    .limit stack 2
    .limit locals 1
    
    ; System.out.println("Hola, mundo!")
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "Hola, mundo!"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
    
    return
    
.end method
