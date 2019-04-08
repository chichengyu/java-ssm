package cn.xiaochi.service;

import cn.xiaochi.domain.User;

import java.util.List;

/*
* 业务层
* */
public interface UserService {
    public User findOne();
    public List<User> findAll();
}
