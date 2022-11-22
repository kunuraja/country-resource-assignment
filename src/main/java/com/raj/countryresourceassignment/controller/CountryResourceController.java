package com.raj.countryresourceassignment.controller;

import com.raj.countryresourceassignment.model.Country;
import com.raj.countryresourceassignment.service.CountryResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CountryResourceController {

    @Autowired
    private CountryResourceService countryResourceService;

    @RequestMapping(method = RequestMethod.GET, value= "/welcome")
    public ResponseEntity<?> welcome(){

        return new ResponseEntity<>("Welcome !!", HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value= "/countries")
    public ResponseEntity<?> findAllCountries(//@PathVariable String keyword,
                                              @Param("keyword") String keyword){
        List<Country> countryList =  countryResourceService.getAllCountries(keyword);
        return new ResponseEntity<>(countryList, HttpStatus.OK);
    }

    @GetMapping(value = "/countries/{offset}/{pageSize}/{field}")
    public ResponseEntity<?> findAllCountries(@PathVariable int offset,
                                              @PathVariable int pageSize,
                                              @PathVariable String field){
        Page<Country> pagedCountryList =  countryResourceService.getCountryWithPaginationAndSorting(offset,pageSize,field);
        return new ResponseEntity<>(pagedCountryList, HttpStatus.OK);
    }



}
