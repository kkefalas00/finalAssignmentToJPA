package com.example.finalassignment.repository;

import com.example.finalassignment.model.User;

public interface UserRepository extends Repository<User, Long>{

    User getUserByColumn(int column);

}
