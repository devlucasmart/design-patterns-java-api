package com.devlucasmartins.labpadroes.service.impl;

import com.devlucasmartins.labpadroes.comum.exception.ValidacaoException;
import com.devlucasmartins.labpadroes.model.ClienteModel;
import com.devlucasmartins.labpadroes.repository.ClienteRepository;
import com.devlucasmartins.labpadroes.repository.EnderecoRepository;
import com.devlucasmartins.labpadroes.service.ClienteService;
import com.devlucasmartins.labpadroes.service.ViaCepService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository repository;
    private final EnderecoRepository enderecoRepository;
    private final ViaCepService cepService;

    @Override
    public Iterable<ClienteModel> buscarTodos() {
        return repository.findAll();
    }

    @Override
    public ClienteModel buscarPorId(Long id) {
        return repository.getById(id);
    }

    @Override
    public void inserir(ClienteModel cliente) {
        salvarClienteComCep(cliente);
    }

    @Override
    public void atualizar(Long id, ClienteModel cliente) {
        var clienteBd = repository.findById(id);
        if (clienteBd.isPresent()) {
            salvarClienteComCep(cliente);
        } else {
            throw new ValidacaoException("Cliente não Existe");
        }
    }

    @Override
    public void deletar(Long id) {
        repository.deleteById(id);
    }

    private void salvarClienteComCep(ClienteModel cliente) {
        var cep = cliente.getEndereco().getCep();
        var endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            var novoEndereco = cepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });

        cliente.setEndereco(endereco);
        repository.save(cliente);
    }
}
