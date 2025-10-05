package org.example.c7.clases;

import org.example.c7.interfaces.Descontable;

public class Te extends Producto implements Descontable {
    private final boolean esPremium;

    public Te(String nombre, double precioBase, boolean esPremium) {
        super(nombre, precioBase);
        this.esPremium = esPremium;
    }

    @Override
    public double calcularPrecioFinal() {
        double precioFinal = precioBase;
        if (esPremium) {
            precioFinal += 50; // Recargo por ser premium
        }
        return precioFinal;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: Té " + (esPremium ? "Premium" : "Común"));
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        precioBase -= precioBase * (porcentaje / 100);
    }
}
