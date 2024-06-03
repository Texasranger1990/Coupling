package com.mwalker.coupling.service.User;

import com.mwalker.coupling.service.Order.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public boolean canOrder(long userId) {
        return userId % 3 == 0;
    }

    @Override
    public boolean isPremiumUser(long userId) {
        return canOrder(userId) && userId % 5 == 0;
    }
}
