package com.learning.expensetracker.repositories;

import com.learning.expensetracker.Exceptions.EtAuthException;
import com.learning.expensetracker.domain.User;

public interface UserRepository {
    Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;

    User findByEmailAndPassword(String email, String password) throws EtAuthException;

    Integer getCountByEmail(String email);

    User findById(Integer userId);
}
