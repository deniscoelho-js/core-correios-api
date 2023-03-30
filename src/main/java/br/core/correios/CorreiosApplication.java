package br.core.correios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@EnableJpaRepositories
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class CorreiosApplication {
    public static void main(String[] args) {
        SpringApplication.run(CorreiosApplication.class, args);
    }
}
