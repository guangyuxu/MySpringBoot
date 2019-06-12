package com.gavin.spring.jpa.repository;

import com.gavin.spring.jpa.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
