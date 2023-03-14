package br.com.melhorgrupo.projetofinal.controller;

import br.com.melhorgrupo.projetofinal.model.Cliente;
import br.com.melhorgrupo.projetofinal.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

import static org.springframework.http.HttpStatus.*;

@RestController
public class ClienteController {
    @Autowired
    private ClienteService service;

    @PostMapping("/clientes")
    public ResponseEntity<Cliente> cadastrarCliente(@RequestBody Cliente c) {
        Cliente novoCliente = service.cadastrarCliente(c);
        return new ResponseEntity<>(novoCliente, CREATED);
    }

    @GetMapping("/clientes")
    public ResponseEntity<ArrayList<Cliente>> listarClientes() {
        ArrayList<Cliente> c = service.recuperarTodos();
        return new ResponseEntity<>(c,OK);
    }



}
