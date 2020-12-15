package com.akpinar.firstapp.service;

import com.akpinar.firstapp.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User save(User user);

    List<User> findAllUser();

    Optional<User> findByIdUser(int id);

    Boolean deleteByIdUser(int id);

    User updateUser(User user, int id);

    List<User> findByAd( String name);


}
