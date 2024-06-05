package com.mwalker.coupling.order.connectors;

import com.mwalker.coupling.User.rest.UserController;
import com.mwalker.coupling.order.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserConnectorImpl implements UserService {
    @Autowired
    private UserController userController;
    @Override
    public boolean canOrder(long userId) {
        return userController.canOrder(userId);
    }

    @Override
    public boolean isPremiumUser(long userId) {
        return false;
    }
}
