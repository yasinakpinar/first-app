package com.akpinar.firstapp.service.impl;

import com.akpinar.firstapp.entities.User;
import com.akpinar.firstapp.repository.UserRepository;
import com.akpinar.firstapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> findAllUser() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findByIdUser(int id) {
        Optional<User> resultUser = userRepository.findById(id);
        return resultUser;
    }

    @Override
    public Boolean deleteByIdUser(int id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isEmpty() == true) {
            return Boolean.FALSE;
        }

        userRepository.deleteById(id);
        return Boolean.TRUE;
    }

    @Override
    public User updateUser(User user, int id) {
        Optional<User> resultUser = userRepository.findById(id);
        if (resultUser.isEmpty() == true) {
            return null;
        }

        resultUser.get().setAd(user.getAd());
        resultUser.get().setSoyad(user.getSoyad());
        resultUser.get().setMail(user.getMail());

        return userRepository.save(resultUser.get());
    }


    @Override
    public List<User> findByAd( String name) {
        return userRepository.findByAd( name);
    }


}
