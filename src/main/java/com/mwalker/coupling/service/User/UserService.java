package com.mwalker.coupling.service.User;

public interface UserService {
    boolean canOrder(long userId);

    boolean isPremiumUser(long userId);
}
