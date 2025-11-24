.class public BucleWhile
.super java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static main([Ljava/lang/String;)V
    .limit stack 2
    .limit locals 2
    
    ; int contador = 0
    iconst_0
    istore_1
    
inicio_bucle:
    ; while (contador < 5)
    iload_1
    iconst_5
    if_icmpge fin_bucle
    
    ; System.out.println(contador)
    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload_1
    invokevirtual java/io/PrintStream/println(I)V
    
    ; contador++
    iload_1
    iconst_1
    iadd
    istore_1
    
    ; Volver al inicio del bucle
    goto inicio_bucle
    
fin_bucle:
    return
    
.end method
