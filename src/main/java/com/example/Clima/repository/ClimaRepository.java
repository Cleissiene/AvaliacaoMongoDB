package com.example.Clima.repository;

import com.example.Clima.model.ClimaEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClimaRepository extends MongoRepository<ClimaEntity, String> {

}
