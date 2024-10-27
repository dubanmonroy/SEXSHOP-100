package com.example.sexshop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.example.sexshop.entities.ProductoEntity;
import com.example.sexshop.services.ProductoService;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<ProductoEntity> getAllProductos() {
        return productoService.getAllProductos();
    }

    @GetMapping("/{id}")
    public Optional<ProductoEntity> getProductoById(@PathVariable UUID id) {
        return productoService.getProductoById(id);
    }

    @PostMapping
    public ProductoEntity createProducto(@RequestBody ProductoEntity producto) {
        return productoService.createProducto(producto);
    }

    @PutMapping("/{id}")
    public ProductoEntity updateProducto(@PathVariable UUID id, @RequestBody ProductoEntity producto) {
        return productoService.updateProducto(id, producto);
    }

    @DeleteMapping("/{id}")
    public boolean deleteProducto(@PathVariable UUID id) {
        return productoService.deleteProducto(id);
    }
}


