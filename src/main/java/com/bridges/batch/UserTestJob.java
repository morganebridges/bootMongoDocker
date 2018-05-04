package com.bridges.batch;

import com.bridges.repository.UserRepository;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

import java.util.Optional;
import java.util.stream.Collectors;

@Configuration
@EnableBatchProcessing
public class UserTestJob {
    private static final Logger log = LoggerFactory.getLogger(UserItemProcessor.class);

    @Autowired
    UserRepository userRepo;


    public void process(){
        Collectors.joining();
        //Optional.of(String t).flatMap()
    }


}
