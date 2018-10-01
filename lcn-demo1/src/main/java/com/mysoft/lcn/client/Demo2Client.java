package com.mysoft.lcn.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 描述:
 *
 * @auth lnsof
 * @Date 2018/10/1 20:45
 * @Version 1.0
 */
@FeignClient(serviceId = "demo2", fallback = Demo2Hystrix.class)
public interface Demo2Client {

    @RequestMapping(value = "/api/demo2/create",method = RequestMethod.GET)
    String save();
}
