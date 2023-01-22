package com.micro_user.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.micro_user.model.Hotel;

@FeignClient(name = "HOTEL-SERVICE")
public interface HotelService 
{

	@GetMapping("/hotels/{hotelId}")
	public Hotel getHotel(@PathVariable("hotelId") String hotelId); 
	
	
	
	
	
	
	
}
