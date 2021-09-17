package com.appcity.app.parametrizacion.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.appcity.app.parametrizacion.models.Proyectos;


@FeignClient(name = "app-muro")
public interface MuroFeignClient {

	@GetMapping("/proyectos/listar")
	public List<Proyectos> getProyectos();
	
}
