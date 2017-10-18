package io.spring.sample.dao;

import io.spring.sample.User;

public interface UserDao {

    User findByUsername(String username);

}
