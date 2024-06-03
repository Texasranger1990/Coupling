package com.mwalker.coupling.model.exceptions;

public class OrderAlreadyExistsException extends RuntimeException {
    public OrderAlreadyExistsException(long orderId) {
        super("Order with Id " + orderId + " already exists");
    }
}
