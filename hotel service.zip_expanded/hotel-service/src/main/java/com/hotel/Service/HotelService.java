package com.hotel.Service;

import java.util.List;

import com.hotel.entities.Hotel;

public interface HotelService {
	
	Hotel create(Hotel hotel);
	
	List<Hotel> getAll();
	
	Hotel gethotel(String id);

}
