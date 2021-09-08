package es.eoi.it.spring.boot.Spring_Data_JPA.controller;

import es.eoi.it.spring.boot.Spring_Data_JPA.entity.Country;
import es.eoi.it.spring.boot.Spring_Data_JPA.service.CountryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(CountryRestController.COUNTRY_RESOURCE)
public class CountryRestController {

    public static final String COUNTRY_RESOURCE = "/api/country";
    public CountryService countryService;

    @GetMapping(value = "/{id}/")
    public ResponseEntity<Country> getById(@PathVariable("id") Long id) {
        Optional<Country> country = countryService.findById(id);
        return country.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(null, HttpStatus.NOT_FOUND));
    }

}


