package com.publish.api.service.activity;

import com.publish.api.domain.model.User;
import com.publish.api.domain.repository.UserRepository;
import com.publish.api.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;


@Service
public class UserActivity implements UserService {

    private final UserRepository repository;


    public UserActivity(UserRepository repository) {
        this.repository = repository;
    }


    @Override
    public User findById(Long id) {
        return repository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User created(User user) {

        if( user.getId() != null && repository.existsById( user.getId() ) ) {
            throw new IllegalArgumentException("This user already exists.");
        }

        return repository.save( user );
    }
}
