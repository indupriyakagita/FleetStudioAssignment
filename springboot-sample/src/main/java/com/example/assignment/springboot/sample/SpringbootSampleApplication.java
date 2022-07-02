package com.example.assignment.springboot.sample;

import com.example.assignment.springboot.sample.entity.Location;
import com.example.assignment.springboot.sample.service.LocationService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Properties;

@SpringBootApplication
@Slf4j
public class SpringbootSampleApplication {

	private final String JSON_PATH = "/json/data.json";

	private final Logger LOGGER = LoggerFactory.getLogger("SpringbootSampleApplication");

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSampleApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(LocationService locationService) {
		return args -> {
			try {
				ObjectMapper mapper = new ObjectMapper();
				TypeReference<List<Location>> typeReference = new TypeReference<List<Location>>() {
				};
				InputStream inputStream = TypeReference.class.getResourceAsStream(JSON_PATH);
				List<Location> locations = mapper.readValue(inputStream, typeReference);
				if (locations != null && !locations.isEmpty()) {
					List<Location> locationList = locationService.saveAll(locations);
					LOGGER.info("locations list is saved and the size is " + locationList.size());
				}
			} catch (Exception e) {
				System.out.println("error loading the location details" +e.getMessage());
			}

		};

	}
}
