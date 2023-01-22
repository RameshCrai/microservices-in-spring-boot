package com.Rating.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.Rating.entities.Rating;


public interface RatingRepository extends JpaRepository<Rating, String>{

	//custom finder method
	 List<Rating> findByUserId(String uid);
	
	 List<Rating> findByHotelId(String hid);
	
	
	
}
