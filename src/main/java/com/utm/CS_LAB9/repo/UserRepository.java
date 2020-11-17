package com.utm.CS_LAB9.repo;

import com.utm.CS_LAB9.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

    User findByEmail(String email);
}
