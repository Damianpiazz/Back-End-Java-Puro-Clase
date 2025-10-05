package org.example.c6.clases;

public class Cliente {
    private String nombre;
    private String email;

    // Constructor
    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        setEmail(email); // usamos el setter para validar
    }

    // Getter y Setter de nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter de email con validación
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Email invalido: " + email);
        }
    }

    @Override
    public String toString() {
        return "Cliente: " + nombre + " | Email: " + email;
    }
}
