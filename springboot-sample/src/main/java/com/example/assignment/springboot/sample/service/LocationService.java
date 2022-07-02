package com.example.assignment.springboot.sample.service;

import com.example.assignment.springboot.sample.entity.Location;
import com.example.assignment.springboot.sample.error.LocationNotFoundException;

import java.util.List;

public interface LocationService {
    List<Location> fetchLocationList();

    List<Location> saveAll(List<Location> locations);

    Location fetchLocationById(Long fips) throws LocationNotFoundException;

    List<Location> fetchLocationByState(String state);

    List<Location> fetchLocationByName(String name);
}
