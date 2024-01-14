package com.devlucasmartins.labpadroes.repository;

import com.devlucasmartins.labpadroes.model.ClienteModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<ClienteModel, Long> {
    public ClienteModel getById(Long id);
}
