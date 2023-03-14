package br.com.melhorgrupo.projetofinal.service;

import br.com.melhorgrupo.projetofinal.model.Cliente;

public interface ClienteService {

    public Cliente cadastrarCliente(Cliente c);

    public Iterable<Cliente> recuperarTodos();

    public Cliente recuperarPeloID(int idCliente);


}
