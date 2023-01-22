package com.apigateway.model;

import java.util.Collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AuthResponse {
	
	private String userId;
	private String accessToke;
	private String refreshToken;
	private long expiredAt;
	private Collection<String> authorities;

	
	

}
