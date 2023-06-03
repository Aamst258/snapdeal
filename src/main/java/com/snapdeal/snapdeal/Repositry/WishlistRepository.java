package com.snapdeal.snapdeal.Repositry;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.snapdeal.snapdeal.Model.Wishlist;

public interface WishlistRepository  extends MongoRepository<Wishlist, String> {

}
