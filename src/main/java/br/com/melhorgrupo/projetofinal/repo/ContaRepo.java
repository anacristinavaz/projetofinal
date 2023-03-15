package br.com.melhorgrupo.projetofinal.repo;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import br.com.melhorgrupo.projetofinal.model.Cliente;
import br.com.melhorgrupo.projetofinal.model.Conta;

public interface ContaRepo extends CrudRepository<Conta, Integer> {
	
     public ArrayList<Conta> findByCliente (Cliente cl);
}
