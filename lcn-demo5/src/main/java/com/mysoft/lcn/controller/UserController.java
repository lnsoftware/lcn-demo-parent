package com.mysoft.lcn.controller;

import com.mysoft.lcn.entity.User;
import com.mysoft.lcn.service.UserService;
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
@RequestMapping("/api/demo5")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/create")
    public String create() {
        User user = new User();
        user.setName("user5");
        userService.create(user);
        return "SUCCESS";
    }

}
