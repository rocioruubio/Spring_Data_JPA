package es.eoi.it.spring.boot.Spring_Data_JPA.repository;

import es.eoi.it.spring.boot.Spring_Data_JPA.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long>{

}