# ☕ Clase 06 | Encapsulamiento y Colaboración entre Clases

---

## 📚 Índice

### Clase 6 | Encapsulamiento y Colaboración entre Clases
- Encapsulamiento y visibilidad (`public`, `private`, `protected`).
- Métodos de acceso (getters y setters).
- Colaboración entre clases.
- Objetos dentro de objetos.
- Variables de clase (`static`).

### Clase 7 | Herencia y Polimorfismo
- Concepto de herencia en Java.
- Creación de subclases y superclases.
- Uso de `super` y `this`.
- Polimorfismo y sobreescritura de métodos.
- Clases abstractas e interfaces.
- Ejemplos prácticos aplicados al proyecto.

---

## 🎯 Objetivos de la Clase

### Encapsulamiento
- Entender visibilidades **`public`**, **`private`** y **`protected`**.

### Métodos de Acceso
- Aprender a usar **getters** y **setters**.

### Colaboración
- Explorar la interacción entre clases y objetos.

### Variables de Clase
- Comprender el uso de variables **estáticas**.

---

## 🔐 Encapsulamiento

El **encapsulamiento** es un principio fundamental en la **programación orientada a objetos** que protege los datos de una clase y controla el acceso a ellos.  
En Java, este control se logra a través de **modificadores de acceso** como `public`, `private` y `protected`.

- `public`: accesible desde cualquier parte del programa.
- `private`: accesible solo dentro de la clase.
- `protected`: accesible desde la clase, sus subclases y las clases del mismo paquete.

---

## 👁️‍🗨️ Tipos de Visibilidad

### 🔓 Public
Permite acceso total desde cualquier clase o paquete del programa.  
Ofrece máxima visibilidad pero menor encapsulamiento.

### 🔒 Private
Restringe el acceso exclusivamente a los métodos de la propia clase.  
Proporciona el máximo nivel de encapsulamiento y seguridad.

### 🛡 Protected
Permite acceso desde la misma clase, sus clases heredadas y otras clases del mismo paquete.  
Ofrece un nivel intermedio de protección.

---

## 🛠 Métodos de Acceso: Getters y Setters

Los **getters y setters** son métodos especiales que nos permiten acceder y modificar los **atributos privados** de una clase de manera controlada y segura.

### Getter
Método que permite **obtener** el valor de un atributo privado de forma controlada.

```java
public class Producto {
  private double precio;

  public double getPrecio() {
    return precio;
  }
}
```

### Setter
Método que permite **modificar** el valor de un atributo privado de manera segura.

```java
public class Producto {
  private double precio;

  public void setPrecio(double precio) {
    if (precio >= 0) {
      this.precio = precio;
    }
  }
}
```

---

## 🚨 ¿Por qué necesitamos proteger nuestros datos?

### ⚠ Código Vulnerable (Sin Encapsulamiento)
Cuando los atributos son **públicos**, cualquier parte del programa puede modificarlos directamente:

```java
producto.precio = -100; // Precio inválido
```

### ✅ Solución (Con Encapsulamiento)
Se definen atributos **privados** y se accede a ellos mediante **métodos de acceso** controlados:

```java
producto.setPrecio(200); // Valida el dato antes de asignar
```

### 💡 Beneficios
- Protege datos contra errores.
- Garantiza valores correctos.
- El código es más seguro y mantenible.

---

## 🔗 Colaboración entre Clases

En sistemas reales, las clases interactúan entre sí. Por ejemplo, en un sistema de ventas, la clase `Pedido` se relaciona con `Producto`, `Cliente` y otras clases.

### 📝 Problema: Sistema de Gestión de Pedidos
Queremos implementar un sistema donde un **Pedido** contenga múltiples **Productos**.

```java
import java.util.ArrayList;

public class Pedido {
  private ArrayList<Producto> productos = new ArrayList<>();

  public void agregarProducto(Producto p) {
    productos.add(p);
  }

  public double calcularTotal() {
    double total = 0;
    for (Producto p : productos) {
      total += p.getPrecio();
    }
    return total;
  }
}
```

---

## ⚙️ Variables Estáticas

Una **variable estática** pertenece a la **clase** y no a un objeto específico.  
Se comparte entre todas las instancias de la clase.

### 🔢 Ejemplo: Contador de Productos

```java
public class Producto {
  private static int contadorProductos = 0;

  public Producto() {
    contadorProductos++;
  }

  public static int getContadorProductos() {
    return contadorProductos;
  }
}
```

Cada vez que se crea un nuevo objeto `Producto`, el contador se incrementa.  
El valor es **compartido** por todas las instancias.

---

## 📦 Materiales y Recursos Adicionales
- Documentación Java: Encapsulamiento y modificadores de acceso.
- Conceptos OOP: Encapsulación y colaboración.
- Videos YouTube: Tutoriales sobre getters, setters y composición.

---

## 📌 Resumen de Conceptos Clave

| Concepto              | Descripción                             |
|-----------------------|-----------------------------------------|
| Encapsulamiento       | Protección de datos internos            |
| Getters y Setters     | Control de acceso a atributos           |
| Colaboración          | Interacción entre objetos               |
| Variables Estáticas   | Datos compartidos por clase             |

---

## Diagrama en Clase
![diagrama](diagrama.png)

---

## 📝 Ejercicios Prácticos

### 🟩 Situación Inicial en TechLab

Silvia, la Product Owner, notó que algunos datos del sistema se modificaban de manera impredecible:
- Algunos productos tenían precios negativos.
- Algunos clientes tenían emails vacíos.

Matías y Sabrina decidieron **proteger los datos** y permitir que las clases **colaboren** entre sí.  
Además, quieren contar cuántos productos se crean en total.

---

## 🚀 Ejercicio Obligatorio 1 – Encapsulamiento

1. Convertí los atributos de **Cliente** a `private`.
2. Creá **getters y setters** para `nombre` y `email`.
3. Validá que el `email` contenga un `@` antes de asignarlo.

---

## 🚀 Ejercicio Obligatorio 2 – Colaboración entre Clases

1. Creá una clase **Carrito** que contenga un `ArrayList<Producto>`.
2. Agregá métodos para **sumar productos** y **calcular el total**.
3. Demostrá su uso creando un carrito, agregando productos y mostrando el total.

---

## 🚀 Ejercicio Obligatorio 3 – Variables Static

1. En **Producto**, agregá una **variable estática** para contar cuántos productos se crean.
2. Mostrá ese valor luego de instanciar varios productos.
3. En el setter de `cantidadEnStock`, evitá valores negativos.

---

## 🔥 Reflexión Final
El encapsulamiento mejora la **seguridad**, las variables estáticas permiten **datos compartidos**, y la colaboración entre clases facilita el **diseño de sistemas escalables**.

---
