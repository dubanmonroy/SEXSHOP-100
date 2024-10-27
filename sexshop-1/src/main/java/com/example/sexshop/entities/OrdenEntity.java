package com.example.sexshop.entities;

import java.util.UUID;

public class OrdenEntity {
    private UUID id;
    private UUID clienteId;
    private double total;

    public OrdenEntity(UUID clienteId, double total) {
        this.id = UUID.randomUUID();
        this.clienteId = clienteId;
        this.total = total;
    }

    // Getters y Setters
    public UUID getId() { return id; }
    public UUID getClienteId() { return clienteId; }
    public void setClienteId(UUID clienteId) { this.clienteId = clienteId; }
    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }
}
