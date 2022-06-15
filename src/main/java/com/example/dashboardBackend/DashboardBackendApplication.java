package com.example.dashboardBackend;

import com.example.dashboardBackend.Entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class DashboardBackendApplication implements CommandLineRunner {
	@Autowired
	public RepositoryRestConfiguration restConfiguration ;
	public static void main(String[] args) {
		SpringApplication.run(DashboardBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		restConfiguration.exposeIdsFor(Objectif.class);
		restConfiguration.exposeIdsFor(Agence.class);
		restConfiguration.exposeIdsFor(Compte.class);
		restConfiguration.exposeIdsFor(Mouvement.class);
		restConfiguration.exposeIdsFor(Operation.class);
	}
}
