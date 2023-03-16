package br.com.melhorgrupo.projetofinal.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.melhorgrupo.projetofinal.model.Conta;
import br.com.melhorgrupo.projetofinal.model.Movimentacao;
import br.com.melhorgrupo.projetofinal.repo.MovimentacaoRepo;

@Component
public class MovimentacaoServiceImpl implements MovimentacaoService{
	@Autowired
	private MovimentacaoRepo repo;
	private ContaService service;
	
	@Override
	public Movimentacao cadastrarMovimentacao(Movimentacao m) {
		Conta c = m.getNumConta();
		double saldo = c.getSaldo();
		if (saldo >= m.getValor()) {
			c.setSaldo(c.getSaldo() - saldo);
			return repo.save(service.alterarDados(c));
		}
		return repo.save(m);
	}

	@Override
	public ArrayList<Movimentacao> recuperarTodos(int conta) {
		Conta c = new Conta();
		c.setNumeroConta(conta);
		return (ArrayList<Movimentacao>) repo.findByNumConta(c);
	}
	
}
