package com.snapdeal.snapdeal.Repositry;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.snapdeal.snapdeal.Model.Register;

public interface RegisterRepository extends MongoRepository<Register, String> {
    Register findByEmail(String email);


}
