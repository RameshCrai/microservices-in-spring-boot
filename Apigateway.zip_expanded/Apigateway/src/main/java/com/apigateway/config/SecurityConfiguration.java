package com.apigateway.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
@EnableWebFluxSecurity
@ConfigurationProperties
public class SecurityConfiguration {
	
	@Bean	
	SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity httpSecurity) {
		
	
		httpSecurity
		          .authorizeExchange()
		          .anyExchange()
		          .authenticated()
		          .and()
		          .oauth2Login()
		          .and()
		          .oauth2ResourceServer()
		          .jwt();
		
		
		return httpSecurity.build();
		
	}
	
		
	
	

}
