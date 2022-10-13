package com.company.volksdevSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;

@SpringBootApplication
public class VolksdevSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(VolksdevSpringApplication.class, args);
	}

	HashSet set1 = new HashSet();
	set1.add("rufet");
}
