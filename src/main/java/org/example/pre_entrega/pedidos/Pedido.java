package org.example.pre_entrega.pedidos;

import java.util.ArrayList;

public class Pedido {
    private static int contadorPedidos = 1;
    private int id;
    private final ArrayList<LineaPedido> lineas;

    public Pedido() {
        this.id = contadorPedidos++;
        this.lineas = new ArrayList<>();
    }

    public int getId() { return id; }
    public ArrayList<LineaPedido> getLineas() { return lineas; }

    public void agregarLinea(LineaPedido linea) {
        lineas.add(linea);
    }

    public double calcularTotal() {
        double total = 0;
        for(LineaPedido linea : lineas) {
            total += linea.getSubtotal();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Pedido ID: " + id + "\n");
        for(LineaPedido linea : lineas) {
            sb.append(linea.getProducto().getNombre())
                    .append(" x").append(linea.getCantidad())
                    .append(" = $").append(linea.getSubtotal()).append("\n");
        }
        sb.append("Total: $").append(calcularTotal()).append("\n");
        return sb.toString();
    }
}