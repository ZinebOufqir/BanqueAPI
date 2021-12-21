package com.example.banque;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.banque.web.CompteRESTJaxRSAPI;

@Configuration
public class MyConfig {
	
    //@Bean
	public ResourceConfig resourceConfig() {
		ResourceConfig jerseyServlet = new ResourceConfig();
		jerseyServlet.register(CompteRESTJaxRSAPI.class);
		return jerseyServlet;
	}
}
