package com.power.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.power.model.UserSession;

public interface UserSessionDao extends JpaRepository<UserSession, Integer>{

	Optional<UserSession> findByUuid(String key);

}
