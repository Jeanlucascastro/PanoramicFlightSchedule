package com.panoramic.fist.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_flight")
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter @Setter private Integer id;
	@Getter @Setter private String name;
	@Getter @Setter private Date initialDate;
	@Getter @Setter private Date finalDate;
	
	public Flight (){
	}

	public Flight(Integer id, String name, Date initialDate, Date finalDate) {
		this.id = id;
		this.name = name;
		this.initialDate = initialDate;
		this.finalDate = finalDate;
	}
	
	

}