package com.example.finalassignment.service;

import com.example.finalassignment.model.User;

import java.util.List;

public interface UserService {

    User create(User user);
    User findById(long id);
    User findByColumn(int column);
    List<User> findAll();
    User update( User user);
    boolean delete(long columnId);
}
