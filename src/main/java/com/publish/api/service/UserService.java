package com.publish.api.service;

import com.publish.api.domain.model.User;

public interface UserService {

    User findById(Long id);

    User created(User user);
}
