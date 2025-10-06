package org.example.pre_entrega.pedidos;

import org.example.pre_entrega.productos.Producto;

public class LineaPedido {
    private Producto producto;
    private int cantidad;

    public LineaPedido(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() { return producto; }
    public int getCantidad() { return cantidad; }

    public double getSubtotal() {
        return producto.getPrecio() * cantidad;
    }
}