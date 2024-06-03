package com.mwalker.coupling.order.service;

public interface UserService {
    boolean canOrder(long userId);

    boolean isPremiumUser(long userId);
}
