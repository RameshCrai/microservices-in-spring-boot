package com.hotel.Repositroy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.entities.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String>{

}
