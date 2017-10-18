package io.spring.sample.dao;

import io.spring.sample.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl extends AbstractDao implements UserDao {

    @Override
    public User findByUsername(String username) {
        return sqlSession.selectOne("io.spring.sample.dao.UserDao.findByUsername", username);
    }

}
