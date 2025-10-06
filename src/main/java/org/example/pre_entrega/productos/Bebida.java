package org.example.pre_entrega.productos;

public class Bebida extends Producto {
    private boolean caliente;

    public Bebida(String nombre, double precio, int stock, boolean caliente) {
        super(nombre, precio, stock);
        this.caliente = caliente;
    }

    public boolean isCaliente() { return caliente; }
    public void setCaliente(boolean caliente) { this.caliente = caliente; }

    @Override
    public String toString() {
        return super.toString() + " | Caliente: " + caliente;
    }
}