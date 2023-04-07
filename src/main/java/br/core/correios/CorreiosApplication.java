package br.core.correios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories(basePackages = "br.core.correios.repository")
@SpringBootApplication
@Configuration
public class CorreiosApplication {

    private static ConfigurableApplicationContext ctx;

    public static void main(String[] args) {
        ctx = SpringApplication.run(CorreiosApplication.class, args);
    }

    public static void close(int code){
    SpringApplication.exit(ctx, () -> code);
    }
}
