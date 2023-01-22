package com.micro_user.external;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.micro_user.model.Rating;



@Service
@FeignClient(name="RATING-SERVICE")
public interface RatingService {
	
	@PostMapping("/ratings")	
	public Rating createRating(Rating rating);
	
	@PutMapping("/ratings/{id}")	
	public Rating updateRating(@PathVariable("id") Rating rating);
	
	
	public Rating getRating(String id);
	
	@DeleteMapping("/delet/{id}")
	public void delteRating(@PathVariable("id") String id);

}
