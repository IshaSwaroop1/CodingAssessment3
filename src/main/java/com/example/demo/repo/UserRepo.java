package com.example.demo.repo;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Book;
import com.example.demo.entity.User;


public interface UserRepo extends JpaRepository<User, Long> {
	
}
