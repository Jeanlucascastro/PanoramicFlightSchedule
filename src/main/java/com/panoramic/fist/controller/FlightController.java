package com.panoramic.fist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.panoramic.fist.entities.Flight;
import com.panoramic.fist.services.FlightService;

@RestController
@RequestMapping(value = "/flights")
public class FlightController {
	
	@Autowired
	private FlightService flightService;

	@GetMapping(value = "/alllist")
	public ResponseEntity<Page<Flight>> findall(Pageable pageable){
		Page<Flight> list = flightService.findall(pageable);
		return ResponseEntity.ok(list);
	}


	@GetMapping(value = "/all")
	public ResponseEntity<List<Flight>> findall(){
		List<Flight> list = flightService.findall();
		return ResponseEntity.ok(list);
	}

	
	@GetMapping(value = "/{id}")
	public Flight findById(@PathVariable Integer id) {
		return flightService.findById(id);
	}
//	
	@PostMapping
	public ResponseEntity<Flight> insert (@RequestBody Flight fly){
		fly = flightService.insert(fly);
		return ResponseEntity.ok().body(fly);
//		return flightService.teste(fly);

	}
	

	
}
