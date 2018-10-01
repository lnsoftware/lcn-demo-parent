package com.mysoft.lcn.service;

import com.codingapi.tx.annotation.TxTransaction;
import com.mysoft.lcn.client.Demo2Client;
import com.mysoft.lcn.db.Demo1Mapper;
import com.mysoft.lcn.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 描述:
 *
 * @auth lnsof
 * @Date 2018/10/1 20:40
 * @Version 1.0
 */
@Service
public class Demo1Service {

    @Autowired
    private Demo1Mapper demo1Mapper;

    @Autowired
    private Demo2Client demo2Client;

    @TxTransaction(isStart = true)
    @Transactional
    public int create(User user) {

        // call demo2
        demo2Client.save();
        // exception
        int a = 1/0;

        return demo1Mapper.insert(user);
    }

}
