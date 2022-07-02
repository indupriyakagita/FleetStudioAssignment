package com.example.assignment.springboot.sample.controller;

import com.example.assignment.springboot.sample.entity.Location;
import com.example.assignment.springboot.sample.error.LocationNotFoundException;
import com.example.assignment.springboot.sample.repository.LocationRepository;
import com.example.assignment.springboot.sample.service.LocationService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.awt.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(LocationController.class)
class LocationControllerTest {

    @MockBean
    LocationService locationService;

    @Autowired
    MockMvc mockMvc;

    private Location location;

    @BeforeEach
    void setUp() {
        Location location = new Location().builder()
                .fips(01001L)
                .state("AL")
                .name("Autauga")
                .build();
    }

    @Test
    public void testFetchLocationById() throws Exception {
        Mockito.when(locationService.fetchLocationById(01001L)).thenReturn(location);
        mockMvc.perform(MockMvcRequestBuilders.get("/details/01001")
                .accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
    }

}