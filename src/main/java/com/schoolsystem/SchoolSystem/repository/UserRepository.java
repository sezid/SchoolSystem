package com.schoolsystem.SchoolSystem.repository;

import com.schoolsystem.SchoolSystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findUserByEmailAndPasswordAndRole(String email,String password,String role);
}
