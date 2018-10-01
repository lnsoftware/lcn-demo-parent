package com.mysoft.lcn.db;

import com.mysoft.lcn.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 描述:
 *
 * @auth lnsof
 * @Date 2018/10/1 20:40
 * @Version 1.0
 */
@Mapper
public interface Demo3Mapper {

    @Insert("insert into user (name) values (#{user.name})")
    public int insert(@Param("user")User user);

}
