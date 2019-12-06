package org.neuedu.vue.service;

import org.neuedu.vue.mapper.UserMapper;
import org.neuedu.vue.model.RespBean;
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

    public List<User> getUsers(String nickname) {
        List<User> users = userMapper.getUsers(nickname);
        for (User user : users) {
            List<Role> roles = userMapper.getRoles(user.getId());
            user.setRoles(roles);
        }
        return users;
    }

    public RespBean upUser(User user) {
        Integer i = userMapper.upUser(user);
        if(i == 0){
            return RespBean.error("修改失败");
        }else{
            return RespBean.ok("修改成功");
        }
    }

    public RespBean delUser(Integer id) {
        Integer i = userMapper.delUser(id);
        if(i == 0){
            return RespBean.error("删除失败");
        }else{
            return RespBean.ok("删除成功");
        }
    }
}
