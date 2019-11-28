package org.neuedu.vue.controller;

import org.neuedu.vue.model.RespBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @GetMapping("/login")
    public RespBean login(){
        return RespBean.error(401, "先登录,崽种");
    }
}
