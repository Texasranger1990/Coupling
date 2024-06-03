package com.mwalker.coupling.User.service;

import com.mwalker.coupling.User.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    boolean canOrder(long userId);
}
