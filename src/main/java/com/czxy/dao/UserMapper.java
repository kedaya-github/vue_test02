package com.czxy.dao;

import com.czxy.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zhangjian1
 * @version 1.3
 * @Date 2019/10/18
 * @since 1.2
 */
@Mapper
public interface UserMapper extends tk.mybatis.mapper.common.Mapper<User> {
}
