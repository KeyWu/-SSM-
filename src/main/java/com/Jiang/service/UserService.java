package com.Jiang.service;

import com.Jiang.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    List<User> Login(Map map);

    boolean UpdataPassword(Map map);
}
