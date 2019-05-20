package com.netec.c.microservicios.spring.cloud.config.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SCConfigClienteController {

	@Autowired
	SCConfigClienteConfig conf;

	@GetMapping("/propDemo")
	public String leePropDemo() {
		return conf.obtenLasPropiedades();
	}

}
