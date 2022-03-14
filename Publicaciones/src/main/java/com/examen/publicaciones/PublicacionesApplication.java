package com.examen.publicaciones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class PublicacionesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PublicacionesApplication.class, args);
	}

}
