package br.com.melhorgrupo.projetofinal.service;
import java.util.ArrayList;

import br.com.melhorgrupo.projetofinal.model.Conta;

public interface ContaService {
	public Conta adicionarConta(Conta c);
	
	public Conta recuperarPeloNumero(int numero);
	
	public Conta alterarDados(Conta c);
	
	public ArrayList<Conta> recuperarContasPeloCliente(int idc);

}
