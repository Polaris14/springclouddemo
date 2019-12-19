package com.huy.Controller;

import com.huy.Interface.ConsumerClient;
import com.huy.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private ConsumerClient consumerClient;

    @RequestMapping("/")
    public List<User> list(){
        return consumerClient.list();
    }

}
