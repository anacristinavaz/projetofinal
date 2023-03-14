package br.com.melhorgrupo.projetofinal.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.melhorgrupo.projetofinal.model.Conta;
import br.com.melhorgrupo.projetofinal.model.Movimentacao;
import br.com.melhorgrupo.projetofinal.service.MovimentacaoService;

@RestController
public class MovimentacaoController {
	@Autowired
	private MovimentacaoService service;
	
	@PostMapping("/movimentacao")
	public ResponseEntity<Movimentacao> novaMovimentacao(Movimentacao m){
		Movimentacao mov = service.cadastrarMovimentacao(m);
		if (mov != null) {
			return ResponseEntity.ok(mov);
		}
		return ResponseEntity.notFound().build();
	}
	
	@GetMapping("/movimentacao/{id}")
	public ResponseEntity<?> todaMoviPorConta(Conta c){
		ArrayList<Movimentacao> lista = (ArrayList<Movimentacao>)service.recuperarTodos(c);
		if (lista != null) {
			return ResponseEntity.ok(lista);
		}
		return ResponseEntity.notFound().build();
	}
}
