package br.com.melhorgrupo.projetofinal.service;

import br.com.melhorgrupo.projetofinal.model.Cliente;
import br.com.melhorgrupo.projetofinal.repo.ClienteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl {
<<<<<<< HEAD
	
	
=======
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

>>>>>>> 81c981bcdac307c6e752c7b65ebfb75d3ea57bee

}
