package com.project.moviebooking.repository;

import com.project.moviebooking.model.user.User;
import com.project.moviebooking.repository.user.UserRepositoryCustom;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface UserRepository extends MongoRepository<String,User> , UserRepositoryCustom{
    // Find user by first name
    User findByFirstName(String firstname);

    @Query("{'username': { '$regex' : ?0 } }")
    List<User> findAllByUserName(String username);


}