package br.com.ribeiro.spring_boot_essentials;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringBootEssentialsApplication {
	public static void main(String[] args) {
		System.setProperty("spring.jpa.hibernate.ddl-auto", "create");
		System.setProperty("spring.jpa.show-sql", "true");
		SpringApplication.run(SpringBootEssentialsApplication.class, args);
	}

}
