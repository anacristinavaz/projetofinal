package br.com.melhorgrupo.projetofinal.service;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.melhorgrupo.projetofinal.model.Conta;
import br.com.melhorgrupo.projetofinal.model.Movimentacao;

public class TransferenciaServiceImpl implements TransferenciaService{
	@Autowired
	private MovimentacaoService movi;
	@Autowired
	private ContaService cont;
	
	@Override
	public boolean transferirValores(int contaOrigem, int contaDestino, double valor) {
		Conta co = cont.recuperarPeloNumero(contaOrigem);
		Conta cd = cont.recuperarPeloNumero(contaDestino);
		if (co.getSaldo() >= valor) {
			Movimentacao mo = new Movimentacao();
			mo.setTipoOperacao(2);
			mo.setValor(valor);
			mo.setNumConta(co);
			mo.setDescricao("transferencia");
			Movimentacao md = new Movimentacao();
			md.setTipoOperacao(1);
			md.setValor(valor);
			md.setNumConta(cd);
			md.setDescricao("transferencia");
			movi.cadastrarMovimentacao(mo);
			movi.cadastrarMovimentacao(md);
			return true;
		}
		return false;
	}

}
