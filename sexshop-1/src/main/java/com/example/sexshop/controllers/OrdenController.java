package com.example.sexshop.controllers;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sexshop.entities.OrdenEntity;
import com.example.sexshop.services.OrdenService;

@RestController
@RequestMapping("/api/ordenes")
public class OrdenController {
    @Autowired
    private OrdenService ordenService;

    @GetMapping
    public List<OrdenEntity> getAllOrdenes() {
        return ordenService.getAllOrdenes();
    }

    @GetMapping("/{id}")
    public Optional<OrdenEntity> getOrdenById(@PathVariable UUID id) {
        return ordenService.getOrdenById(id);
    }

    @PostMapping
    public OrdenEntity createOrden(@RequestBody OrdenEntity orden) {
        return ordenService.createOrden(orden);
    }

    @PutMapping("/{id}")
    public OrdenEntity updateOrden(@PathVariable UUID id, @RequestBody OrdenEntity orden) {
        return ordenService.updateOrden(id, orden);
    }

    @DeleteMapping("/{id}")
    public boolean deleteOrden(@PathVariable UUID id) {
        return ordenService.deleteOrden(id);
    }
}
