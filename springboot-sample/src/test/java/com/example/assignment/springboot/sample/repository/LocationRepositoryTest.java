package com.example.assignment.springboot.sample.repository;

import com.example.assignment.springboot.sample.entity.Location;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.Arrays;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@ContextConfiguration
class LocationRepositoryTest {

    @Autowired
    private LocationRepository locationRepository;

    @BeforeEach
    void setUp() {
        List<Location> locationList = Arrays.asList(
                new Location(01001L,"AL","Autauga"),
                new Location(01231L,"KY","Carroll"),
                new Location(01321L,"KY","Carter"),
                new Location(01021L,"AR","Lee"));
        locationRepository.saveAll(locationList);
    }


    @Test
    public void testFindLocationByState() {
        String state = "KY";
        List<Location> locationList = locationRepository.findByState(state);
        assertEquals(2,locationList.size());
    }

    @Test
    public void testFindById() {
        long fips = 01001L;
        Location location = locationRepository.findById(fips).get();
        assertEquals(location.getName(),"Autauga");
    }
}