package com.example.sexshop.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;
import com.example.sexshop.entities.ProductoEntity;

@Service
public class ProductoService {
    private final List<ProductoEntity> productoList = new ArrayList<>();

    public ProductoService() {
        // Agrega algunos productos de ejemplo
        productoList.add(new ProductoEntity("Vibrador", "Vibrador de alta calidad", 25.99, UUID.randomUUID()));
        productoList.add(new ProductoEntity("Lubricante", "Lubricante a base de agua", 5.99, UUID.randomUUID()));
    }

    public List<ProductoEntity> getAllProductos() {
        return productoList;
    }

    public Optional<ProductoEntity> getProductoById(UUID id) {
        return productoList.stream().filter(producto -> producto.getId().equals(id)).findFirst();
    }

    public ProductoEntity createProducto(ProductoEntity producto) {
        productoList.add(producto);
        return producto;
    }

    public ProductoEntity updateProducto(UUID id, ProductoEntity updatedProducto) {
        Optional<ProductoEntity> existingProducto = getProductoById(id);
        if (existingProducto.isPresent()) {
            ProductoEntity producto = existingProducto.get();
            producto.setNombre(updatedProducto.getNombre());
            producto.setDescripcion(updatedProducto.getDescripcion());
            producto.setPrecio(updatedProducto.getPrecio());
            producto.setCategoriaId(updatedProducto.getCategoriaId());
            return producto;
        }
        return null;
    }

    public boolean deleteProducto(UUID id) {
        return productoList.removeIf(producto -> producto.getId().equals(id));
    }
}

