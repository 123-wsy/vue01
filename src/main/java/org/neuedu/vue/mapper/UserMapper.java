package org.neuedu.vue.mapper;

import org.neuedu.vue.model.Role;
import org.neuedu.vue.model.User;

import java.util.List;

public interface UserMapper {
    User loadUserByUsername(String s);

    List<Role> getRoles(Integer id);
}