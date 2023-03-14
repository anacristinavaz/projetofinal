package br.com.melhorgrupo.projetofinal.service;

import java.util.ArrayList;
import br.com.melhorgrupo.projetofinal.model.Movimentacao;


public interface MovimentacaoService {
	 public Movimentacao cadastrarMovimentacao(Movimentacao m);
	 public ArrayList<Movimentacao> recuperarTodos(int conta);
}
