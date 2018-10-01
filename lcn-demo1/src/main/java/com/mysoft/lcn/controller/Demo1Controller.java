package com.mysoft.lcn.controller;

import com.mysoft.lcn.client.Demo2Client;
import com.mysoft.lcn.entity.User;
import com.mysoft.lcn.service.Demo1Service;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述:
 *
 * @auth lnsof
 * @Date 2018/10/1 20:51
 * @Version 1.0
 */
@RestController
@RequestMapping("/api/demo1")
public class Demo1Controller {

    @Autowired
    private Demo1Service demo1Servicel;



    @GetMapping("/create")
    public String create() {
        User user = new User();
        user.setName("user1");
        demo1Servicel.create(user);

        return "SUCCESS";
    }

}
