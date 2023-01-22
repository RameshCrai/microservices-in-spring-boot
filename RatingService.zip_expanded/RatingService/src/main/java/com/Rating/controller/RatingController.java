package com.Rating.controller;

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

import com.Rating.entities.Rating;
import com.Rating.service.RatingService;

@RestController
@RequestMapping("/ratings")
public class RatingController {
	
	@Autowired
	private RatingService service;
	

	
	@PostMapping("/")
	public ResponseEntity<Rating> create(@RequestBody Rating rating){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(service.createRating(rating));
	}
	
	@GetMapping("/single")
	public ResponseEntity<List<Rating>> getRating(){
		
		return ResponseEntity.ok(service.getRatings());
	}
	
	@GetMapping("/user/{uid}")
	public ResponseEntity<List<Rating>> getRatingByuserid(@PathVariable("uid") String userId){
		
		return ResponseEntity.ok(service.getRatingByUserId(userId));
	}

	
	@GetMapping("/hotel/{hid}")
	public ResponseEntity<List<Rating>> getRatingByHotelid(@PathVariable("hid") String hotelId){
		
		return ResponseEntity.ok(service.getRatingByHotelId(hotelId));
	}
	
}
