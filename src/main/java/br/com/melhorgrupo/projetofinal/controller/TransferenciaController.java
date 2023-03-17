package br.com.melhorgrupo.projetofinal.controller;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.melhorgrupo.projetofinal.model.Movimentacao;
import br.com.melhorgrupo.projetofinal.service.ExtratoService;
import br.com.melhorgrupo.projetofinal.service.TransferenciaService;

@RestController
public class TransferenciaController {
	
	@Autowired
	private TransferenciaService service;
	
	@Autowired
	private ExtratoService ext;
	
	@GetMapping("/transferencia")
	public ResponseEntity<?> transferencia(@RequestParam int contaOrigem, int contaDestino, double valor){
		if (service.transferirValores(contaOrigem, contaDestino, valor)) {
			return ResponseEntity.ok(null);
		}
		return ResponseEntity.status(400).build();
	}
	
	@GetMapping("/extrato")
	public ResponseEntity<?> exibirExtrato(@RequestParam int idConta, LocalDate dataInicio, LocalDate dataFim) {
		ArrayList<Movimentacao> lista = ext.listarMovimentacao(idConta, dataInicio, dataFim);
		if (lista != null){
		return ResponseEntity.ok(lista);
		}
		return ResponseEntity.notFound().build();
	}
}
