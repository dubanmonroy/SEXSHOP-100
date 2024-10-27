package com.example.sexshop.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;
import com.example.sexshop.entities.CategoriaEntity;

@Service
public class CategoriaService {
    private final List<CategoriaEntity> categoriaList = new ArrayList<>();

    public CategoriaService() {
        categoriaList.add(new CategoriaEntity("Electrónica"));
        categoriaList.add(new CategoriaEntity("Muebles"));
        categoriaList.add(new CategoriaEntity("Cocina"));
    }

    public List<CategoriaEntity> getAllCategorias() {
        return categoriaList;
    }

    public Optional<CategoriaEntity> getCategoriaById(UUID id) {
        return categoriaList.stream().filter(categoria -> categoria.getId().equals(id)).findFirst();
    }

    public CategoriaEntity createCategoria(CategoriaEntity categoria) {
        categoriaList.add(categoria);
        return categoria;
    }

    public CategoriaEntity updateCategoria(UUID id, CategoriaEntity updatedCategoria) {
        Optional<CategoriaEntity> existingCategoria = getCategoriaById(id);
        if (existingCategoria.isPresent()) {
            CategoriaEntity categoria = existingCategoria.get();
            categoria.setNombre(updatedCategoria.getNombre());
            return categoria;
        }
        return null;
    }

    public boolean deleteCategoria(UUID id) {
        return categoriaList.removeIf(categoria -> categoria.getId().equals(id));
    }
}
