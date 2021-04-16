package com.Jiang.dao.User;
import com.Jiang.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> Login(Map map);

    boolean UpdataPassword(Map map);

}
