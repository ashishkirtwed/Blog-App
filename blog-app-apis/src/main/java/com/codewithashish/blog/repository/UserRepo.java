package com.codewithashish.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithashish.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
