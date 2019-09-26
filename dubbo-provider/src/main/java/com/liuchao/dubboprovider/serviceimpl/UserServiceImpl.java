package com.liuchao.dubboprovider.serviceimpl;


import com.alibaba.dubbo.config.annotation.Service;
import com.liuchao.dubbodomain.domain.User;
import com.liuchao.dubbomapper.service.UserMapper;
import com.liuchao.dubboservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Service(interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    private UserMapper userMapper;

    public List<User> findAllUser() {
        List<User> users = userMapper.selectAll();

        return users;
    }
}
