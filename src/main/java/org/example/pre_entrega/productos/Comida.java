package org.example.pre_entrega.productos;

public class Comida extends Producto {
    private int pesoGramos;

    public Comida(String nombre, double precio, int stock, int pesoGramos) {
        super(nombre, precio, stock);
        this.pesoGramos = pesoGramos;
    }

    public int getPesoGramos() { return pesoGramos; }
    public void setPesoGramos(int pesoGramos) { this.pesoGramos = pesoGramos; }

    @Override
    public String toString() {
        return super.toString() + " | Peso: " + pesoGramos + "g";
    }
}