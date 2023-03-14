package br.com.melhorgrupo.projetofinal.service;

import br.com.melhorgrupo.projetofinal.model.Cliente;
import br.com.melhorgrupo.projetofinal.repo.ClienteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl {

    @Autowired
    private ClienteRepo clienteRepo;

    public Cliente cadastrarCliente(Cliente c) {
        return clienteRepo.save(c);
    }

    public Iterable<Cliente> recuperarTodos() {
        return clienteRepo.findAll();
    }

    public Cliente recuperarPeloID(int id) {
        return clienteRepo.findById(id).orElse(null);
    }



}
