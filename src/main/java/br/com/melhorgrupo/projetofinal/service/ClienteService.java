package br.com.melhorgrupo.projetofinal.service;

import br.com.melhorgrupo.projetofinal.model.Cliente;
import br.com.melhorgrupo.projetofinal.model.Movimentacao;

import java.util.ArrayList;

public interface ClienteService {

    public Cliente cadastrarCliente(Cliente c);

    public ArrayList<Cliente> recuperarTodos(int Cliente);

    public Cliente recuperarPeloID(int idCliente);


}
