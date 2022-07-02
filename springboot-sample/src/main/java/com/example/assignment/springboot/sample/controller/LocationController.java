package com.example.assignment.springboot.sample.controller;

import com.example.assignment.springboot.sample.entity.Location;
import com.example.assignment.springboot.sample.error.LocationNotFoundException;
import com.example.assignment.springboot.sample.service.LocationService;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/details")
@Slf4j
public class LocationController {

    private final Logger LOGGER = LoggerFactory.getLogger("LocationController");

    @Autowired
    LocationService locationService;

    @GetMapping("/")
    public List<Location> fetchLocationList(){
        LOGGER.info("Inside fetchLocationList of LocationController");
     return locationService.fetchLocationList();
    }

    @GetMapping("/{id}")
    public Location fetchLocationById(@PathVariable("id") Long fips) throws LocationNotFoundException {
        LOGGER.info("Inside fetchLocationById of LocationController");
        return locationService.fetchLocationById(fips);
    }

    @GetMapping("/states/{state}")
    public List<Location> fetchLocationByState(@PathVariable("state") String state){
        LOGGER.info("Inside fetchLocationByState of LocationController");
        return locationService.fetchLocationByState(state);
    }

    @GetMapping("/state/{name}")
    public List<Location> fetchLocationByName(@PathVariable("name") String name){
        LOGGER.info("Inside fetchLocationByName of LocationController starting with " + name);
        return locationService.fetchLocationByName(name);
    }


}
