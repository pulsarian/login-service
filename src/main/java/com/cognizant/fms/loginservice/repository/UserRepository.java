package com.cognizant.fms.loginservice.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.cognizant.fms.loginservice.model.User;

import reactor.core.publisher.Mono;

public interface UserRepository extends ReactiveCrudRepository<User, String>	{
	
	public Mono<User> findByUsername(String username);

}
