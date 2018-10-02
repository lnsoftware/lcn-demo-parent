package com.mysoft.lcn.mapper;

import com.mysoft.lcn.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

/**
 * 描述:
 *
 * @auth lnsof
 * @Date 2018/10/2 9:50
 * @Version 1.0
 */
public interface UserMapper {

    @Insert("insert into user (name) values (#{user.name})")
    public int insert(@Param("user") User user);
}
