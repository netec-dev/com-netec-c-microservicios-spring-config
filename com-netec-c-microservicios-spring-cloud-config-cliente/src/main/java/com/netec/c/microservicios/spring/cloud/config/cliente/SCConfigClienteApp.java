package com.netec.c.microservicios.spring.cloud.config.cliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SCConfigClienteApp {

	public static void main(String[] args) {
		SpringApplication.run(SCConfigClienteApp.class, args);
	}

}
