package com.panoramic.fist.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.panoramic.fist.dto.FlightDTO;
import com.panoramic.fist.entities.Flight;
import com.panoramic.fist.repositories.FlightRepository;

@Service
public class FlightService {
	
	@Autowired
	private FlightRepository flightRepository;
	
	public FlightDTO findById(Integer id) {
		Flight entity = flightRepository.findById(id).get();
		FlightDTO dto = new FlightDTO(entity);
		return dto;
	}
	
	
	
	
	
}
