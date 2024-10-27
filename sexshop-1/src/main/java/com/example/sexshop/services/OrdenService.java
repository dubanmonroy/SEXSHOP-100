package com.example.sexshop.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;
import com.example.sexshop.entities.OrdenEntity;

@Service
public class OrdenService {
    private final List<OrdenEntity> ordenList = new ArrayList<>();

    public List<OrdenEntity> getAllOrdenes() {
        return ordenList;
    }

    public Optional<OrdenEntity> getOrdenById(UUID id) {
        return ordenList.stream().filter(orden -> orden.getId().equals(id)).findFirst();
    }

    public OrdenEntity createOrden(OrdenEntity orden) {
        ordenList.add(orden);
        return orden;
    }

    public OrdenEntity updateOrden(UUID id, OrdenEntity updatedOrden) {
        Optional<OrdenEntity> existingOrden = getOrdenById(id);
        if (existingOrden.isPresent()) {
            OrdenEntity orden = existingOrden.get();
            orden.setClienteId(updatedOrden.getClienteId());
            orden.setTotal(updatedOrden.getTotal());
            return orden;
        }
        return null;
    }

    public boolean deleteOrden(UUID id) {
        return ordenList.removeIf(orden -> orden.getId().equals(id));
    }
}
