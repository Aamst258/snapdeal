package com.snapdeal.snapdeal.Repositry;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.snapdeal.snapdeal.Model.Cart;
import com.snapdeal.snapdeal.Model.Order;

public interface OrderRepository extends MongoRepository<Order, String> {

}
