# ☕ Clase 08 | Manejo de Excepciones y Módulos

---

## 📚 Índice
1. Clase 8 | Manejo de Excepciones y Módulos
    - Manejo de excepciones en Java.
    - Uso de try, catch, finally.
    - Creación de excepciones personalizadas.
    - Organización del código con paquetes y módulos.
    - Importación y uso de clases externas.

2. Clase 9 | Introducción a Git y Control de Versiones
    - Conceptos fundamentales de control de versiones.
    - Instalación y configuración de Git.
    - Flujo de trabajo básico con Git:
        - Creación de repositorios.
        - Comandos básicos: add, commit, push.
        - Colaboración en proyectos mediante GitHub.
        - Buenas prácticas de versionado.

---

## 🎯 Objetivos de la Clase
- **Excepciones en Java:** Comprender tipos y manejo de excepciones.
- **Organización del Código:** Aprender sobre paquetes y módulos.
- **Aplicación Práctica:** Resolver problemas reales en TechLab.

---

## ⚠️ Excepciones

### 🔹 Introducción a las Excepciones en Java
Las excepciones en Java son eventos inesperados que interrumpen el flujo normal de ejecución de un programa.  
Permiten manejar errores de forma controlada, evitando que el programa se bloquee.

### 🟩 Uso de try, catch, finally

- **try:** Envuelve el código que podría generar una excepción.
- **catch:** Captura y maneja la excepción si ocurre.
- **finally:** Se ejecuta siempre, independientemente de si hubo excepción o no.

#### Ejemplo:
```java
try {
    FileReader file = new FileReader("archivo.txt");
} catch (FileNotFoundException e) {
    System.out.println("Archivo no encontrado");
} finally {
    System.out.println("Cerrando recursos...");
}
```

### 📂 Tipos de Excepciones en Java
- **Checked Exceptions:** Heredan de `Exception` y requieren manejo explícito.
    - IOException, SQLException, FileNotFoundException.
- **Unchecked Exceptions:** Heredan de `RuntimeException` y no requieren declaración explícita.
    - NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException.

```java
int[] array = new int[3];
try {
    System.out.println(array[5]);
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Índice inválido");
}
```

---

## 🔥 Creación de Excepciones Personalizadas

Permiten crear errores específicos del dominio de la aplicación.

```java
public class ProductoNoEncontradoException extends Exception {
    public ProductoNoEncontradoException(String mensaje) {
        super(mensaje);
    }
}
```

Uso en otra clase:
```java
public class Inventario {
    public Producto buscarProducto(String codigo) throws ProductoNoEncontradoException {
        Producto producto = baseDeDatos.buscar(codigo);
        if (producto == null) {
            throw new ProductoNoEncontradoException(
                "No se encontró el producto con código: " + codigo
            );
        }
        return producto;
    }
}

try {
    Producto producto = inventario.buscarProducto("ABC123");
} catch (ProductoNoEncontradoException e) {
    System.out.println("Error: " + e.getMessage());
}
```

---

## 🛑 Problema: Validar cantidad de café
En la tienda de café **Sibelius** se necesita validar que la cantidad de gramos de café esté entre **5 y 30 gramos**.

1. Crear `CantidadInvalidaException`.
2. Validar cantidad solicitada en el método.
3. Lanzar la excepción cuando la cantidad esté fuera de rango.

---

## 📦 Paquetes

### 📂 Organización del Código con Paquetes
Los paquetes en Java son contenedores que agrupan clases relacionadas.  
Beneficios:
- Mejor legibilidad.
- Evitar conflictos de nombres.
- Reutilización y mantenimiento.

Ejemplo:
```
com.empresa.proyecto
 ├── modelo
 │   ├── Usuario.java
 │   └── Producto.java
 ├── servicios
 │   ├── UsuarioServicio.java
 │   └── ProductoServicio.java
 └── util
     └── Validador.java
```

Importación:
```java
import com.empresa.modelo.Usuario;
import com.empresa.util.Validador;
```

---

## ⚙️ Ejercicios Prácticos – TechLab

### ⚙️ Situación inicial
Silvia notó que algunas operaciones fallaban, por ejemplo, al buscar un producto inexistente.

### 🟩 Ejercicio 1 – Manejo de Excepciones
- Crear `buscarProductoPorNombre(String nombre)`.
- Lanzar `ProductoNoEncontradoException` si no se encuentra el producto.
- Manejar en `main` con `try-catch`.

### 🟩 Ejercicio 2 – Excepciones Personalizadas
- Crear `StockInsuficienteException`.
- Lanzar cuando se intente vender más unidades de las disponibles.

### 🟩 Ejercicio 3 – Organización de Paquetes
- Mover clases a:
    - `com.techlab.productos`
    - `com.techlab.excepciones`
- Ajustar `imports` en `main`.

---

## 🔎 Recursos Adicionales
- [Documentación Oficial de Java](https://docs.oracle.com/javase/specs/jls/se13/html/jls-11.html)
- [Playlist: Organización del Código con Métodos](https://youtube.com/playlist?list=PL954bYq0HsCXlwPGM2k2nxRVztHOwpPqc)

---

## ❓ Preguntas para Reflexionar
- ¿Cómo mejora el manejo de excepciones la robustez del software?
- ¿Cuándo usar excepciones personalizadas?
- ¿Cómo facilita la organización del código la evolución del proyecto?
