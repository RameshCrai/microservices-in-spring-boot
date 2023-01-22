package com.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.Service.HotelService;
import com.hotel.entities.Hotel;

@RestController
@RequestMapping("/hotels")
public class HotelController {
	
	@Autowired
	private HotelService service;
	
	@PostMapping
	public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(service.create(hotel));
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Hotel> getSingleHotel(@PathVariable("id") String id){
		
		return ResponseEntity.status(HttpStatus.OK).body(service.gethotel(id));
		
	} 

	@GetMapping
	public ResponseEntity<List<Hotel>> getAll(){
		
		return ResponseEntity.ok(this.service.getAll());
		
	}
}
