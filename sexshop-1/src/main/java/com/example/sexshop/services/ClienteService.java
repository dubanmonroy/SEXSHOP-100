package com.example.sexshop.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;
import com.example.sexshop.entities.ClienteEntity;

@Service
public class ClienteService {
    private final List<ClienteEntity> clienteList = new ArrayList<>();

    public ClienteService() {
        clienteList.add(new ClienteEntity("Juan Pérez", "juan.perez@example.com", "123456789"));
        clienteList.add(new ClienteEntity("María López", "maria.lopez@example.com", "987654321"));
    }

    public List<ClienteEntity> getAllClientes() {
        return clienteList;
    }

    public Optional<ClienteEntity> getClienteById(UUID id) {
        return clienteList.stream().filter(cliente -> cliente.getId().equals(id)).findFirst();
    }

    public ClienteEntity createCliente(ClienteEntity cliente) {
        clienteList.add(cliente);
        return cliente;
    }

    public ClienteEntity updateCliente(UUID id, ClienteEntity updatedCliente) {
        Optional<ClienteEntity> existingCliente = getClienteById(id);
        if (existingCliente.isPresent()) {
            ClienteEntity cliente = existingCliente.get();
            cliente.setNombre(updatedCliente.getNombre());
            cliente.setEmail(updatedCliente.getEmail());
            cliente.setTelefono(updatedCliente.getTelefono());
            return cliente;
        }
        return null;
    }

    public boolean deleteCliente(UUID id) {
        return clienteList.removeIf(cliente -> cliente.getId().equals(id));
    }
}

