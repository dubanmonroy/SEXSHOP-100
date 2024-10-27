package com.example.sexshop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.example.sexshop.entities.ClienteEntity;
import com.example.sexshop.services.ClienteService;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<ClienteEntity> getAllClientes() {
        return clienteService.getAllClientes();
    }

    @GetMapping("/{id}")
    public Optional<ClienteEntity> getClienteById(@PathVariable UUID id) {
        return clienteService.getClienteById(id);
    }

    @PostMapping
    public ClienteEntity createCliente(@RequestBody ClienteEntity cliente) {
        return clienteService.createCliente(cliente);
    }

    @PutMapping("/{id}")
    public ClienteEntity updateCliente(@PathVariable UUID id, @RequestBody ClienteEntity cliente) {
        return clienteService.updateCliente(id, cliente);
    }

    @DeleteMapping("/{id}")
    public boolean deleteCliente(@PathVariable UUID id) {
        return clienteService.deleteCliente(id);
    }
}


