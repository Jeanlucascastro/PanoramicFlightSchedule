package com.panoramic.fist.entities;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_panoramicdb")
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter @Setter private Integer id;
	@Getter @Setter private String name;
	@Getter @Setter private String initialdate;
	@Getter @Setter private String finaldate;
	@Getter @Setter private Integer machineid;
	
	
	
	public Flight (){
	}

	public Flight(Integer id, String name, String iinitialdate, String finaldate) {
		this.id = id;
		this.name = name;
		this.initialdate = iinitialdate;
		this.finaldate = finaldate;
	}
	
	

}