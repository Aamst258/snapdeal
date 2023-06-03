package com.snapdeal.snapdeal.Repositry;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.snapdeal.snapdeal.Model.Cart;

public interface cartrepository extends MongoRepository<Cart, String> {

}
