package com.panoramic.fist.entities;

import lombok.Getter;
import lombok.Setter;

public class Machine {
	
	@Getter @Setter private Integer Id;
	@Getter @Setter private String name;
	@Getter @Setter private boolean operante;
	@Getter @Setter private boolean uso;
	
	public Machine () {
		
	}

	public Machine(Integer id, String name, boolean operante, boolean uso) {
		super();
		Id = id;
		this.name = name;
		this.operante = operante;
		this.uso = uso;
	}
	
	

}
