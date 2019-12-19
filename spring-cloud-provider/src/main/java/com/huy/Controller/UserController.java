package com.huy.Controller;

import com.huy.Mapper.UserMapper;
import com.huy.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {

    @Resource
    UserMapper userMapper;

    @RequestMapping("/")
    public List<User> list(){
        return userMapper.list();
    }

}
