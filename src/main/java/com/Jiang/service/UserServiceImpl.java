package com.Jiang.service;

import com.Jiang.dao.User.UserMapper;
import com.Jiang.pojo.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("UserServiceImpl")
public class UserServiceImpl implements UserService{
    @Autowired
    UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> Login(Map map) {
        return userMapper.Login(map);
    }

    @Override
    public boolean UpdataPassword(Map map) {
        return userMapper.UpdataPassword(map);
    }
    //不能测试!空指针异常!必须项目跑起来才行
//    @Test
//    public void t(){
//        System.out.println(userMapper.Login(new HashMap()));
//    }

}
