package com.mwalker.coupling.service;

public interface UserService {
    boolean canOrder(long userId);

    boolean isPremiumUser(long userId);
}
