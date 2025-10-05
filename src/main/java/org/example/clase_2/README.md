# 📘 Fundamentos de Programación en Java

## Clase 02 | Fundamentos de Programación en Java

---

## 📑 Índice
- Tipos de datos y variables.
- Operadores aritméticos, lógicos y relacionales.
- Entrada y salida de datos.
- Estructuras de control: condicionales (if, else if, else) y bucles (for, while).

---

## Clase 03 | Cadenas y Listas
- Manipulación de cadenas de caracteres.
- Métodos comunes de cadenas.
- Introducción a arrays y listas.
- Uso de ArrayList y sus métodos.

---

## 🎯 Objetivos de la Clase
- **Comprender variables:** Aprenderemos a declarar y usar variables en Java.
- **Aplicar operadores:** Utilizaremos operadores aritméticos, lógicos y relacionales para cálculos y comparaciones.
- **Manejar entrada/salida:** Practicaremos la interacción con el usuario mediante entrada y salida de datos.
- **Implementar estructuras de control:** Usaremos condicionales y bucles para tomar decisiones y automatizar tareas repetitivas.

---

## 🔑 Tipos de Datos y Operadores

### Tipos de Datos
Las variables nos permiten almacenar información en la memoria y usarla a lo largo del programa. Podemos guardar números, texto, valores booleanos, etc.

- **int:** Números enteros (ej. `0`, `10`, `-5`). Ideal para cantidades: stock, demanda, etc.
- **double:** Números con decimales (ej. `3.14`, `250.75`). Perfecto para precios o totales monetarios.
- **boolean:** Valores lógicos (`true` o `false`). Útil para condiciones: ¿stock suficiente? ¿aplica descuento?
- **char:** Un solo carácter (ej. `'A'`).

### Operadores Aritméticos
- `+` Suma dos valores.
- `-` Resta el segundo valor del primero.
- `*` Multiplica dos valores.
- `/` Divide el primer valor por el segundo.
- `%` Devuelve el resto de la división.

### Operadores Relacionales
- `>` Mayor que
- `<` Menor que
- `>=` Mayor o igual que
- `<=` Menor o igual que
- `==` Igual
- `!=` Distinto

### Operadores Lógicos
- `&&` (AND) Verdadero si ambas condiciones son verdaderas.
- `||` (OR) Verdadero si al menos una condición es verdadera.
- `!` (NOT) Invierte el valor booleano.

---

## ⌨️ Entrada de Datos con Scanner

`Scanner` es una clase de Java que permite la entrada de datos desde el teclado.

1. **Importar Scanner:**
```java
import java.util.Scanner;
```
2. **Crear instancia:**
```java
Scanner sc = new Scanner(System.in);
```
3. **Leer datos:**
- `nextInt()` para enteros.
- `nextDouble()` para decimales.
- `nextLine()` para cadenas de texto.

4. **Mostrar resultados:**
```java
System.out.println();
```

5. **Cerrar Scanner:**
```java
sc.close();
```

---

## 🔁 Estructuras de Control

### Condicionales
Permiten ejecutar diferentes bloques de código según se cumpla o no una condición.

#### Ejemplo
```java
int edad = 18;
if (edad >= 18) {
    System.out.println("Eres mayor de edad");
} else {
    System.out.println("Eres menor de edad");
}
```

### Bucles
Permiten repetir código mientras se cumple una condición.

#### while
```java
while (saldo > 0) {
    procesarCompra();
    actualizarSaldo();
}
```

#### for
```java
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
```

---

## 📚 Materiales y Recursos Adicionales
- [Documentación Java](https://docs.oracle.com/javase/8/docs/)
- [Libro Oficial de Git](https://git-scm.com/book/es/v2)
- Videos: **Fundamentos de Programación en Java – YouTube**

---

## 📝 Ejercicios Prácticos

### Situación en TalentoLab
En **TechLab**, Silvia (Product Owner) ha recibido nuevas solicitudes del cliente **“Sibelius”**.  
El equipo de desarrollo (Matías y Sabrina) se enfrenta a varios problemas cotidianos que resolveremos aplicando programación:

- Llevar registro del **stock** de productos.
- Calcular el **costo total** de un pedido (precio * cantidad).
- Solicitar **datos al cliente** para personalizar la experiencia.
- Verificar si hay **stock suficiente** para cubrir una demanda.
- Procesar una **lista de productos pendientes de revisión** usando bucles.

---

### Ejercicio Obligatorio

#### Variables y Operadores
- Crear variables para representar el **precio de un producto** y la **cantidad deseada**.
- Calcular y mostrar en pantalla el **costo total**.
- Modificar el precio o la cantidad y verificar el resultado.

#### Entrada y Salida de Datos
- Pedir al usuario que ingrese **su nombre** y la **cantidad de productos** a comprar.
- Mostrar un mensaje personalizado con el monto total (asignando un **precio fijo por unidad**).

#### Condicionales
- Si el cliente quiere **más de 100 unidades**, ofrecer un **descuento especial**.
- Implementar un `if` que verifique si `cantidad > 100` y mostrar el mensaje.

#### Bucles
- Pedir al usuario que ingrese un **número**.
- Usar un **for** para imprimir desde `1` hasta ese número.
- Repetir con un **while** y comparar resultados.