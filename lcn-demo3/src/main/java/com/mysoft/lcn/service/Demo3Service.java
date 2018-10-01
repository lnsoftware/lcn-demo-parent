package com.mysoft.lcn.service;

import com.codingapi.tx.annotation.ITxTransaction;
import com.mysoft.lcn.db.Demo3Mapper;
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
public class Demo3Service implements ITxTransaction {

    @Autowired
    private Demo3Mapper demo3Mapper;

    @Transactional
    public int create(User user) {
        return demo3Mapper.insert(user);
    }

}
