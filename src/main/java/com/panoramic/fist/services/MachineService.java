package com.panoramic.fist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.panoramic.fist.entities.Machine;
import com.panoramic.fist.repositories.MachineRepository;

@Service
@Configurable
public class MachineService {
	
	@Autowired
	private MachineRepository MachineRepository;
	
	public Page<Machine> findall(Pageable pageable){
		MachineRepository.findAll();
		Page<Machine> result = MachineRepository.findAll(pageable);
		return result;
	}

	public Machine findById(Integer id) {
		Machine entity = MachineRepository.findById(id).get();
		return entity;
	}
	
	public List<Machine> findall(){
		return MachineRepository.findAll();
	}
	
	public Machine insert(Machine fly) {
		
		return MachineRepository.save(fly);
	}
	
	public String teste(Machine fly) {
		return fly.toString() + "TESTESTETESTE";
	}
	
	
	
}
