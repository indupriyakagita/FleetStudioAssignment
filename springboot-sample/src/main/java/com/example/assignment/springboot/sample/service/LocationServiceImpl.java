package com.example.assignment.springboot.sample.service;

import com.example.assignment.springboot.sample.entity.Location;
import com.example.assignment.springboot.sample.error.LocationNotFoundException;
import com.example.assignment.springboot.sample.repository.LocationRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class LocationServiceImpl implements LocationService{

    private final Logger LOGGER = LoggerFactory.getLogger("LocationServiceImpl");
    @Autowired
    LocationRepository locationRepository;

    @Override
    public List<Location> fetchLocationList() {
        LOGGER.info("Inside fetchLocationList of LocationServiceImpl");
        return locationRepository.findAll();
    }

    @Override
    public List<Location> saveAll(List<Location> locations) {
        LOGGER.info("Inside saveAll of LocationServiceImpl");
        return locationRepository.saveAll(locations);
    }

    @Override
    public Location fetchLocationById(Long fips) throws LocationNotFoundException {
        LOGGER.info("Inside fetchLocationById of LocationServiceImpl");
        Optional<Location> location = locationRepository.findById(fips);

        if(!location.isPresent())
        {
            throw new LocationNotFoundException("Location not available");
        }
        return location.get();
    }

    @Override
    public List<Location> fetchLocationByState(String state) {
        LOGGER.info("Inside fetchLocationByState of LocationServiceImpl");
        return locationRepository.findByState(state);
    }

    @Override
    public List<Location> fetchLocationByName(String name) {
        LOGGER.info("Inside fetchLocationByName of LocationServiceImpl starting with " + name);
        return locationRepository.findByNameStartingWith(name);
    }
}
