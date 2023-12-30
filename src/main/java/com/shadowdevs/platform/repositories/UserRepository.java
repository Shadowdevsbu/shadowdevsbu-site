package com.shadowdevs.platform.repositories;

import com.shadowdevs.platform.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    public User findByUsername(String username);

}
