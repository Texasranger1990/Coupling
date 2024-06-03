package com.mwalker.coupling.repository;

import com.mwalker.coupling.repository.entity.OrderEntity;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<OrderEntity, Long> {
}
