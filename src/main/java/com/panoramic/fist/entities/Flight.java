package com.panoramic.fist.entities;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "panoramicdb")
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter @Setter private Integer id;
	@Getter @Setter private String name;
	@Getter @Setter private String initialDate;
	@Getter @Setter private String finalDate;
	@Getter @Setter private Integer machineId;
	
	
	
	public Flight (){
	}

	public Flight(Integer id, String name, String initialDate, String finalDate) {
		this.id = id;
		this.name = name;
		this.initialDate = initialDate;
		this.finalDate = finalDate;
	}
	
	

}