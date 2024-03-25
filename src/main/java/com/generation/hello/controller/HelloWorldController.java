package com.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")
public class HelloWorldController {

	@GetMapping() // Requisões do Tipo GET/busca
	public String hello() {
		return "Hello World <br> Comunicação <br> Trabalho em equipe <br> Proatividade <br> Orinetação ao futuro";

	 }
	
	
}
