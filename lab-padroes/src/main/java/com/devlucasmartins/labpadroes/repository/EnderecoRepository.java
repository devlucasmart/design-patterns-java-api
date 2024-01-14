package com.devlucasmartins.labpadroes.repository;

import com.devlucasmartins.labpadroes.model.EnderecoModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<EnderecoModel, String> {
}
