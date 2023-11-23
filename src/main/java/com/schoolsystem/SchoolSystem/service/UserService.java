package com.schoolsystem.SchoolSystem.service;


import com.schoolsystem.SchoolSystem.entity.User;
import com.schoolsystem.SchoolSystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public boolean authenticate(String email, String password, String role){
        User user=userRepository.findUserByEmailAndPasswordAndRole(email,password,role);

        if (user!=null && password.matches(user.getPassword())){
            return true;
        }
        else{
            return false;
        }
    }

    public void addUser(User user) {
        userRepository.save(user);
    }



}
