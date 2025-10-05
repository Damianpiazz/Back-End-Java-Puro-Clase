package org.example.clase_3;

import java.util.ArrayList;
import java.util.Arrays;

public class Listas {
    public static void main(String[] args) {
        // Listas en Java
        // String
        String nombre = "talento tech";

        nombre.charAt(0); // -> t
        nombre.charAt(1); // -> a
        nombre.charAt(2); // -> l

        int ultimoIndice = nombre.length() - 1; // -> h

        // Array
        String[] letrasArray = {"t", "a", "l", "e", "n", "t", "o"};
        String letra1= letrasArray[0]; // -> t
        String letra2= letrasArray[1]; // -> a
        String letra3= letrasArray[2]; // -> l

        int ultimoIndiceArray = letrasArray.length - 1; // -> o

        // ArrayList
        ArrayList<String> letras = new ArrayList<>(); // {}
        // Transformacion para que los datos sean compatibles
        letras.addAll(Arrays.stream(letrasArray).toList());
        System.out.println(letras);


        letras.get(0); // -> t
        letras.get(1); // -> a
        letras.get(2); // -> l

        int ultimoIndiceList = letras.size() - 1;

        letras.add(" ");
        letras.add("t");
        letras.add("e");

        System.out.println(letras);
    }
}
