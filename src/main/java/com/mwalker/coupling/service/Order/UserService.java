package com.mwalker.coupling.service.Order;

public interface UserService {
    boolean canOrder(long userId);

    boolean isPremiumUser(long userId);
}
