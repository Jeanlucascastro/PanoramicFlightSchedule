package com.panoramic.fist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.panoramic.fist.entities.Flight;
import com.panoramic.fist.repositories.FlightRepository;

@Service
@Configurable
public class FlightService {
	
	@Autowired
	private FlightRepository flightRepository;
	
	public Page<Flight> findall(Pageable pageable){
		flightRepository.findAll();
		Page<Flight> result = flightRepository.findAll(pageable);
		return result;
	}

	public Flight findById(Integer id) {
		Flight entity = flightRepository.findById(id).get();
		return entity;
	}
	
	public List<Flight> findall(){
		return flightRepository.findAll();
	}
	
	public Flight insert(Flight fly) {
		
		return flightRepository.save(fly);
	}
	
	public String teste(Flight fly) {
		return fly.toString() + "TESTESTETESTE";
	}
	
	
	
}
