package com.example.sexshop.entities;

import java.util.UUID;

public class ClienteEntity {
    private UUID id;
    private String nombre;
    private String email;
    private String telefono;

    public ClienteEntity(String nombre, String email, String telefono) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    // Getters y Setters
    public UUID getId() { return id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
}
