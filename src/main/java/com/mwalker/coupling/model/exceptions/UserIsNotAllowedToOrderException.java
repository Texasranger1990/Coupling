package com.mwalker.coupling.model.exceptions;

public class UserIsNotAllowedToOrderException extends RuntimeException {
    public UserIsNotAllowedToOrderException(long userId) {
        super("User with Id " + userId + " is not allowed to order");
    }
}
