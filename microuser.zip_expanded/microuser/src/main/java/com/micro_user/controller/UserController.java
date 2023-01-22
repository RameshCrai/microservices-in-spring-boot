package com.micro_user.controller;



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

import com.micro_user.model.User;
import com.micro_user.service.UserService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService service;
	
	
	
	@PostMapping
	public ResponseEntity<User> addUser(@RequestBody User user) {
		User u = service.saveUser(user);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(u);
	}
	
	//get single user
	
	int retryCount=1;
	
	@GetMapping("/{id}")
	//@CircuitBreaker(name ="ratingHotelBreaker",fallbackMethod="ratingHotelFallback")
	//@Retry(name ="ratingHotelService", fallbackMethod="ratingHotelFallback")
	@RateLimiter(name="userRateLimiter", fallbackMethod="ratingHotelFallback")
	public ResponseEntity<User> getSingleUser(@PathVariable("id") String id){
		
		
        System.out.println("Retry count = "+retryCount);		
		retryCount++;
		
		return ResponseEntity.ok(this.service.getuser(id)); 
	}
	
	//creating fallback method for circuit breaker
	

	
	public ResponseEntity<User> ratingHotelFallback(String userId, Exception ex){
//
//		
//		System.out.println("This is fallback   === "+ex.getMessage());
		
		
		
		User user = User.builder().email("ramesh@gmail.com")
		.about("He is a senior software developer")
		.name("ramesh kirati")
		.id("12434")
		.build();
		
		return new ResponseEntity<>(user, HttpStatus.OK);
		
	}
	

	
	@GetMapping
	public ResponseEntity<List<User>> getAllUser(){
		List<User> allUser = this.service.getAllUser();
		
		return ResponseEntity.ok(allUser);
	}

}
