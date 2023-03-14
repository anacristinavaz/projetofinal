package br.com.melhorgrupo.projetofinal.controller;

import br.com.melhorgrupo.projetofinal.model.Cliente;
import br.com.melhorgrupo.projetofinal.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @PostMapping("/cadastrar")
    public ResponseEntity<Cliente> cadastrarCliente(@RequestBody Cliente c) {
        Cliente novoCliente = clienteService.cadastrarCliente(c);
        return new ResponseEntity<>(novoCliente, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<ArrayList<Cliente>> listarClientes() {
        ArrayList<Cliente> c = clienteService.recuperarTodos();
        return new ResponseEntity<>(c, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarCliente(@PathVariable("id") Long idCliente) {
        Cliente c = clienteService.recuperarPeloID(Math.toIntExact(idCliente));
        if (c == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(c, HttpStatus.OK);
    }


}
