package com.example.sexshop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.example.sexshop.entities.CategoriaEntity;
import com.example.sexshop.services.CategoriaService;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public List<CategoriaEntity> getAllCategorias() {
        return categoriaService.getAllCategorias();
    }

    @GetMapping("/{id}")
    public Optional<CategoriaEntity> getCategoriaById(@PathVariable UUID id) {
        return categoriaService.getCategoriaById(id);
    }

    @PostMapping
    public CategoriaEntity createCategoria(@RequestBody CategoriaEntity categoria) {
        return categoriaService.createCategoria(categoria);
    }

    @PutMapping("/{id}")
    public CategoriaEntity updateCategoria(@PathVariable UUID id, @RequestBody CategoriaEntity categoria) {
        return categoriaService.updateCategoria(id, categoria);
    }

    @DeleteMapping("/{id}")
    public boolean deleteCategoria(@PathVariable UUID id) {
        return categoriaService.deleteCategoria(id);
    }
}

