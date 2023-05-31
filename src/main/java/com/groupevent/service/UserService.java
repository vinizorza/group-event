package com.groupevent.service;

import com.groupevent.model.User;
import com.groupevent.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public UserService(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    private final UserRepository userRepository;

    public void create(User user){
        userRepository.save(user);
    }

}
