package com.example.sexshop.entities;

import java.util.UUID;

public class ProductoEntity {
    private UUID id;
    private String nombre;
    private String descripcion;
    private double precio;
    private UUID categoriaId;

    public ProductoEntity(String nombre, String descripcion, double precio, UUID categoriaId) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoriaId = categoriaId;
    }

    // Getters y Setters
    public UUID getId() { return id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
    public UUID getCategoriaId() { return categoriaId; }
    public void setCategoriaId(UUID categoriaId) { this.categoriaId = categoriaId; }
}
