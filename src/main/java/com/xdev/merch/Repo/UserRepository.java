package com.xdev.merch.Repo;


import com.xdev.merch.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    // Method to find a user by email
    User findByEmail(String email);

    // Custom query method to find a user by name
    List<User> findByName(String name);

    // Custom query method to find all users with a specific status
    List<User> findByStatus(int status);

    // Custom query method to find all users who are vendors
    List<User> findByIsVendorTrue();

    // Custom query method to find all users who are providers
    List<User> findByIsProviderTrue();

    // Custom query method to find all users with a specific country
    List<User> findByCountry(String country);

    // Custom query method to find all users with a specific city
    List<User> findByCity(String city);

    // You can add more custom query methods as per your requirements.
    // For example, finding users by date, shop name, etc.
}
