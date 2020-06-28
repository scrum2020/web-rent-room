package com.hcmut.scrum.repository;

import com.hcmut.scrum.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsernameAndPassword(String username, String password);
    List<User> findByIdOrRoleOrUsernameOrEmailOrPhone(int id, int role, String usename, String email, String phone);
}

