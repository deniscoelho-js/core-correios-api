package br.core.correios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories(basePackages = "br.core.correios.repository")
@SpringBootApplication
@Configuration
public class CorreiosApplication {
    public static void main(String[] args) {
        SpringApplication.run(CorreiosApplication.class, args);
    }
}
