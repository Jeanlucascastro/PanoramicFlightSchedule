package com.panoramic.fist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.panoramic.fist.entities.Machine;
import com.panoramic.fist.services.MachineService;

@RestController
@RequestMapping(value = "/machines")
public class MachineController {
	
	@Autowired
	private MachineService MachineService;

	@GetMapping(value = "/alllist")
	public ResponseEntity<Page<Machine>> findall(Pageable pageable){
		Page<Machine> list = MachineService.findall(pageable);
		return ResponseEntity.ok(list);
	}


	@GetMapping(value = "/all")
	public ResponseEntity<List<Machine>> findall(){
		List<Machine> list = MachineService.findall();
		return ResponseEntity.ok(list);
	}

	
	@GetMapping(value = "/{id}")
	public Machine findById(@PathVariable Integer id) {
		return MachineService.findById(id);
	}
//	
	@PostMapping
	public ResponseEntity<Machine> insert (@RequestBody Machine fly){
		fly = MachineService.insert(fly);
		return ResponseEntity.ok().body(fly);
//		return MachineService.teste(fly);

	}
	

	
}
