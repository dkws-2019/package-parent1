package com.liuchao.dubboweb.controller;

import com.alibaba.dubbo.config.annotation.Reference;


import com.liuchao.dubbodomain.domain.User;
import com.liuchao.dubboservice.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api")
public class UserController {

    @Reference
    private UserService userService;


    @RequestMapping("/userLogin")
    public Object userLogin(){
        List<User> allUser = userService.findAllUser();
        return allUser;

    }
    @RequestMapping("/abc")
    public Object abc(){
        List<User> allUser = userService.findAllUser();
        return allUser;

    }




}