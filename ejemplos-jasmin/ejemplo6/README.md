# Ejemplo 6: IF Anidados

## Descripción
Utiliza condicionales IF anidados para clasificar un número.

## Código de Alto Nivel
```java
public class IfAnidados {
    public static void main(String[] args) {
        int numero = 15;
        
        if (numero > 10) {
            System.out.println("Mayor que 10");
            if (numero < 20) {
                System.out.println("Menor que 20");
            } else {
                System.out.println("Mayor o igual a 20");
            }
        } else {
            System.out.println("Menor o igual a 10");
        }
    }
}
```

## Salida Esperada
```
Mayor que 10
Menor que 20
```
