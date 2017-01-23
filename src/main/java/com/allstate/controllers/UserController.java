package com.allstate.controllers;


import com.allstate.entities.Users;
import com.allstate.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

public class UserController {

    private UserServices userService;

    @Autowired
    public void setUserService(UserServices userService) {
        this.userService = userService;
    }

    @RequestMapping(value = {"", "/"}, method = RequestMethod.POST)
    public Users create(String userName, int version, double balance){

        System.out.println("hii............." +userName);

        Users user = new Users(userName,version, balance);
        return this.userService.create(user);
    }
}
