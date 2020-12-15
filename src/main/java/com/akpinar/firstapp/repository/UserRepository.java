package com.akpinar.firstapp.repository;

import com.akpinar.firstapp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {


    List<User> findByAd(String name);


}
