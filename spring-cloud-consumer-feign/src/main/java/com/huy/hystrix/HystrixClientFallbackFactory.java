package com.huy.hystrix;

import com.huy.Interface.ConsumerClient;
import com.huy.entity.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class HystrixClientFallbackFactory implements FallbackFactory<ConsumerClient> {
    @Override
    public ConsumerClient create(Throwable throwable) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User().setMessage("服务器挂了"));
        return () -> users;
    }
}
