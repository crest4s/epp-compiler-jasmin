.class public OperacionLogica
.super java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static main([Ljava/lang/String;)V
    .limit stack 2
    .limit locals 2
    
    ; Evaluar (5 > 3)
    bipush 5
    bipush 3
    if_icmple falso1
    iconst_1      ; true
    goto siguiente1
falso1:
    iconst_0      ; false
siguiente1:
    istore_1      ; Guardar resultado parcial
    
    ; Si es false, el resultado final es false
    iload_1
    ifeq resultado_falso
    
    ; Evaluar (10 < 20)
    bipush 10
    bipush 20
    if_icmpge falso2
    iconst_1      ; true
    goto resultado_final
falso2:
    iconst_0      ; false
    goto resultado_final
    
resultado_falso:
    iconst_0      ; false
    
resultado_final:
    istore_1      ; Guardar resultado final
    
    ; System.out.println(resultado)
    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload_1
    invokevirtual java/io/PrintStream/println(Z)V
    
    return
    
.end method
