package com.mysoft.lcn.service;

import com.codingapi.tx.annotation.ITxTransaction;
import com.mysoft.lcn.entity.User;
import com.mysoft.lcn.mapper.UserMapper;
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
public class UserService implements ITxTransaction {

    @Autowired
    private UserMapper userMapper;

    @Transactional
    public int create(User user) {
        return userMapper.insert(user);
    }

}
