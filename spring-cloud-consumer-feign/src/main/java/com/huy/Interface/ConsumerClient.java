package com.huy.Interface;

import com.huy.entity.User;
import com.huy.hystrix.HystrixClientFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "provider-name",fallbackFactory = HystrixClientFallbackFactory.class)
public interface ConsumerClient {

    @RequestMapping("/")
    public List<User> list();
}
