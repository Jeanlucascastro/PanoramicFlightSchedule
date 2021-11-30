package com.panoramic.fist.dto;

import java.util.Date;

import com.panoramic.fist.entities.Flight;

import lombok.Getter;
import lombok.Setter;

public class FlightDTO {

	@Getter @Setter private Integer id;
	@Getter @Setter private String name;
	@Getter @Setter private Date initialDate;
	@Getter @Setter private Date finalDate;
	
	
	public FlightDTO() {
	}


	public FlightDTO(Integer id, String name, Date initialDate, Date finalDate) {
		this.id = id;
		this.name = name;
		this.initialDate = initialDate;
		this.finalDate = finalDate;
	}
	
	
	public FlightDTO(Flight flight) {
		id = flight.getId();
		name = flight.getName();
		initialDate = flight.getInitialDate();
		finalDate = flight.getFinalDate();
	}
	
	
}
