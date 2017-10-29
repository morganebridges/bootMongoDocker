package com.bridges.repository;

import com.bridges.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Long >{

}
