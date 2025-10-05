# ☕ Clase 05 | Programación Orientada a Objetos (POO)

---

## 📚 Índice

### Clase 5 | Programación Orientada a Objetos (POO)
- Paradigmas de programación: estructurada vs. POO.
- Clases, objetos y atributos.
- Creación de clases y objetos en Java.
- Métodos de instancia y de clase.
- Constructores y métodos especiales.

### Clase 6 | Encapsulamiento y Colaboración entre Clases
- Encapsulamiento y visibilidad (`public`, `private`, `protected`).
- Métodos de acceso (getters y setters).
- Colaboración entre clases.
- Objetos dentro de objetos.
- Variables de clase (`static`).

---

## 🎯 Objetivos de la Clase

### Comprender Paradigmas
- Distinguir entre **programación estructurada** y **orientada a objetos**.

### Clases y Objetos
- Comprender qué son y cómo representan entidades del mundo real.

### Métodos
- Diferenciar **métodos de instancia** y **de clase**.

### Constructores
- Conocer su función en la **inicialización de objetos**.

---

## ☕ Introducción a la POO

La **Programación Orientada a Objetos (POO)** es un **paradigma** que utiliza **objetos** como unidades fundamentales del programa.

Los objetos encapsulan **datos** y **comportamientos**, facilitando:
- **Organización del código**
- **Reutilización**
- **Mantenimiento**
- **Modularidad**

### 🔑 Características principales
- **Encapsulamiento**: Los datos están protegidos dentro del objeto.
- **Abstracción**: Oculta la complejidad interna y expone solo lo necesario.
- **Herencia**: Crear nuevas clases basadas en otras existentes.
- **Polimorfismo**: Objetos de distintas clases pueden comportarse de forma similar.

---

## 🆚 Programación Estructurada vs POO

**Estructurada**
- Se basa en funciones y procedimientos secuenciales.
- Los datos y las operaciones están separados.

**POO**
- Organiza el código en **objetos** que contienen **datos y comportamiento**.
- Representa el software como **interacciones de entidades del mundo real**.

---

## 🏗️ Clases y Objetos

Las **clases** son plantillas o **blueprints** que definen estructura y comportamiento.  
Los **objetos** son **instancias** de esas clases.

🔹 Ejemplo:
```java
public class Producto {
    String nombre;
    double precio;
    int cantidadEnStock;
}
```

### Creación de Objetos
```java
Producto producto = new Producto();
producto.nombre = "Producto Premium";
producto.precio = 250.0;
producto.cantidadEnStock = 100;
```

---

## 📦 Métodos en las Clases

Los **métodos** definen **comportamientos** de los objetos.

```java
public class Producto {
    String nombre;
    double precio;
    int cantidadEnStock;

    // Método de instancia
    public void descontarStock(int cantidad) {
        this.cantidadEnStock -= cantidad;
    }

    // Método de clase (static)
    public static double calcularImpuesto(double precio) {
        return precio * 0.21;
    }
}
```

---

## 🏗️ Constructores en Java

Un **constructor** inicializa los objetos al crearlos.

```java
public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
}
```

Si no se define un constructor, Java crea uno por defecto.

---

## 💻 Ejemplo: Clase Café

```java
public class Cafe {
    // Atributos
    private String nombre;
    private double precio;
    private String tamaño;
    private boolean conLeche;
    private int cantidadStock;

    // Constructor
    public Cafe(String nombre, double precio, String tamaño, boolean conLeche, int cantidadStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.tamaño = tamaño;
        this.conLeche = conLeche;
        this.cantidadStock = cantidadStock;
    }

    // Método para calcular precio final
    public double calcularPrecio() {
        double precioFinal = this.precio;
        if (this.conLeche) {
            precioFinal += 50;
        }
        return precioFinal;
    }
}
```

---

## 📚 Recursos Adicionales
- 📄 [Documentación de Java](https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html)
- ▶️ [Organización del Código con Métodos (YouTube)](https://youtube.com/playlist?list=PL954bYq0HsCXlwPGM2k2nxRVztHOwpPqc&si=GfIFagrxE_BjMaw4)

---

## 📝 Ejercicios Prácticos

### Situación en TechLab
Silvia (PO) observa que el código del e-commerce es difícil de mantener por el uso de funciones globales.  
Matías y Sabrina deciden **migrar a POO** para representar entidades como **productos, clientes y pedidos**.

---

### Ejercicio Obligatorio

#### 🟢 Creación de Clases y Objetos
- Crear una clase **Cliente** con atributos `nombre` y `email`.
- Instanciar un objeto **Cliente** y asignar valores.

#### 🟢 Métodos
- En la clase **Producto**, agregar un método `mostrarInformacion()` que imprima **nombre, precio y stock**.

#### 🟢 Más Métodos
- Agregar un método en **Producto** que calcule un **descuento general del 10%**.  
  Probarlo con distintos precios.

#### 🟢 Constructores
- Crear un **constructor para Cliente** que reciba `nombre` y `email`.
- Crear varios clientes con este constructor y mostrarlos en pantalla.

---

## ✅ Reflexiones Finales
- La POO permite modelar **entidades reales** con datos y comportamiento.
- Mejora la **organización, escalabilidad y reutilización** del código.
