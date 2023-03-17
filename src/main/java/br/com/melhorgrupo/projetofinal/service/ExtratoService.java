package br.com.melhorgrupo.projetofinal.service;

import java.time.LocalDate;
import java.util.ArrayList;

import br.com.melhorgrupo.projetofinal.model.Movimentacao;

public interface ExtratoService {
	public ArrayList<Movimentacao> listarMovimentacao(int idConta, LocalDate dataInicio, LocalDate dataFim);
}
