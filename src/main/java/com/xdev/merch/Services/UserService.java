package com.xdev.merch.Services;

import com.xdev.merch.Repo.UserRepository;
import com.xdev.merch.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Method to save a user
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // Method to find a user by ID
    public Optional<User> findUserById(int id) {
        return userRepository.findById(id);
    }

    // Method to find a user by email
    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    // Method to update a user
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    // Method to delete a user by ID
    public void deleteUserById(int id) {
        userRepository.deleteById(id);
    }

    // Method to get all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // You can add more methods as per your application requirements.
    // For example, methods to update user status, verify email, change password, etc.
}
