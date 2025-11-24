.class public IfAnidados
.super java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static main([Ljava/lang/String;)V
    .limit stack 2
    .limit locals 2
    
    ; int numero = 15
    bipush 15
    istore_1
    
    ; if (numero > 10)
    iload_1
    bipush 10
    if_icmple else1
    
    ; Bloque if externo
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "Mayor que 10"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
    
    ; if (numero < 20) anidado
    iload_1
    bipush 20
    if_icmpge else2
    
    ; Bloque if interno
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "Menor que 20"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
    goto fin
    
else2:
    ; Bloque else interno
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "Mayor o igual a 20"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
    goto fin
    
else1:
    ; Bloque else externo
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "Menor o igual a 10"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
    
fin:
    return
    
.end method
