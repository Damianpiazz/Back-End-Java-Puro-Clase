# 📦 Preentrega de Proyecto – Sistema de Gestión de Productos y Pedidos

## 📌 Revisión de Progreso – Obligatorio

Estamos acercándonos a un punto clave en el desarrollo del proyecto, donde tendrán la oportunidad de mostrar lo que han aprendido hasta ahora. Es un excelente momento para compartir su progreso y recibir comentarios que les ayudarán a pulir detalles y afinar sus ideas antes de la entrega final.

Aprovechen esta instancia para obtener una visión más clara de su trabajo y hacer los ajustes necesarios para llegar a un resultado óptimo.

---

## 📝 Entregable

Como parte de tu avance en el curso y para prepararte para el desarrollo del **Trabajo Final Integrador (TFI)**, se te solicita que diseñes un **sistema básico que permita gestionar información inicial sobre los productos de la empresa**. Este proyecto servirá como la base sobre la cual construirás funcionalidades más complejas en las próximas semanas. Así, podrán recibir comentarios que les permitirán fortalecer su proyecto y enfocarse en los detalles clave para la etapa final.

Esta instancia evaluativa es **obligatoria** y es un punto clave dentro de la cursada ya que permitirá evaluar tu progreso en el recorrido y asegurar que estás en el camino correcto en la construcción del **Proyecto Final Integrador**.

Este espacio de entrega está conformado por:
- ✅ Cuestionario de Autoevaluación
- ✅ Preentrega de Proyecto

A partir de la **Clase N° 8** tendrás **7 días de corrido** para realizar la autoevaluación y la entrega en el campus virtual.

---

## 🔎 Cuestionario de Autoevaluación

Te permitirá reflexionar sobre tu propio aprendizaje, progreso y cumplimiento de las consignas o rúbricas previamente establecidas y en caso de ser necesario realizar las modificaciones o ajustes correspondientes antes de realizar la preentrega.

Se encontrará disponible en la Ruta N°2 de Campus Virtual.

---

## 🚀 Preentrega de Proyecto

Se evaluará la aplicación de los conocimientos adquiridos en la realización de un proyecto.

La realización progresiva de los **"Ejercicios prácticos"** te guiará paso a paso hacia la realización de la **"Preentrega"** y el **"Proyecto Integrador Final"**.

---

## 💻 Ejercicio Práctico – Obligatorio

### 🎯 Objetivo General

Diseñar una aplicación en Java que permita **registrar, mostrar y gestionar productos**, así como **crear pedidos que involucren varios productos**.  
El sistema deberá hacer uso de:

- Variables
- Operadores
- Colecciones (listas)
- Programación Orientada a Objetos (POO): clases, objetos, encapsulamiento, herencia, polimorfismo
- Excepciones
- Organización de código en paquetes/módulos

---

## 📋 Requerimientos

### 🟩 Ingreso de Productos

El sistema debe permitir agregar productos con la siguiente información mínima:

- **Nombre del producto**: cadena de texto (ejemplo: `"Café Premium"`)
- **Precio**: tipo `double` (puede tener decimales)
- **Cantidad en Stock**: tipo `int`

Estos productos deben almacenarse en una colección (por ejemplo: `ArrayList<Producto>`).

---

### 📄 Visualización de Productos

Debe haber una funcionalidad que liste en pantalla todos los productos registrados, mostrando:

- **ID** (o posición en la lista)
- **Nombre**
- **Precio**
- **Cantidad en Stock**

El ID puede ser autogenerado (por ejemplo, un contador estático) o la posición en la lista.

---

### 🔎 Búsqueda y Actualización de Productos

El sistema permitirá **buscar un producto por su nombre o ID**.

- Si se encuentra el producto, se mostrará su información completa.
- Opcionalmente, se podrá **actualizar** alguno de sus datos (precio o stock), validando que los valores sean coherentes (por ejemplo, que el stock no sea negativo).

---

### 🗑️ Eliminación de Productos

El sistema debe permitir **eliminar un producto de la lista**, identificándolo por su ID o posición en la colección.

> Antes de eliminar, el sistema podría pedir confirmación (opcional).

---

### 📝 Creación de Pedidos

Además de manejar productos, se sugiere agregar la clase **Pedido** (o **Orden**) que contenga:

- Una lista de productos asociados
- Cantidad deseada de cada producto (por ejemplo, usando un objeto intermedio `LineaPedido` o similar)

El sistema debe permitir **crear un pedido nuevo**:

- Solicitar al usuario qué productos desea y en qué cantidad (validar que haya suficiente stock).
- Calcular el **costo total** (sumando `precio * cantidad` de cada producto).
- **Disminuir el stock** de cada producto si el pedido se confirma.

Debe haber una funcionalidad para **mostrar los pedidos realizados** y su **costo total**, así como la lista de productos asociados.

---

### 🗂️ Menú Principal Interactivo

El programa presentará un **menú con opciones**, por ejemplo:

```
=================================== SISTEMA DE GESTIÓN - TECHLAB ==================================

1) Agregar producto
2) Listar productos
3) Buscar/Actualizar producto
4) Eliminar producto
5) Crear un pedido
6) Listar pedidos
7) Salir

Elija una opción:
```

El menú se repetirá hasta que se elija la opción **Salir**.

---

## ⚙️ Requerimientos Técnicos

### 🔤 Tipos de Datos y Variables
Emplear variables de tipo:
- `int` para cantidades e IDs
- `double` para precios
- `String` para nombres/descripciones
- `boolean` si fuera necesario

Usar operadores aritméticos, lógicos y relacionales en las funciones de cálculo y validación.

---

### 📦 Colecciones (Arrays, Listas)
- Para manejar los productos, se sugiere un `ArrayList<Producto>`.
- Para manejar los productos dentro de un pedido, podría usarse otra lista (por ejemplo `ArrayList<LineaPedido>`) o un `Map<Integer, Integer>` para asociar ID de producto con cantidad solicitada.

---

### 🏗️ POO y Colaboración de Clases

- Clase `Producto`: con atributos `id`, `nombre`, `precio`, `stock`, getters y setters.
- Clase `Pedido` (u Orden): con atributos `id`, lista de productos/líneas, métodos para calcular total, etc.
- Clase **Principal (Main)**: orquesta el menú e invoca métodos de servicios (por ejemplo, un `ProductoService` que encapsule la lógica de agregar/buscar/eliminar).

#### 🔀 Herencia/Polimorfismo (opcional)
Podés crear **subclases de Producto** (por ejemplo: `Bebida`, `Comida`) con atributos específicos (fecha de vencimiento, volumen, etc.).

Mostrar cómo el **polimorfismo** ayuda a tratar distintos productos de forma genérica.

---

### ⚠️ Excepciones

- Manejar errores con `try/catch` (por ejemplo, `NumberFormatException` al convertir datos ingresados por el usuario).
- Crear una excepción personalizada como `StockInsuficienteException` y lanzarla cuando se intenta crear un pedido con cantidad mayor al stock disponible.

---

### 📂 Paquetes/Módulos (Organización de Código)

Dividir las clases en paquetes lógicos:

- `com.techlab.productos` → para `Producto`, `Bebida`, etc.
- `com.techlab.pedidos` → para `Pedido`, `LineaPedido`
- `com.techlab.excepciones` → para excepciones personalizadas

---

## 🖥️ Ejemplo de Flujo de Uso (Escenario)

1. Aparece el menú principal.
2. Se selecciona “1) Agregar Producto”: el programa solicita nombre, precio, stock; crea un objeto Producto y lo agrega a la lista.
3. Se selecciona “2) Listar Productos”: el sistema muestra todos los productos con su id, nombre, precio, stock.
4. Se selecciona “5) Crear Pedido”: el sistema solicita cuántos productos se van a agregar, pide ID de producto y cantidad, verifica stock, descuenta stock y crea el pedido.
5. Se selecciona “7) Salir”: el programa finaliza.