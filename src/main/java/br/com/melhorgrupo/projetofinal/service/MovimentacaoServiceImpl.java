package br.com.melhorgrupo.projetofinal.service;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import br.com.melhorgrupo.projetofinal.model.Movimentacao;
import br.com.melhorgrupo.projetofinal.repo.MovimentacaoRepo;

@Component
public class MovimentacaoServiceImpl implements MovimentacaoService{
	@Autowired
	private MovimentacaoRepo repo;
	
	@Override
	public Movimentacao cadastrarMovimentacao(Movimentacao m) {
		return repo.save(m);
	}

	@Override
	public ArrayList<Movimentacao> recuperarTodos(int conta) {
		return (ArrayList<Movimentacao>) repo.findAll();
	}
	
}
