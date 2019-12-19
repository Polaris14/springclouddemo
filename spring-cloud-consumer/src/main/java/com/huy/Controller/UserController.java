package com.huy.Controller;

import com.huy.entity.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String REST_URL_PREFIX = "http://provider-name";

    @HystrixCommand(fallbackMethod = "defaultStores")
    @RequestMapping("/")
    public List<User> list(){
        return restTemplate.getForObject(REST_URL_PREFIX + "/",List.class);
    }
    public List<User> defaultStores() {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User().setMessage("服务器已挂"));
        return users;
    }
}
