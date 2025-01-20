package de.gorbatykh.spring_boot.property_resolving_bug;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootPropertyResolvingBugApplication {
    private static final Logger log = LoggerFactory.getLogger(SpringBootPropertyResolvingBugApplication.class);

    @Value("${app.a-service-url}")
    private String aServiceUrl;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootPropertyResolvingBugApplication.class, args);
    }

    @Bean
    public CommandLineRunner aServiceUrlPrinter() {
        return args -> log.info("A-Service URL: {}", aServiceUrl);
    }
}
