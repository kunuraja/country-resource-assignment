package com.raj.countryresourceassignment.repository;

import com.raj.countryresourceassignment.model.Country;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends CrudRepository<Country, Long> {
    @Query("SELECT c FROM Country c WHERE lower(c.countryName) LIKE %?1%"
            +"OR lower(c.alpha3Code) LIKE %?1%"                    )
    List<Country> findAllByName(String keyword);

    @Query("SELECT c FROM Country c")
    Page<Country> findAllCountries(PageRequest pageRequest);
}
