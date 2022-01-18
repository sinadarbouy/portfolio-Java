package com.learning.expensetracker.services;

import com.learning.expensetracker.Exceptions.EtAuthException;
import com.learning.expensetracker.domain.User;

public interface UserService {
    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;
}
