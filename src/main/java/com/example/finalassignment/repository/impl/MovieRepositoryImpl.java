package com.example.finalassignment.repository.impl;

import com.example.finalassignment.model.User;
import com.example.finalassignment.repository.UserRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.NonUniqueResultException;
import jakarta.persistence.PersistenceContext;

public class UserRepositoryImpl extends RepositoryImpl<User, Long> implements UserRepository {

    @PersistenceContext(unitName = "Persistence")
    private EntityManager em;

    @Override
    public Class<User> getClassType() {
        return User.class;
    }

    @Override
    public String getClassName() {
        return User.class.getSimpleName();
    }

    @Override

    public User getUserByColumn(int column) throws NoResultException, NonUniqueResultException {
        return (User)  em.createQuery("Select u from "+getClassName()+" u where u.column="+column).getSingleResult();
    }

}
