package com.springsakila;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSakilaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringSakilaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Aplicación arrancada");

	}
}
