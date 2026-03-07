package com.dk.care_health.users.repo;

import com.dk.care_health.users.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
//Optional helps avoid NullPointerException.

}
