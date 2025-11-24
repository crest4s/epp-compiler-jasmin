# Ejemplo 12: Función Con Varios Parámetros

## Descripción
Define y llama a una función que recibe múltiples parámetros y devuelve un resultado.

## Código de Alto Nivel
```java
public class FuncionVariosParametros {
    public static void main(String[] args) {
        int resultado = sumar(10, 20, 30);
        System.out.println("La suma es: " + resultado);
    }
    
    public static int sumar(int a, int b, int c) {
        return a + b + c;
    }
}
```

## Salida Esperada
```
La suma es: 60
```
