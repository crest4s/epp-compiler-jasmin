.class public FuncionConParametro
.super java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static main([Ljava/lang/String;)V
    .limit stack 1
    .limit locals 1
    
    ; mostrarNumero(25)
    bipush 25
    invokestatic FuncionConParametro/mostrarNumero(I)V
    
    return
    
.end method

; Función mostrarNumero con un parámetro entero
.method public static mostrarNumero(I)V
    .limit stack 3
    .limit locals 1
    
    ; System.out.println("El número es: " + num)
    getstatic java/lang/System/out Ljava/io/PrintStream;
    
    ; Concatenación usando StringBuilder
    new java/lang/StringBuilder
    dup
    invokespecial java/lang/StringBuilder/<init>()V
    ldc "El número es: "
    invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    iload_0
    invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;
    invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
    
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
    
    return
    
.end method
