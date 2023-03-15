package br.com.melhorgrupo.projetofinal.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.melhorgrupo.projetofinal.model.Movimentacao;
import br.com.melhorgrupo.projetofinal.service.MovimentacaoService;

@RestController
public class MovimentacaoController {
	@Autowired
	private MovimentacaoService service;
	
	@PostMapping("/movimentacao")
	public ResponseEntity<Movimentacao> novaMovimentacao(@RequestBody Movimentacao m){
		Movimentacao mov = service.cadastrarMovimentacao(m);
		if (mov != null) {
			return ResponseEntity.ok(mov);
		}
		return ResponseEntity.notFound().build();
	}
	
	@GetMapping("/movimentacao/{id}")
	public ResponseEntity<?> todaMoviPorConta(@PathVariable int num){
		ArrayList<Movimentacao> lista = service.recuperarTodos(num);
		if (lista != null) {
			return ResponseEntity.ok(lista);
		}
		return ResponseEntity.notFound().build();
	}
}
