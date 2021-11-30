package com.panoramic.fist.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.panoramic.fist.dto.FlightDTO;
import com.panoramic.fist.services.FlightService;

@RestController
@RequestMapping(value = "/flights")
public class FlightController {

	private FlightService flightService;
	
	public FlightDTO findById(@PathVariable Integer id) {
		return flightService.findById(id);
	}
	

	
}
