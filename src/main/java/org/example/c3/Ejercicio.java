package org.example.c3;

import java.util.ArrayList;

public class Ejercicio {

    // Metodo para formatear cadenas (Title Case)
    public static String formatearNombreProducto(String nombre) {
        nombre = nombre.trim().toLowerCase();
        String[] palabras = nombre.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                sb.append(Character.toUpperCase(palabra.charAt(0)))
                        .append(palabra.substring(1))
                        .append(" ");
            }
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {

        // ------------------------
        // 1. Manipulación de cadenas
        // ------------------------
        String cadena = " té CHAi ";
        String cadenaFormateada = formatearNombreProducto(cadena);

        System.out.println("Cadena original: \"" + cadena + "\"");
        System.out.println("Cadena formateada: \"" + cadenaFormateada + "\"");
        System.out.println("Longitud: " + cadenaFormateada.length());
        System.out.println("Primera letra: " + cadenaFormateada.charAt(0));
        System.out.println("Contiene 'Chai'? " + cadenaFormateada.contains("Chai"));

        // ------------------------
        // 2. Arrays
        // ------------------------
        System.out.println("\n=== Arrays ===");
        String[] productos = {"Café Premium", "Té Verde", "Chocolate", "Galletas", "Leche"};
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Producto " + (i+1) + ": " + productos[i]);
        }

        // Intento de agregar un sexto producto
        // productos[5] = "Jugo"; // Esto lanzaria ArrayIndexOutOfBoundsException
        System.out.println("No se puede agregar un sexto producto directamente en un array de tamaño fijo.");

        // ------------------------
        // 3. ArrayList
        // ------------------------
        System.out.println("\n=== ArrayList ===");
        ArrayList<String> listaProductos = new ArrayList<>();
        listaProductos.add("Café Premium");
        listaProductos.add("Té Verde");
        listaProductos.add("Chocolate");
        listaProductos.add("Galletas");
        listaProductos.add("Leche");

        // Agregar un producto
        listaProductos.add("Jugo");

        // Eliminar un producto
        listaProductos.remove("Chocolate");

        // Verificar si existe un producto
        if (listaProductos.contains("Té Verde")) {
            System.out.println("Té Verde existe en la lista.");
        }

        // Imprimir lista final
        System.out.println("Lista final de productos:");
        for (String producto : listaProductos) {
            System.out.println(producto);
        }

        // ------------------------
        // 4. Combinar cadenas y listas
        // ------------------------
        System.out.println("\n=== Formatear lista de productos ===");
        ArrayList<String> listaDesprolija = new ArrayList<>();
        listaDesprolija.add(" café PREMIUM ");
        listaDesprolija.add(" té chai ");
        listaDesprolija.add("CHOCOLATE amargo");
        listaDesprolija.add(" galletas  de avena ");

        System.out.println("Lista original:");
        for (String p : listaDesprolija) {
            System.out.println(p);
        }

        // Formatear cada nombre
        ArrayList<String> listaProlija = new ArrayList<>();
        for (String p : listaDesprolija) {
            listaProlija.add(formatearNombreProducto(p));
        }

        System.out.println("\nLista formateada:");
        for (String p : listaProlija) {
            System.out.println(p);
        }
    }
}
