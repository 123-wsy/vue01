package org.neuedu.vue.mapper;

import org.neuedu.vue.model.Proper;
import org.neuedu.vue.model.Role;
import org.neuedu.vue.model.User;

import java.util.List;

public interface UserMapper {
    List<Proper> getUsers();

    User loadUserByUsername(String s);

    List<Role> getRoles(Integer id);

    Integer upUser(Proper proper);

    Integer addUser(Proper proper);

    Integer delUser(Integer id);

}
