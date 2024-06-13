package com.zhihe.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhihe.model.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

/**
* @author 86184
* @description 针对表【user(用户)】的数据库操作Mapper
* @createDate 2024-02-19 12:37:54
* @Entity generator.domain.User
*/
public interface UserMapper extends BaseMapper<User> {

}




