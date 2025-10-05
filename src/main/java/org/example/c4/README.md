## Clase 04 | Funciones y Modularización

### Índice

* Clase 4 | Funciones y Modularización

    * Concepto de funciones (métodos) en Java.
    * Declaración y llamada de funciones.
    * Parámetros y argumentos.
    * Paso por valor y referencia.
    * Sobrecarga de métodos.
    * Buenas prácticas de modularización.
* Clase 5 | Programación Orientada a Objetos (POO)

    * Paradigmas de programación: estructurada vs. POO.
    * Clases, objetos y atributos.
    * Creación de clases y objetos en Java.
    * Métodos de instancia y de clase.
    * Constructores y métodos especiales.

## Objetivos de la Clase

### Entender funciones

Comprender qué son las funciones en Java y cómo se diferencian de otras partes del código.

### Declarar y llamar métodos

Aprender a declarar y llamar métodos, entendiendo parámetros y argumentos.

### Paso por valor

Entender el concepto de paso por valor y su impacto en el comportamiento de los métodos.

### Sobrecarga y modularización

Conocer la sobrecarga de métodos y aplicar buenas prácticas de modularización.

## Funciones

### Introducción a Funciones en Java

Las funciones, también conocidas como métodos en Java, son bloques de código reutilizables que realizan una tarea específica. Funcionan como pequeñas "máquinas" que pueden recibir datos, procesarlos y devolver un resultado.

Las funciones nos permiten:

* Organizar mejor nuestro código dividiéndolo en partes más pequeñas y manejables
* Reutilizar código evitando la repetición
* Hacer nuestros programas más fáciles de mantener y entender

### Ejemplo simple de una función

```java
// Función que suma dos números
public static int sumar(int a, int b) {
    return a + b;
}

// Uso de la función
int resultado = sumar(5, 3);  // resultado = 8
```

## Características de las funciones en Java

* **Reutilización**: El código de una función se puede usar en diferentes partes del programa.
* **Modularidad**: Divide el programa en partes más pequeñas y manejables.
* **Abstracción**: Esconde la complejidad del código interno de la función.

## Programación con Funciones vs. Programación Lineal

**Programación Lineal**
El código se ejecuta de forma secuencial, línea por línea.

**Programación con Funciones**
El código se divide en bloques reutilizables, llamados funciones.

## Declaración de Funciones

```java
public int sumar(int a, int b) {
    int resultado = a + b;
    return resultado;
}
```

## Componentes de una Función en Java

```java
public int calcularTotal(int precio, int cantidad) {
    return precio * cantidad;
}
```

1. **Modificador de Acceso (public)**
2. **Tipo de Retorno (int)**
3. **Nombre (calcularTotal)**
4. **Parámetros (precio, cantidad)**

## Declaración y Llamada de Funciones

* **Declaración de la Función**: Se define en el cuerpo de la clase.
* **Llamada a la Función**: Se invoca desde main o desde otros métodos.

### Ejemplo Práctico

```java
double precioConDescuento = aplicarDescuento(precioOriginal, 15.0);
```

## Parámetros y Argumentos

* **Parámetros**: Variables declarativas en la definición del método.
* **Argumentos**: Valores reales enviados al método durante su ejecución.

### Ejemplo de una función con parámetros

```java
public static double aplicarDescuentoConCantidad(double precio, double porcentaje, int cantidad) {
    double descuentoFinal = porcentaje;
    if (cantidad > 50) {
        descuentoFinal = porcentaje + 5;
    }
    double descuento = precio * (descuentoFinal / 100);
    return precio - descuento;
}
```

## Problema: Imprimir un recibo

```java
public static void imprimirRecibo(String producto, double precioOriginal, double precioFinal) {
    System.out.println("Recibo de Compra");
    System.out.println("Producto: " + producto);
    System.out.println("Precio Original: $" + precioOriginal);
    System.out.println("Precio con Descuento: $" + precioFinal);
}
```

## Problema: Cálculo de Descuentos

```java
public static double aplicarDescuento(double precio, double porcentaje) {
    double descuento = precio * (porcentaje / 100.0);
    double precioFinal = precio - descuento;
    return precioFinal;
}
```

## Sobrecarga de Métodos

```java
// Descuento básico con porcentaje
public static double aplicarDescuento(double precio, double porcentaje) {
    double descuento = precio * (porcentaje / 100.0);
    return precio - descuento;
}

// Descuento con bonus fijo adicional
public static double aplicarDescuento(double precio, double porcentaje, double bonusFijo) {
    double descuento = precio * (porcentaje / 100.0);
    return precio - descuento - bonusFijo;
}
```

## Buenas Prácticas de Modularización

* **Una responsabilidad**
* **Nombres descriptivos**
* **Métodos concisos**
* **Reutilización**

## Recursos Adicionales

* **Documentación oficial**
* **Guía de métodos**: [Oracle Method API](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Method.html)
* **Videos recomendados**: [Organización del Código con Métodos](https://youtube.com/playlist?list=PL954bYq0HsCXlwPGM2k2nxRVztHOwpPqc&si=GfIFagrxE_BjMaw4)

## Reflexiones Finales

* **Facilidad de lectura**
* **Sobrecarga**
* **Beneficios**

## Ejercicios prácticos

### Situación inicial en TechLab

Silvia, la Product Owner, acaba de asignar una nueva tarea al equipo de desarrollo: el sistema debe aplicar distintos tipos de descuentos a los productos según la categoría, la cantidad comprada y el tipo de cliente. Matías y Sabrina se dan cuenta de que el código está creciendo y volviéndose complejo. Necesitan una forma de organizar el código en bloques más pequeños y reusables: las funciones.

Además, habrá escenarios donde será necesario crear métodos con el mismo nombre pero diferentes parámetros, gestionar el impacto de las variables dentro de los métodos y mantener un código claro y fácilmente ampliable.

### Ejercicio Práctico Obligatorio

* **Creación de Funciones**: Escribí un método `calcularImpuesto` que reciba un precio y un porcentaje de impuesto, y devuelva el precio final. Llamá al método desde main con distintos valores.
* **Parámetros y argumentos**: Creá un método `calcularPrecioFinal` que reciba el precio, el descuento y la cantidad. Si la cantidad es mayor a 50, aumentá el descuento. Imprimí el resultado.
* **Array de stock**: Definí un array con el stock de 3 productos. Escribí un método `reponerStock` que sume unidades a un índice específico del array. Mostrá el stock antes y después de la reposición.
* **Sobrecarga de métodos**: Creá dos métodos `mostrarMensaje`: uno recibe una String, otro recibe una String y un int. Usá ambos para imprimir mensajes según si el cliente es nuevo o recurrente.
* **Modularización**: Tomá un código previo y extraé partes en métodos. Comentá por qué ahora es más fácil de leer y mantener.
