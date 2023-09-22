package com.example.githubactionsdemo.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.EnabledIf;

@EnabledIf(value = "#{environment.getActiveProfiles()[0] == 'int-test'}", loadContext = true)
@SpringBootTest
public class UserControllerTest {

    @Autowired
    private UserController userController;

    @Test
    void hardTest() {
        String test = userController.test();
        Assertions.assertNotEquals("",test);
    }
}
