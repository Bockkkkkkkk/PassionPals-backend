package com.zhihe.service;
import java.util.Date;

import com.baomidou.mybatisplus.core.toolkit.Assert;
import com.zhihe.model.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * ClassName:UserServiceTest
 * Package:com.zhihe.service
 * Description:
 *
 * @Author: Bock
 * @Create:2024/2/1913:09
 * @Version 1.0
 */
@SpringBootTest
class UserServiceTest {
    @Resource
    private UserService userService;

    @Test
    public void UserTest(){
        User user = new User();
        user.setUsername("bock");
        user.setUserAccount("bock");
        user.setAvatarUrl("https://web-tlias-bock.oss-cn-beijing.aliyuncs.com/mmexport1698629496615.png");
        user.setGender(0);
        user.setUserPassword("12345678");
        user.setPhone("12334345");
        user.setEmail("123412341234");
        user.setUserRole(1);
        user.setPlanetCode("123123");
        user.setTags("");

        boolean save = userService.save(user);

        Assert.isTrue(save,"插入失败");





    }

}