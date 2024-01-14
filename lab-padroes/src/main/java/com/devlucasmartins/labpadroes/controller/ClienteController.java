package com.devlucasmartins.labpadroes.controller;

import com.devlucasmartins.labpadroes.model.ClienteModel;
import com.devlucasmartins.labpadroes.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("clientes")
public class ClienteController {
    private final ClienteService service;

    @GetMapping
    public ResponseEntity<Iterable<ClienteModel>> buscarTodos() {
        return ResponseEntity.ok(service.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteModel> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<ClienteModel> inserir(@RequestBody ClienteModel clienteModel) {
        service.inserir(clienteModel);
        return ResponseEntity.ok(clienteModel);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ClienteModel> atualizar(@PathVariable Long id, @RequestBody ClienteModel clienteModel) {
        service.atualizar(id, clienteModel);
        return ResponseEntity.ok(clienteModel);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deletar(id);
    }
}
