package org.example.c7.clases;

import org.example.c7.interfaces.Descontable;

public class Cafe extends Producto implements Descontable {
    private final boolean conLeche;

    public Cafe(String nombre, double precioBase, boolean conLeche) {
        super(nombre, precioBase);
        this.conLeche = conLeche;
    }

    @Override
    public double calcularPrecioFinal() {
        double precioFinal = precioBase;
        if (conLeche) {
            precioFinal += 30; // Recargo por leche
        }
        return precioFinal;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: Café " + (conLeche ? "con leche" : "solo"));
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        precioBase -= precioBase * (porcentaje / 100);
    }
}
