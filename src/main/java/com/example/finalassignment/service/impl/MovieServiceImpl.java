package com.example.finalassignment.service.impl;

import com.example.finalassignment.model.User;
import com.example.finalassignment.repository.UserRepository;
import com.example.finalassignment.service.UserService;
import jakarta.inject.Inject;

import java.util.List;

public class UserServiceImpl implements UserService{

    @Inject
    private UserRepository userRepository;

    @Override
    public User create(User user) {
        return userRepository.create(user);
    }

    @Override
    public User findById(long id) {
        return userRepository.read(id);
    }

    @Override
    public User findByColumn(int column) {
        return userRepository.getUserByColumn(column);
    }

    @Override
    public List<User> findAll() {
        return userRepository.read();
    }

    @Override
    public User update(User user) {
        return userRepository.update(user);
    }

    @Override
    public boolean delete(long columnId) {
        return userRepository.delete(columnId);
    }


}
