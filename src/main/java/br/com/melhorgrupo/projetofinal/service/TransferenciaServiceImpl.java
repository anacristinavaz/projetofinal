package br.com.melhorgrupo.projetofinal.service;

import org.springframework.beans.factory.annotation.Autowired;

public class TransferenciaServiceImpl implements TransferenciaService{
	@Autowired
	private MovimentacaoService serviceMovi;
	
	@Override
	public boolean transferirValores(int contaOrigem, int contaDestino, double valor) {
		serviceMovi(contaOrigem);
		return false;
	}

}
