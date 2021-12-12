package com.usa.ciclo4.reto2ciclo4.repository.crud;

import com.usa.ciclo4.reto2ciclo4.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface OrderInterface extends MongoRepository<Order, Integer> {
    List<Order> findBySalesManZone(String zone);
}
