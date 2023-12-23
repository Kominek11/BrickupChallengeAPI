package com.brickup.brickupChallenge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brickup.brickupChallenge.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
