package br.com.melhorgrupo.projetofinal.service;

import br.com.melhorgrupo.projetofinal.model.Cliente;
import br.com.melhorgrupo.projetofinal.repo.ClienteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ClienteServiceImpl {

    @Autowired
    private ClienteRepo Repo;

    public Cliente cadastrarCliente(Cliente c) {
        return Repo.save(c);
    }

    public Iterable<Cliente> recuperarTodos() {
        return Repo.findAll();
    }

    public Cliente recuperarPeloID(int id) {
        return Repo.findById(id).orElse(null);
    }



}
