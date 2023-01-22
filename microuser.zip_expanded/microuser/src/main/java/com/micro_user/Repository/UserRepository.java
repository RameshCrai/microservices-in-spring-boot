package com.micro_user.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micro_user.model.User;

public interface UserRepository extends JpaRepository<User, String>{
	
	

}
