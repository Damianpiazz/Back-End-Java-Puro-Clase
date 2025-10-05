package org.example.c2;

import java.util.Scanner;

public class Entrada_salida {
    public static void main(String[] args) {
        // Crear el Scanner para leer datos desde el teclado
        Scanner entrada = new Scanner(System.in);

        // Pedir un dato al usuario
        System.out.print("Ingresa un dato: ");
        String dato = entrada.nextLine();

        // Mostrar el dato ingresado
        System.out.println("El dato ingresado es: " + dato);

        // Cerrar el Scanner
        entrada.close();
    }
}
