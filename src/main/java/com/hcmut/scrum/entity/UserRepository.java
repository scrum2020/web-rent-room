package com.hcmut.scrum.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    UserEntity findByUsernameAndPassword(String username, String password);

    @Query("SELECT user.email FROM UserEntity user")
    String[] getAllMail();

    @Query("SELECT user.email FROM UserEntity user WHERE user.username = :name")
    String getEmailByusername(String name);
}

