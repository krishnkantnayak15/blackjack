package com.allstate.services;

import com.allstate.controllers.UserController;
import com.allstate.entities.Users;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@Sql({"/sql/seed.sql"})
@RunWith(SpringRunner.class)
public class UserServicesTest {

    @Autowired
    private UserServices userServices;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldCreateUser() throws Exception {
        Users user = new Users("rkkk", 0, 200.0);
        Users u = this.userServices.create(user);
        assertEquals(4, u.getUserId());
        assertEquals(200.0, u.getBalance(), 0.1);
    }

    @Test(expected = javax.validation.ConstraintViolationException.class)
    public void shouldNotCreateUserWithShortName() throws Exception {
        Users u = new Users("a",0,100.0);
        Users user = this.userServices.create(u);
    }


}