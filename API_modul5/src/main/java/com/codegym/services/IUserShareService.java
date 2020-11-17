package com.codegym.services;

import com.codegym.models.User_Share;

public interface IUserShareService {
    Iterable<User_Share> findAll();

    User_Share findById(Long id);

    void save(User_Share object);

    void remove(Long id);
}
