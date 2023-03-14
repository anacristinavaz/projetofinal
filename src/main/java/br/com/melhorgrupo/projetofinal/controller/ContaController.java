package br.com.melhorgrupo.projetofinal.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.melhorgrupo.projetofinal.model.Cliente;
import br.com.melhorgrupo.projetofinal.model.Conta;
import br.com.melhorgrupo.projetofinal.service.ContaServiceImpl;

@RestController
public class ContaController {
	
	@Autowired
	private ContaServiceImpl service;
	
//	@GetMapping("/contas/{id}")
//	
//	
//	@GetMapping("/contas/cliente/{id}")
//	public ArrayList<Conta> recuperarContasPeloCliente(@PathVariable int id){
//		Cliente c = new Cliente();
//		c.setId_cliente(id);
//		return service.recuperarContasPeloCliente(c);
//	}
	
	
	@PostMapping("/contas/{id}")
	public ResponseEntity<Conta> adicionarConta(@RequestBody Conta c){	
			Conta res = service.adicionarConta(c);
			if (res != null) {
			}
			return ResponseEntity.badRequest().build();
			}
	
	

}
