package com.example.assignment.springboot.sample.service;

import com.example.assignment.springboot.sample.entity.Location;
import com.example.assignment.springboot.sample.error.LocationNotFoundException;
import com.example.assignment.springboot.sample.repository.LocationRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LocationServiceTest {


    @Autowired
    private LocationServiceImpl locationService;

    @MockBean
    private LocationRepository locationRepository;

    private Location location;

    @BeforeEach
    void setUp() {
        Location location = Location.builder()
                .fips(01001L)
                .state("AL")
                .name("Autauga")
                .build();
        Mockito.when(locationRepository.findById(01001L)).thenReturn(java.util.Optional.ofNullable(location));

    }

    @Test
    public void testFetchLocationById() throws LocationNotFoundException {

        long id = 01001L;
        Location location = locationService.fetchLocationById(id);
        assertEquals(id, location.getFips());
    }

    @Test
    public void testFetchLocationByState() {
        Location location1 = new Location().builder()
                .fips(01231L)
                .state("AL")
                .name("Blount")
                .build();
        List<Location> locationList = new ArrayList<Location>();
        locationList.add(location);
        locationList.add(location1);
        Mockito.when(locationRepository.findByState("AL")).thenReturn(locationList);
        List<Location> locationList1 = locationService.fetchLocationList();
        assertThat(locationList).isNotNull();
    }

}