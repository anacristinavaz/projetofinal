package br.com.melhorgrupo.projetofinal.service;

import br.com.melhorgrupo.projetofinal.model.Cliente;

import java.util.ArrayList;

public interface ClienteService {

    public Cliente cadastrarCliente(Cliente c);

    public ArrayList<Cliente> recuperarTodos();

    public Cliente recuperarPeloID(int idCliente);


}
