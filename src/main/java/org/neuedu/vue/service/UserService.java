package org.neuedu.vue.service;

import org.neuedu.vue.mapper.UserMapper;
import org.neuedu.vue.model.Role;
import org.neuedu.vue.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    UserMapper userMapper;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userMapper.loadUserByUsername(s);
        if(user == null){
            throw new UsernameNotFoundException("没这人");
        }
        List<Role> roles = userMapper.getRoles(user.getId());
        user.setRoles(roles);
        return user;
    }
}
