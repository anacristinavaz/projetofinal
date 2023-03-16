package br.com.melhorgrupo.projetofinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.melhorgrupo.projetofinal.service.TransferenciaService;

@RestController
public class TransferenciaController {
	
	@Autowired
	private TransferenciaService service;
	
	@GetMapping("/transferencia")
	public ResponseEntity<?> transferencia(@RequestParam int contaOrigem, int contaDestino, double valor){
		if (service.transferirValores(contaOrigem, contaDestino, valor)) {
			return ResponseEntity.ok(null);
		}
		return ResponseEntity.status(400).build();
	}
}
