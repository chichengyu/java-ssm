package cn.xiaochi.controller;

import cn.xiaochi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/*
* web层
* */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService UserService;

    @GetMapping("/findOne")
    public String findOne(){
        System.out.println("WEB层测试");
        System.out.println(UserService);
        UserService.findOne();
        return "success";
    }
}
