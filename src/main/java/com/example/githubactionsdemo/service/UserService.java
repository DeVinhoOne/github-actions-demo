package com.example.githubactionsdemo.service;

import com.example.githubactionsdemo.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private static final List<User> users = List.of(
            new User(1, "Dawid", "Lacheta"),
            new User(2, "Joe", "Doe"),
            new User(3, "Frank", "Smith")
    );

    public Optional<List<User>> getAllUsers() {
        return Optional.of(users);
    }

    public Optional<User> getUser(int id) {
        User foundUser = users.stream()
                .filter(user -> user.id() == id)
                .findFirst()
                .orElse(null);
        return Optional.ofNullable(foundUser);
    }
}
