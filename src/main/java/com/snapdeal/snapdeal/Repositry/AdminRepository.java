package com.snapdeal.snapdeal.Repositry;

import org.springframework.data.mongodb.repository.MongoRepository
;

import com.snapdeal.snapdeal.Model.Admin;


public interface AdminRepository   extends MongoRepository<Admin, String> {
	Admin findByEmail(String email);
}
