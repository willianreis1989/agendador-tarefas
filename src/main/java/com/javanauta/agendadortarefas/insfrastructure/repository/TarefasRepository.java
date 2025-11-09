package com.javanauta.agendadortarefas.insfrastructure.repository;

import com.javanauta.agendadortarefas.insfrastructure.entity.TarefasEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefasRepository extends MongoRepository<TarefasEntity, String> {
}
