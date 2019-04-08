package cn.xiaochi.dao;

import cn.xiaochi.domain.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    /**
     * 查询一个用户
     */
    @Select("select * from user where id=#{id}")
    public User findOne(int id);

    /**
     * 查询所有用户
     */
    @Select("select * from user")
    public List<User> findAll();
}
