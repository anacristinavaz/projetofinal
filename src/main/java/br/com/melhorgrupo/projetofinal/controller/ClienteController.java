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


    @GetMapping
    public ResponseEntity<ArrayList<Cliente>> listarClientes() {
        ArrayList<Cliente> c = service.recuperarTodos();
        return new ResponseEntity<>(c, HttpStatus.OK);
    }


    @GetMapping("/clientes/{id}")
    public ResponseEntity<Cliente> recuperarClientePorId(@PathVariable int id) {
        Cliente c = service.recuperarPeloID(id);
        if (c == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(c);
        }
    }

    @PostMapping("/clientes")
    public ResponseEntity<Cliente> cadastrarCliente(@RequestBody Cliente c) {
        Cliente novoCliente = service.cadastrarCliente(c);
        if (novoCliente == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        } else {
            return ResponseEntity.status(HttpStatus.CREATED).body(novoCliente);
        }
    }


}
