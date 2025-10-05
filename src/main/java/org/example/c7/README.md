# 📘 Clase 07 | Herencia y Polimorfismo

---

## 📑 Índice

- Clase 7 | Herencia y Polimorfismo
    - Concepto de herencia en Java.
    - Creación de subclases y superclases.
    - Uso de super y this.
    - Polimorfismo y sobreescritura de métodos.
    - Clases abstractas e interfaces.
    - Ejemplos prácticos aplicados al proyecto.

- Clase 8 | Manejo de Excepciones y Módulos
    - Manejo de excepciones en Java.
    - Uso de try, catch, finally.
    - Creación de excepciones personalizadas.
    - Organización del código con paquetes y módulos.
    - Importación y uso de clases externas.

---

## 🎯 Objetivos de la Clase

- Comprender la herencia
- Entender qué es una superclase, una subclase y cómo se relacionan.
- Crear subclases
- Aprender a extender una superclase usando `extends`.
- Explorar el polimorfismo
- Tratar diferentes subclases a través de una referencia de la superclase.

---

## 🟢 Herencia

### 🔹 Concepto de Herencia en Java
La herencia es uno de los pilares fundamentales de la programación orientada a objetos en Java. Es un mecanismo que permite que una clase (llamada **subclase** o **clase hija**) pueda heredar características y comportamientos de otra clase (llamada **superclase** o **clase padre**).

### 🔹 Superclase y Subclase

**Superclase**:  
Es aquella que contiene los atributos y métodos comunes que serán heredados por otras clases.  
Ejemplo: una clase `Vehículo` podría ser una superclase que define características básicas como `color`, `marca` y `modelo`.

**Subclases**:  
Son aquellas que heredan todas estas características de la superclase y pueden agregar sus propios atributos y métodos específicos.  
Ejemplo: `Automóvil` y `Motocicleta` podrían ser subclases de `Vehículo`, agregando características específicas como `número de puertas` o `tipo de manubrio`.

### ✅ Beneficios de la Herencia
- **Reutilización de Código:** evita duplicar código al reutilizar las características y comportamientos de una superclase.
- **Organización:** estructura el código de manera lógica, formando una jerarquía de clases.
- **Extensibilidad:** facilita agregar nuevas características o funcionalidades a las subclases.
- **Mantenimiento:** simplifica la modificación y el mantenimiento del código al centralizar cambios en la superclase.

---

## 🟢 Creación de Subclases y Superclases

Ejemplo:

```java
class Producto {
    String nombre;
    double precio;
}

class Bebida extends Producto {
    int volumenML;
}

class Comida extends Producto {
    int pesoGramos;
}
```

---

## 🟢 Uso de `super` y `this`

### 🔹 `this`
Hace referencia al objeto actual. Se usa para acceder a atributos y métodos de la clase actual.

```java
class Producto {
    String nombre;
    
    Producto(String nombre) {
        this.nombre = nombre;    // 'this' referencia al atributo de la clase
    }
    
    void mostrarInfo() {
        this.imprimirNombre();   // 'this' llama a método de la clase
    }
}
```

### 🔹 `super`
Hace referencia a la superclase. Se usa para llamar al constructor o métodos de la superclase.

```java
class Bebida extends Producto {
    int volumenML;
    Bebida(String nombre, int volumenML) {
        super(nombre);           // Llama al constructor de Producto
        this.volumenML = volumenML;
    }
    @Override
    void mostrarInfo() {
        super.mostrarInfo();     // Llama al método de Producto
        System.out.println("Volumen: " + volumenML);
    }
}
```

---

## 🟢 Polimorfismo

El **polimorfismo** permite que un objeto pueda comportarse de diferentes formas según el contexto.  
Permite tratar objetos de diferentes clases a través de una interfaz común.

### 💡 Ejemplo
```java
Producto[] productos = {
    new Comida("Pizza", 10, 20240510),
    new Bebida("Jugo de naranja", 5, 1000),
    new Comida("Hamburguesa", 8, 20240515)
};

for (Producto producto : productos) {
    if (producto instanceof Comida) {
        Comida comida = (Comida) producto;
        System.out.println("Comida: " + comida.getNombre());
    } else if (producto instanceof Bebida) {
        Bebida bebida = (Bebida) producto;
        System.out.println("Bebida: " + bebida.getNombre());
    }
}
```

---

## 🟢 Clases Abstractas

Una clase **abstracta** es una clase que no puede ser instanciada directamente.  
Sirve como **plantilla** para otras clases.

```java
abstract class Figura {
    protected String nombre;
    public abstract double calcularArea();
    public String getNombre() {
        return nombre;
    }
}

class Circulo extends Figura {
    private double radio;
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
```

---

## 🟢 Interfaces

Una **interface** actúa como un contrato formal que especifica qué métodos debe implementar una clase.

```java
public interface Volador {
    void volar();
}

public class Pajaro implements Volador {
    @Override
    public void volar() {
        System.out.println("El pájaro está volando.");
    }
}
```

---

## 📝 Ejercicios Prácticos

### 🔹 Situación inicial en TechLab
Silvia, la Product Owner, observa que actualmente hay una sola clase Producto, pero el catálogo ha crecido y cada tipo de producto tiene características y reglas distintas.

Matías y Sabrina deciden usar **herencia, polimorfismo, clases abstractas e interfaces** para resolverlo.

### 🚀 Ejercicio 1: Herencia y Polimorfismo
1. Creá la clase abstracta `Producto` con un atributo `nombre` y un método abstracto `calcularPrecioFinal()`.
2. Creá `Te` y `Cafe` que extiendan `Producto`.
3. Implementá `calcularPrecioFinal()` en cada subclase.
4. Creá un `ArrayList<Producto>` y agregá instancias de `Te` y `Cafe`.
5. Iterá sobre la lista y llama a `calcularPrecioFinal()` en cada uno.

### 🚀 Ejercicio 2: Override e Interfaces
1. En `Cafe`, agregá un constructor que llame a `super(...)`.
2. Sobrescribí algún método de `Producto` y llamá a `super`.
3. Creá la interfaz `Descontable` con el método `aplicarDescuento(double porcentaje)`.
4. Hacé que `Te` y `Cafe` la implementen.
5. Probá aplicar descuentos a diferentes productos.

---

## 📚 Materiales y Recursos
- Documentación Oracle sobre Herencia y Polimorfismo.
- Tutoriales en YouTube.
- Libros de POO avanzada en Java.

---

## 🔥 Preguntas para Reflexionar
- ¿Cómo evita la herencia la duplicación de código?
- ¿En qué casos usarías una clase abstracta versus una interfaz?
- ¿Cómo simplifica el polimorfismo el manejo de colecciones de objetos relacionados?

---

## 🏆 Conclusión
La **herencia** y el **polimorfismo** son herramientas fundamentales para construir sistemas escalables y mantenibles.  
¡Practicar estos conceptos es clave para dominar la POO en Java!
