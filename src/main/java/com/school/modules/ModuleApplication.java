package com.school.modules;

import com.school.modules.repositories.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ModuleApplication implements CommandLineRunner {

	@Autowired
	private ModuleRepository moduleRepository;

	public static void main(String[] args) {
		System.getProperties().put( "server.port", 8082 );
		SpringApplication.run(ModuleApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {


	}
}
