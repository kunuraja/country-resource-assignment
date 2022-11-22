package com.raj.countryresourceassignment.service;

import com.raj.countryresourceassignment.model.Country;
import com.raj.countryresourceassignment.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryResourceService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getAllCountries(String keyword) {
        return countryRepository.findAllByName(keyword);
    }

    public Page<Country> getCountryWithPaginationAndSorting(int offset, int pageSize, String field) {
        return countryRepository.findAllCountries(PageRequest.of(offset, pageSize).withSort(Sort.by(field)));
    }


}
