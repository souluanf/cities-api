package dev.luanfernandes.countries.repositories;

import dev.luanfernandes.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
