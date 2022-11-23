package com.raj.countryresourceassignment.loader;

import com.raj.countryresourceassignment.model.Country;
import com.raj.countryresourceassignment.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CountryLoader implements ApplicationListener<ContextRefreshedEvent> {

    private CountryRepository countryRepository;

    @Autowired
    public void setCountryRepository(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        List<Country> countries = new ArrayList<>();
        countries.add(new Country(1L,"Afghanistan","AFG"));
        countries.add(new Country(2L,"Albania","ALB"));
        countries.add(new Country(3L,"Algeria","DZA"));
        countries.add(new Country(4L,"American Samoa","ASM"));
        countries.add(new Country(5L,"Andorra","AND"));
        countries.add(new Country(6L,"Angola","AGO"));
        countries.add(new Country(7L,"Bosnia and Herzegovina","BIH"));
        countries.add(new Country(8L,"Botswana","BWA"));
        countries.add(new Country(9L,"Central African Republic (the)","CAF"));
        countries.add(new Country(10L,"Dominican Republic (the)","SLV"));
        countries.add(new Country(11L,"Falkland Islands (the) [Malvinas]","FLK"));
        countries.add(new Country(12L,"Heard Island and McDonald Islands","HMD"));
        countries.add(new Country(13L,"Iran (Islamic Republic of)","JPN"));
        countries.add(new Country(14L,"Lao People's Democratic Republic (the)","LAO"));
        countryRepository.saveAll(countries);
      /*  country.setCountryId(1L);
        country.setCountryName("Afghanistan");
        country.setAlpha3Code("ALB"));*/

        /*country.setCountryId(3L);
        country.setCountryName("Algeria");
        country.setAlpha3Code("DZA");

        country.setCountryId(4L);
        country.setCountryName("American Samoa");
        country.setAlpha3Code("ASM");

        country.setCountryId(5L);
        country.setCountryName("Andorra");
        country.setAlpha3Code("AND");

        country.setCountryId(6L);
        country.setCountryName("Angola");
        country.setAlpha3Code("AGO");

        country.setCountryId(7L);
        country.setCountryName("Bosnia and Herzegovina");
        country.setAlpha3Code("BIH");

        country.setCountryId(8L);
        country.setCountryName("Botswana");
        country.setAlpha3Code("BWA");

        country.setCountryId(9L);
        country.setCountryName("Central African Republic (the)");
        country.setAlpha3Code("CAF");

        country.setCountryId(10L);
        country.setCountryName("Dominican Republic (the)");
        country.setAlpha3Code("SLV");

        country.setCountryId(11L);
        country.setCountryName("Falkland Islands (the) [Malvinas]");
        country.setAlpha3Code("FLK");

        country.setCountryId(12L);
        country.setCountryName("Heard Island and McDonald Islands");
        country.setAlpha3Code("HMD");

        country.setCountryId(13L);
        country.setCountryName("Iran (Islamic Republic of)");
        country.setAlpha3Code("IRN");

        country.setCountryId(14L);
        country.setCountryName("Japan");
        country.setAlpha3Code("JPN");

        country.setCountryId(15L);
        country.setCountryName("Lao People's Democratic Republic (the)");
        country.setAlpha3Code("LAO");*/



    }

}

