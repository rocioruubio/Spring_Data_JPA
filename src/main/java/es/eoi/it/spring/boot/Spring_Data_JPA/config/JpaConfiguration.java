package es.eoi.it.spring.boot.Spring_Data_JPA.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "customAuditorAware")
public class JpaConfiguration {
}