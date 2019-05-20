package com.netec.c.microservicios.spring.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.monitor.GithubPropertyPathNotificationExtractor;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class SCConfigServidorApp {
	public static void main(String[] args) {
		SpringApplication.run(SCConfigServidorApp.class, args);
	}

	@Bean
//	@ConditionalOnProperty(value = "spring.cloud.config.server.monitor.github.enabled", havingValue = "true", matchIfMissing = true)
	public GithubPropertyPathNotificationExtractor githubPropertyPathNotificationExtractor() {
		return new GithubPropertyPathNotificationExtractor();
	}

//	@Bean
//	public GithubPropertyPathNotificationExtractor githubPropertyPathNotificationExtractor() {
//	  return new GithubPropertyPathNotificationExtractor();
//	}
}
