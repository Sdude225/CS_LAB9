package com.utm.CS_LAB9.repo;

import com.utm.CS_LAB9.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, String> {

    Role findByRole(String role);
}
