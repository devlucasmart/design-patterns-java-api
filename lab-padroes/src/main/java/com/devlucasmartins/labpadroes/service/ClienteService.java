package com.devlucasmartins.labpadroes.service;

import com.devlucasmartins.labpadroes.model.ClienteModel;
import org.springframework.stereotype.Service;

@Service
public interface ClienteService {

public Iterable<ClienteModel> buscarTodos();

public ClienteModel buscarPorId(Long id);

public void inserir(ClienteModel cliente);

public void atualizar(Long id, ClienteModel cliente);

public void deletar(Long id);
}

