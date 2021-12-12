package com.panoramic.fist.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "machinedb")
public class Machine {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter @Setter private Integer id;
	@Getter @Setter private String name;
	@Getter @Setter private String matricula;
	@Getter @Setter private String anoFabricacao;
	@Getter @Setter private boolean uso;
	
	public Machine () {
	}

	public Machine(Integer id, String name, String matricula, String anoFabricacao, boolean uso) {
		super();
		this.id = id;
		this.name = name;
		this.matricula = matricula;
		this.anoFabricacao = anoFabricacao;
		this.uso = uso;
	}


	
	

}
