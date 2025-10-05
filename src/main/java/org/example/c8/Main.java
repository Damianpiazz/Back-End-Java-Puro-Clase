package org.example.c8;

import org.example.c8.excepciones.ProductoNoEncontradoException;
import org.example.c8.excepciones.StockInsuficienteException;
import org.example.c8.productos.Bebida;
import org.example.c8.productos.Comida;
import org.example.c8.productos.Producto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final List<Producto> inventario = new ArrayList<>();

    public static void main(String[] args) {
        // Agregar productos al inventario
        inventario.add(new Bebida("Café Americano", 500, 10, 250));
        inventario.add(new Bebida("Té Verde", 400, 5, 200));
        inventario.add(new Comida("Croissant", 300, 8, 120));

        System.out.println("Inventario inicial:");
        mostrarInventario();

        // Buscar producto
        try {
            Producto producto = buscarProductoPorNombre("Café Americano");
            venderProducto(producto, 3);
            venderProducto(producto, 8); // Esto lanzara StockInsuficienteException
        } catch (ProductoNoEncontradoException | StockInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Intentar buscar producto inexistente
        try {
            Producto productoInexistente = buscarProductoPorNombre("Capuccino");
        } catch (ProductoNoEncontradoException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nInventario final:");
        mostrarInventario();
    }

    public static Producto buscarProductoPorNombre(String nombre) throws ProductoNoEncontradoException {
        for (Producto p : inventario) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        throw new ProductoNoEncontradoException("El producto '" + nombre + "' no se encuentra en el inventario.");
    }

    public static void venderProducto(Producto producto, int cantidad) throws StockInsuficienteException {
        if (cantidad > producto.getStock()) {
            throw new StockInsuficienteException(
                    "No hay suficiente stock para vender " + cantidad + " unidades de " + producto.getNombre()
            );
        }
        producto.disminuirStock(cantidad);
        System.out.println("Venta realizada: " + cantidad + " unidades de " + producto.getNombre());
    }

    public static void mostrarInventario() {
        for (Producto p : inventario) {
            System.out.println(p);
        }
    }
}
