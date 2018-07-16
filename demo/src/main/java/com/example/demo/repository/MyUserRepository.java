
package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface MyUserRepository extends CrudRepository<com.example.demo.model.User, Long> {
    @Override
    User save(User user);

    @Override
    void delete(User user);

    @Override
    List<User> findAll();

    User findByUsername (String username);
}


