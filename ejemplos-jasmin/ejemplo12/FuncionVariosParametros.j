.class public FuncionVariosParametros
.super java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static main([Ljava/lang/String;)V
    .limit stack 3
    .limit locals 2
    
    ; int resultado = sumar(10, 20, 30)
    bipush 10
    bipush 20
    bipush 30
    invokestatic FuncionVariosParametros/sumar(III)I
    istore_1
    
    ; System.out.println("La suma es: " + resultado)
    getstatic java/lang/System/out Ljava/io/PrintStream;
    
    ; Concatenación usando StringBuilder
    new java/lang/StringBuilder
    dup
    invokespecial java/lang/StringBuilder/<init>()V
    ldc "La suma es: "
    invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    iload_1
    invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;
    invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
    
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
    
    return
    
.end method

; Función sumar con tres parámetros enteros
.method public static sumar(III)I
    .limit stack 2
    .limit locals 3
    
    ; return a + b + c
    iload_0    ; Cargar a
    iload_1    ; Cargar b
    iadd       ; a + b
    iload_2    ; Cargar c
    iadd       ; (a + b) + c
    ireturn
    
.end method
