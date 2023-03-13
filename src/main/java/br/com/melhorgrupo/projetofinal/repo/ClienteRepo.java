package br.com.melhorgrupo.projetofinal.repo;

import org.springframework.data.repository.CrudRepository;

import br.com.melhorgrupo.projetofinal.model.Cliente;

public interface ClienteRepo extends CrudRepository<Cliente,Integer> {

}
