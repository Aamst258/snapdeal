package com.snapdeal.snapdeal.Repositry;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.snapdeal.snapdeal.Model.Product;
import java.util.List;


public interface ProductRepositroy extends MongoRepository<Product, String>{
     List<Product> findByCategoryName(String categoryName);
}
