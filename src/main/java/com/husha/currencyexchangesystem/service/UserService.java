package com.husha.currencyexchangesystem.service;

import com.husha.currencyexchangesystem.entity.User;
import com.husha.currencyexchangesystem.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> findUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
