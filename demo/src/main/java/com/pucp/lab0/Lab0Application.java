package com.pucp.lab0;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;
import java.util.List;

@SpringBootApplication
public class Lab0Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab0Application.class, args);
		System.out.println("Hola Mundo");
		List<String> lista = List.of("Elemento1", "Elemento2", "Elemento3");
		for (String s : lista) {
			System.out.println("elemento: " + s);
		}
	}
}
