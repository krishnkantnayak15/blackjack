package com.allstate.services;


import com.allstate.repositories.IUserRepository;
import com.allstate.entities.Users;
import org.omg.IOP.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.constraints.Min;
import java.util.Map;

public class UserServices {
    private IUserRepository userRepository;


    @Autowired
    public void setUserRepository(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public Users create(Users users){
        return this.userRepository.save(users);
        }
}
