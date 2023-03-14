package br.com.melhorgrupo.projetofinal.service;

import br.com.melhorgrupo.projetofinal.model.Cliente;
import br.com.melhorgrupo.projetofinal.model.Movimentacao;
import br.com.melhorgrupo.projetofinal.repo.ClienteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;


@Component
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepo Repo;

    public Cliente cadastrarCliente(Cliente c) {
        return Repo.save(c);
    }

    @Override
    public ArrayList<Cliente> recuperarTodos(int Cliente) {
        return null;
    }

    public ArrayList<Cliente> recuperarTodos() {
        return (ArrayList<Cliente>) Repo.findAll();
    }

    public Cliente recuperarPeloID(int id) {
        return Repo.findById(id).orElse(null);
    }


}
