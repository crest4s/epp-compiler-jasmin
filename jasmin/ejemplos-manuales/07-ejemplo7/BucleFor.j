.class public BucleFor
.super java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static main([Ljava/lang/String;)V
    .limit stack 2
    .limit locals 2
    
    ; int i = 1 (inicialización)
    iconst_1
    istore_1
    
inicio_bucle:
    ; Condición: i <= 5
    iload_1
    iconst_5
    if_icmpgt fin_bucle
    
    ; System.out.println(i)
    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload_1
    invokevirtual java/io/PrintStream/println(I)V
    
    ; i++ (incremento)
    iload_1
    iconst_1
    iadd
    istore_1
    
    ; Volver al inicio del bucle
    goto inicio_bucle
    
fin_bucle:
    return
    
.end method
