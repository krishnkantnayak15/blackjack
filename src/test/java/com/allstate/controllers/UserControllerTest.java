package com.allstate.controllers;

import com.allstate.entities.Users;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;


public class UserControllerTest {
    @Autowired
    private UserController userController;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldCreateUser() throws Exception {

        System.out.print("inside user controller  test");
        Users u = this.userController.create("aa",0, 99.00);
        assertEquals(3, u.getUserId());
        assertEquals("aa", u.getUserName());
    }



}