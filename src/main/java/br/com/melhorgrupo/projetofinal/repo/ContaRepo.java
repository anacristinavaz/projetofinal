package br.com.melhorgrupo.projetofinal.repo;

import org.springframework.data.repository.CrudRepository;

import br.com.melhorgrupo.projetofinal.model.Conta;

public interface ContaRepo extends CrudRepository<Conta, Integer> {

}
