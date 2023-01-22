package com.Rating.entities;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="rating")
public class Rating {
	
	@Id
	private String rId;
	private String userId;
	private String hotelId;
	private int rating;
	private String feedback;
	

}
