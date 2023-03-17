package br.com.melhorgrupo.projetofinal.service;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.melhorgrupo.projetofinal.model.Conta;
import br.com.melhorgrupo.projetofinal.model.Movimentacao;
import br.com.melhorgrupo.projetofinal.repo.MovimentacaoRepo;

@Component
public class ExtratoServiceImol implements ExtratoService{
	@Autowired
	private MovimentacaoRepo repo;
	@Autowired
	private ContaService service;
	
	@Override
	public ArrayList<Movimentacao> listarMovimentacao(int idConta, LocalDate dataInicio, LocalDate dataFim) {
		Conta c = service.recuperarPeloNumero(idConta);
		return repo.findByNumContaAndDataBetween(c, dataInicio, dataFim);
	}

}
