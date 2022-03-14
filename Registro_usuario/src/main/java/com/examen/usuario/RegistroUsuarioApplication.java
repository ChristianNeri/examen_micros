package com.examen.usuario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class RegistroUsuarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistroUsuarioApplication.class, args);
	}

}
