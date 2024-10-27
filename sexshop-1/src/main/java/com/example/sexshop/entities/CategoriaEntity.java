package com.example.sexshop.entities;

import java.util.UUID;

public class CategoriaEntity {
    private UUID id;
    private String nombre;

    public CategoriaEntity(String nombre) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
    }

    // Getters y Setters
    public UUID getId() { return id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
}

