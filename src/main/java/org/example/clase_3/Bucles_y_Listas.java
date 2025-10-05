package org.example.clase_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Bucles_y_Listas {
    public static void main(String[] args) {
        String nombre = "talento tech";

        // Array
        String[] letrasArray = {"t", "a", "l", "e", "n", "t", "o"};

        ArrayList<String> letras = new ArrayList<>(); // {}
        // Transformacion para que los datos sean compatibles
        letras.addAll(Arrays.stream(letrasArray).toList());
        letras.addAll(Arrays.stream(letrasArray).collect(Collectors.toCollection(Collectors.toList())));


        // Bucle para String
        for(int i = 0; i < nombre.length(); i++){
            char caracter = nombre.charAt(i);
            System.out.println(caracter);
        }

        // Bucle para Array
        for(int i = 0; i < letrasArray.length; i++){
            String caracter = letrasArray[i];
            System.out.println(caracter);
        }

        // Bucle para ArrayList
        for(int i = 0; i < letras.size(); i++){
            String caracter = letras.get(i);
            System.out.println(caracter);
        }
    }
}
