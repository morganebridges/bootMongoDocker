package com.bridges.service;

import com.bridges.model.CustomSequences;
import com.bridges.model.User;
import com.bridges.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository uRepo;
    @Autowired
    MongoIdService sequenceService;

    public User saveUser(User user){
        //handle the case for user creation
        if(user.getId() == null){
            user.setId(sequenceService.getNextSequence("userid"));
        }
        uRepo.save(user);
        return user;
    }
    public User getUser(Long userId){
        return uRepo.findOne(userId);
    }
    public List<User> getAllUsers(){
        return uRepo.findAll();
    }
    public void deleteUser(Long userId){
        uRepo.delete(userId);
    }
}
