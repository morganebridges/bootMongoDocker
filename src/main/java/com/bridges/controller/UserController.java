package com.bridges.controller;

import com.bridges.model.User;
import com.bridges.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/user")
public class UserController {
    private final UserRepository uRepo;
    @Autowired
    public UserController(UserRepository uRepo){
        this.uRepo = uRepo;
    }
    @RequestMapping(method = RequestMethod.POST, value = "/create")
    public User createUser(@RequestParam(value = "name")String name) {
        User user = new User();
        user.setName(name);
        uRepo.save(user);
        return user;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/read/{id}")
    public User getUser(@PathVariable Long id) {
        return uRepo.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/read")
    public List<User> getUsers(){
        return uRepo.findAll();
    }
}
