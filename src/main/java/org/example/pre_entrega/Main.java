package org.example.pre_entrega;

import org.example.pre_entrega.productos.*;
import org.example.pre_entrega.pedidos.*;
import org.example.pre_entrega.excepciones.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final ArrayList<Producto> productos = new ArrayList<>();
    private static final ArrayList<Pedido> pedidos = new ArrayList<>();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        while(running) {
            System.out.println("==================================== SISTEMA DE GESTIÓN - TECHLAB ==================================");
            System.out.println("1) Agregar producto");
            System.out.println("2) Listar productos");
            System.out.println("3) Buscar/Actualizar producto");
            System.out.println("4) Eliminar producto");
            System.out.println("5) Crear un pedido");
            System.out.println("6) Listar pedidos");
            System.out.println("7) Salir");
            System.out.print("Elija una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch(opcion) {
                case 1: agregarProducto(); break;
                case 2: listarProductos(); break;
                case 3: buscarActualizarProducto(); break;
                case 4: eliminarProducto(); break;
                case 5: crearPedido(); break;
                case 6: listarPedidos(); break;
                case 7: running = false; break;
                default: System.out.println("Opción invalida"); break;
            }
        }
    }

    private static void agregarProducto() {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Precio: ");
        double precio = sc.nextDouble();
        System.out.print("Stock: ");
        int stock = sc.nextInt();
        sc.nextLine();

        Producto p = new Producto(nombre, precio, stock);
        productos.add(p);
        System.out.println("Producto agregado correctamente.\n");
    }

    private static void listarProductos() {
        if(productos.isEmpty()) {
            System.out.println("No hay productos registrados.\n");
            return;
        }
        for(Producto p : productos) {
            System.out.println(p);
        }
        System.out.println();
    }

    private static void buscarActualizarProducto() {
        System.out.print("Ingrese ID del producto a buscar: ");
        int id = sc.nextInt();
        sc.nextLine();
        try {
            Producto p = buscarProductoPorId(id);
            System.out.println("Producto encontrado: " + p);
            System.out.print("Actualizar precio? (s/n): ");
            String res = sc.nextLine();
            if(res.equalsIgnoreCase("s")) {
                System.out.print("Nuevo precio: ");
                double nuevoPrecio = sc.nextDouble();
                sc.nextLine();
                p.setPrecio(nuevoPrecio);
            }
            System.out.print("Actualizar stock? (s/n): ");
            res = sc.nextLine();
            if(res.equalsIgnoreCase("s")) {
                System.out.print("Nuevo stock: ");
                int nuevoStock = sc.nextInt();
                sc.nextLine();
                p.setStock(nuevoStock);
            }
        } catch (ProductoNoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void eliminarProducto() {
        System.out.print("Ingrese ID del producto a eliminar: ");
        int id = sc.nextInt();
        sc.nextLine();
        try {
            Producto p = buscarProductoPorId(id);
            productos.remove(p);
            System.out.println("Producto eliminado correctamente.\n");
        } catch (ProductoNoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void crearPedido() {
        Pedido pedido = new Pedido();
        boolean agregando = true;
        while(agregando) {
            listarProductos();
            System.out.print("Ingrese ID del producto a agregar al pedido: ");
            int id = sc.nextInt();
            sc.nextLine();
            try {
                Producto p = buscarProductoPorId(id);
                System.out.print("Cantidad: ");
                int cantidad = sc.nextInt();
                sc.nextLine();
                if(cantidad > p.getStock()) throw new StockInsuficienteException("Stock insuficiente!");
                p.setStock(p.getStock() - cantidad);
                pedido.agregarLinea(new LineaPedido(p, cantidad));
            } catch (ProductoNoEncontradoException | StockInsuficienteException e) {
                System.out.println(e.getMessage());
            }
            System.out.print("Agregar otro producto? (s/n): ");
            String res = sc.nextLine();
            agregando = res.equalsIgnoreCase("s");
        }
        pedidos.add(pedido);
        System.out.println("Pedido creado correctamente.\n");
    }

    private static void listarPedidos() {
        if(pedidos.isEmpty()) {
            System.out.println("No hay pedidos.\n");
            return;
        }
        for(Pedido p : pedidos) {
            System.out.println(p);
        }
    }

    private static Producto buscarProductoPorId(int id) throws ProductoNoEncontradoException {
        for(Producto p : productos) {
            if(p.getId() == id) return p;
        }
        throw new ProductoNoEncontradoException("Producto con ID " + id + " no encontrado.");
    }
}