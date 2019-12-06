package org.neuedu.vue.controller.user;

import org.neuedu.vue.model.RespBean;
import org.neuedu.vue.model.User;
import org.neuedu.vue.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/getUsers")
    public List<User> getUsers(@RequestParam(value = "nickname",defaultValue = "") String nickname){
        System.out.println(nickname);
        return userService.getUsers(nickname);
    }

    @DeleteMapping("/{id}")
    public RespBean delUser(@PathVariable("id") Integer id){
        return userService.delUser(id);
    }

    @PutMapping("/")
    public RespBean upUser(@RequestBody User user){
        return userService.upUser(user);
    }

}
