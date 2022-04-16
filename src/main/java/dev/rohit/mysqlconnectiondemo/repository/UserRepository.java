package dev.rohit.mysqlconnectiondemo.repository;

import dev.rohit.mysqlconnectiondemo.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
}
