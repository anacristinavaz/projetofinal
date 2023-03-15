package br.com.melhorgrupo.projetofinal.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.melhorgrupo.projetofinal.model.Cliente;
import br.com.melhorgrupo.projetofinal.model.Conta;
import br.com.melhorgrupo.projetofinal.repo.ContaRepo;

@Component
public class ContaServiceImpl implements ContaService {
	
	@Autowired
	private ContaRepo repo;

	@Override
	public Conta adicionarConta(Conta c) {
		
		return repo.save(c);
	}

	@Override
	public Conta recuperarPeloNumero(int numero) {
		
		return repo.findById(numero).orElse(null);
	}

	@Override
	public Conta alterarDados(Conta c) {
		if (c.getNumeroConta() == 0) {
			return null;
		}
		return repo.save(c);
	}

	@Override
	public ArrayList<Conta> recuperarContasPeloCliente(int idc) {
		Cliente cl = new Cliente();
		cl.setIdCliente(idc);
		return (ArrayList <Conta>)repo.findByCliente(cl);
	}
	
}
