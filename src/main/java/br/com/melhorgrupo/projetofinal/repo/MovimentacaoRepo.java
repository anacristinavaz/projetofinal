package br.com.melhorgrupo.projetofinal.repo;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import br.com.melhorgrupo.projetofinal.model.Conta;
import br.com.melhorgrupo.projetofinal.model.Movimentacao;

public interface MovimentacaoRepo extends CrudRepository<Movimentacao,Integer>{
	public ArrayList<Movimentacao> findByNumConta(Conta c);
	public ArrayList<Movimentacao> findByNumContaAndDataBetween(Conta c, LocalDate dataInicio, LocalDate dataFim);
}
