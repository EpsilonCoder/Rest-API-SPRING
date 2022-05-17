package com.epsilon.com.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epsilon.com.Models.User;

public interface UserRepo extends JpaRepository<User, Long> {

}
