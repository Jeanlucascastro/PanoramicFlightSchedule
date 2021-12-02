package com.panoramic.fist.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.panoramic.fist.dto.FlightDTO;
import com.panoramic.fist.entities.Flight;
import com.panoramic.fist.services.FlightService;

@RestController
@RequestMapping(value = "/flights")
public class FlightController {

	private FlightService flightService;
	
	
	@GetMapping()
	public FlightDTO findById(@PathVariable Integer id) {
		return flightService.findById(id);
	}
	
	@PostMapping
	public ResponseEntity<Flight> insert (@RequestBody Flight fly){
		fly = flightService.insert(fly);
		return ResponseEntity.ok().body(fly);
	}

	
}