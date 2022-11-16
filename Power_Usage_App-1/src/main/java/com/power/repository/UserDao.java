package com.power.repository;

import java.util.Optional;

import javax.validation.constraints.NotNull;

import org.springframework.data.jpa.repository.JpaRepository;

import com.power.model.User;


public interface UserDao extends JpaRepository<User, Integer>{

	Optional<User> findByMobileNumber(@NotNull(message = "Mobile Number is mandatory") String mobileNumber);

}
