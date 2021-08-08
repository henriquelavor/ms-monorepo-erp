package com.henriquelavor.hrpayroll.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

	@Bean
	public RestTemplate restTemplate() { // Registra uma instancia Unica (Sigleton)  do tipo RestTemplate
		return new RestTemplate();
	}

}
