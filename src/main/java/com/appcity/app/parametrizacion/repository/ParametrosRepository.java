package com.appcity.app.parametrizacion.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import com.appcity.app.parametrizacion.models.Parametros;

public interface ParametrosRepository extends MongoRepository<Parametros, String>{

	@RestResource(path="buscar-parametros")
	public Parametros findByUsername(@Param("username") String username);
	
}
