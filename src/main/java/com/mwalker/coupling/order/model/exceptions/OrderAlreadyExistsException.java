package com.mwalker.coupling.order.model.exceptions;

public class OrderAlreadyExistsException extends RuntimeException {
    public OrderAlreadyExistsException(long orderId) {
        super("Order with Id " + orderId + " already exists");
    }
}
