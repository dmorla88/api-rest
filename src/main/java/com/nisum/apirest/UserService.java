package com.nisum.apirest;

import com.nisum.apirest.model.User;
import com.nisum.apirest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User  createUser(User user){
        return userRepository.save(user);
    }
}
