package com.bridges.controller;

import com.bridges.model.User;
import com.bridges.repository.UserRepository;
import com.bridges.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping(value="/user")
public class UserController {
    @Autowired
    private final UserService uService;


    public UserController(UserService uService){
        this.uService = uService;
    }
    @RequestMapping(method = RequestMethod.POST, value = "/create")
    public User createUser(@RequestParam(value = "name")String name) {
        User user = new User(name);
        user.setName(name);
        uService.saveUser(user);
        return user;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/read/{id}")
    public User getUser(@PathVariable Long id) {
        return uService.getUser(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/read")
    public List<User> getUsers(){
        return uService.getAllUsers();
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/update/{id}")
    public @ResponseBody User updateUser(@PathVariable Long id, @RequestBody User user, HttpServletRequest req, HttpServletResponse res){
        if(user.getId().equals(id)){
            res.setStatus(400);
            return null;
        }
        uService.saveUser(user);
        res.setStatus(200);
        return user;
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/delete/{id}")
    public void deleteUser(@PathVariable Long id, HttpServletResponse res, HttpServletRequest req){

    }
}
