package org.example.c3;

public class GruposDatos {
    public static void main(String[] args) {
        String textoEjemplo = "Mensaje en formato String 123";
        int indiceBusqueda = textoEjemplo.indexOf("formato");
        System.out.println(indiceBusqueda);

        String apellido = "Piazza";
        System.out.println(textoEjemplo.toLowerCase());

        // Modificar la primera letra de la palabra si es una sola palabra
        String nombre = "damian";
        nombre = nombre.toUpperCase().charAt(0) + nombre.substring(1);

        // transforma el nombre a mayusculas -> DAMIAN
        // y de eso obtiene el primer caracter -> D
        // genera un nuevo string desde el indice que se le pasa -> amian

        System.out.println(nombre);

        String nombreCompleto = nombre + " " + apellido;
        System.out.println(nombreCompleto);

        System.out.println(nombreCompleto.length());

        String[] palabras = nombreCompleto.split( " "); // ["Damian", "Piazza"]

        String url = "https://gamma.app/docs/Clase03-b3ctilf3i3y799m?mode=doc";

        String[] partesUrl = url.split("/"); // ["https:", "gamma.app", ...]

        String recursoFinalUrl = partesUrl[partesUrl.length - 1];

        int indiceFinal = partesUrl.length - 1;
    }
}
