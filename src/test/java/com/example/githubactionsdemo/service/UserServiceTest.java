package com.example.githubactionsdemo.service;

import com.example.githubactionsdemo.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService service;

    @Test
    void shouldReturnListOfUser() {
        Optional<List<User>> allUsers = service.getAllUsers();
        assertTrue(allUsers.isPresent());
        assertEquals(3, allUsers.get().size());
    }

    @Test
    void shouldReturnEmptyOptional_When_CalledWithBadId() {
        Optional<User> user = service.getUser(999_000_919);
        assertTrue(user.isEmpty());
    }
}
