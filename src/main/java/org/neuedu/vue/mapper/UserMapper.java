package org.neuedu.vue.mapper;

import org.apache.ibatis.annotations.Param;
import org.neuedu.vue.model.Role;
import org.neuedu.vue.model.User;

import java.util.List;

public interface UserMapper {
    List<User> getUsers(@Param(value = "nickname")String nickname);

    User loadUserByUsername(String s);

    List<Role> getRoles(Integer id);

    Integer upUser(User user);

    Integer addUser(User user);

    Integer delUser(Integer id);
}
