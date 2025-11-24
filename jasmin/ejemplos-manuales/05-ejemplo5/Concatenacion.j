.class public Concatenacion
.super java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static main([Ljava/lang/String;)V
    .limit stack 3
    .limit locals 4
    
    ; String texto = "El resultado es: "
    ldc "El resultado es: "
    astore_1
    
    ; int numero = 42
    bipush 42
    istore_2
    
    ; Concatenación usando StringBuilder
    new java/lang/StringBuilder
    dup
    invokespecial java/lang/StringBuilder/<init>()V
    aload_1
    invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    iload_2
    invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;
    invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
    astore_3
    
    ; System.out.println(resultado)
    getstatic java/lang/System/out Ljava/io/PrintStream;
    aload_3
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
    
    return
    
.end method
