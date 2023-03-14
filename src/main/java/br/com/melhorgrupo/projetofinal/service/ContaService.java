package br.com.melhorgrupo.projetofinal.service;

import br.com.melhorgrupo.projetofinal.model.Conta;

public interface ContaService {
	public Conta adicionarConta(Conta c);
	
	public Conta recuperarPeloNumero(int numero);
	
	public Conta alterarDados(Conta c);
	
	public Conta recuperarContasPeloCliente(int idCliente);

}
