package com.akpinar.firstapp.controller;

import com.akpinar.firstapp.entities.User;
import com.akpinar.firstapp.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/user")
@Api(value = "User API dokumantasyonu.")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping(value = "/addUser")
    @ApiOperation(value = "Yeni User ekleme operasyonu.")
    public User createUser(@RequestBody User user){

        return userService.save(user);
    }

    @GetMapping("/findAllUser")
    public List<User> findAllUser(){

        return userService.findAllUser();
    }


    @GetMapping("/findByIdUser/{id}")
    public Optional<User> findByIdUser(@PathVariable("id") int id){

        System.out.println(id);
        return userService.findByIdUser(id);
    }

    @DeleteMapping("/deleteByIdUser/{id}")
    public Boolean deleteByIdUser(@PathVariable("id") int id){

        return userService.deleteByIdUser(id);
    }

    @PutMapping("/updateUser/{id}")
    public User updateUser (@RequestBody User user,@PathVariable("id") int id){


        return userService.updateUser(user,id);
    }

    @GetMapping("/getByNameUser/{name}")
    public List<User> findByAd(@PathVariable("name") String name) {
        return userService.findByAd(name);
    }


}
