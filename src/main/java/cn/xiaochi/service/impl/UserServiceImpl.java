package cn.xiaochi.service.impl;

import cn.xiaochi.dao.UserDao;
import cn.xiaochi.domain.User;
import cn.xiaochi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User findOne() {
        System.out.println("业务层findOne");
        User user = userDao.findOne(10);
        return user;
    }

    @Override
    public List<User> findAll() {
        System.out.println("业务层findAll");
        return null;
    }
}
