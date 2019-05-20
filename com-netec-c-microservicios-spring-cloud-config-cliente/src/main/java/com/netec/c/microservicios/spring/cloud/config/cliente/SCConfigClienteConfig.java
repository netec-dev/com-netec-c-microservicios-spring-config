package com.netec.c.microservicios.spring.cloud.config.cliente;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
public class SCConfigClienteConfig {

	@Value("${demo.string:SIN PROPIEDAD}")
	private String demoString;
	@Value("${demo.int.propiedad:404}")
	private int demoInt;
	@Value("${demo.nombreArchivo:VALOR OMISION}")
	private String demoNombreArchivo;

	public String obtenLasPropiedades() {
		StringBuilder sb = new StringBuilder();
		sb.append("PROPIEDADES DESDE EL SERVICIO DE CONFIGURACIÓN").append("<br>");
		sb.append("demo.string:").append(demoString).append("<br>");
		sb.append("demo.int.propiedad:").append(demoInt).append("<br>");
		sb.append("demo.demoNombreArchivo:").append(demoNombreArchivo).append("<br>");
		return sb.toString();
	}

}