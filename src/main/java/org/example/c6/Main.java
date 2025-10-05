package org.example.c6;

import org.example.c6.clases.Cliente;
import org.example.c6.clases.Producto;
import org.example.c6.clases.Carrito;


public class Main {
    public static void main(String[] args) {

        // Crear Clientes
        Cliente cliente1 = new Cliente("Sofía", "sofia@techlab.com");
        Cliente cliente2 = new Cliente("Carlos", "carlos.com"); // email invalido
        cliente2.setEmail("carlos@techlab.com");

        System.out.println(cliente1);
        System.out.println(cliente2);

        // Crear productos
        Producto p1 = new Producto("Café Americano", 120, 50);
        Producto p2 = new Producto("Té Chai", 150, 30);
        Producto p3 = new Producto("Capuccino", 200, -10); // stock invalido

        // Crear carrito
        Carrito carrito = new Carrito();
        carrito.agregarProducto(p1);
        carrito.agregarProducto(p2);
        carrito.agregarProducto(p3);

        carrito.mostrarProductos();

        // Mostrar total del carrito
        System.out.println("\nTotal del carrito: $" + carrito.calcularTotal());

        // Mostrar cuantos productos se crearon
        System.out.println("\nTotal de productos creados: " + Producto.getContadorProductos());
    }
}
