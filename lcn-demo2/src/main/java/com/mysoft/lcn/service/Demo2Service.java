package com.mysoft.lcn.service;

import com.codingapi.tx.annotation.ITxTransaction;
import com.mysoft.lcn.client.Demo3Client;
import com.mysoft.lcn.db.Demo2Mapper;
import com.mysoft.lcn.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

/**
 * 描述:
 *
 * @auth lnsof
 * @Date 2018/10/1 20:40
 * @Version 1.0
 */
@Service
public class Demo2Service implements ITxTransaction {

    @Autowired
    private Demo2Mapper demo2Mapper;

    @Autowired
    private Demo3Client demo3Client;

    @Autowired
    private RestTemplate restTemplate;

    @Transactional
    public int create(User user) {
        // call demo3 (spring boot project)
        demo3Client.save();
        // call demo5 (spring mvc project)
        restTemplate.getForObject("http://localhost:8080/demo5/api/demo5/create", String.class);
        return demo2Mapper.insert(user);
    }

}
