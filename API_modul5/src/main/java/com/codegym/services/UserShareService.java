package com.codegym.services;

import com.codegym.models.User_Share;
import com.codegym.repositorys.IUserShare;
import org.springframework.beans.factory.annotation.Autowired;

public class UserShareService implements IUserShareService {

    @Autowired
    IUserShare iUserShare;

    @Override
    public Iterable<User_Share> findAll() {
        return iUserShare.findAll();
    }

    @Override
    public User_Share findById(Long id) {
        return iUserShare.findOne(id);
    }

    @Override
    public void save(User_Share object) {
        iUserShare.save(object);
    }

    @Override
    public void remove(Long id) {
        iUserShare.delete(id);
    }
}
