package es.eoi.it.spring.boot.Spring_Data_JPA;

import es.eoi.it.spring.boot.Spring_Data_JPA.controller.CustomProperties;
import es.eoi.it.spring.boot.Spring_Data_JPA.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableConfigurationProperties(CustomProperties.class)
public class SpringDataJpaApplication extends SpringBootServletInitializer {

	private static final Logger logger = LoggerFactory.getLogger(SpringDataJpaApplication.class);

	@Autowired
	CountryService countryService;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

//	@Override
//	public void run(String... arg0) throws Exception {
//		logger.info(String.valueOf(countryService.findAll().size()));
//	}

}