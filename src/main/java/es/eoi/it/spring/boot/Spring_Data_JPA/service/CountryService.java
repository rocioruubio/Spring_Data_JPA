package es.eoi.it.spring.boot.Spring_Data_JPA.service;

import java.util.List;
import java.util.Optional;

import es.eoi.it.spring.boot.Spring_Data_JPA.entity.Country;
import es.eoi.it.spring.boot.Spring_Data_JPA.repository.CountryRepository;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    private final CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public List<Country> findAll() {
        return countryRepository.findAll();
    }

    public Optional<Country> findById(Long id) {
        return countryRepository.findById(id);
    }

    public Long insert(Country country) {
        country.setId(null);
        return countryRepository.save(country).getId();
    }
}