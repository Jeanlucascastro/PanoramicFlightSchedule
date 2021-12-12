package com.panoramic.fist.dto;


import com.panoramic.fist.entities.Flight;

import lombok.Getter;
import lombok.Setter;

public class FlightDTO {

	@Getter @Setter private Integer id;
	@Getter @Setter private String name;
	@Getter @Setter private String initialdate;
	@Getter @Setter private String finaldate;
	
	
	public FlightDTO() {
	}


	public FlightDTO(Integer id, String name, String initialdate, String finaldate) {
		this.id = id;
		this.name = name;
		this.initialdate = initialdate;
		this.finaldate = finaldate;
	}
	
	
	public FlightDTO(Flight flight) {
		id = flight.getId();
		name = flight.getName();
//		initialdate = flight.getinitialdate();
		finaldate = flight.getFinaldate();
	}
	
	
}
