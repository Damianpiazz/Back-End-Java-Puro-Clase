package org.example.c8.productos;

public class Bebida extends Producto {
    private final int volumenML;

    public Bebida(String nombre, double precio, int stock, int volumenML) {
        super(nombre, precio, stock);
        this.volumenML = volumenML;
    }

    @Override
    public String toString() {
        return super.toString() + " - Volumen: " + volumenML + "ml";
    }
}