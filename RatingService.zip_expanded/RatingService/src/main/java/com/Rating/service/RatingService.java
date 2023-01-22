package com.Rating.service;

import java.util.List;

import com.Rating.entities.Rating;

public interface RatingService {
	
	Rating createRating(Rating rating);
	
	Rating getRating(String rid);
	
	List<Rating> getRatings();
	
	List<Rating> getRatingByUserId(String userId);
	
	List<Rating> getRatingByHotelId(String hotelId);

}
