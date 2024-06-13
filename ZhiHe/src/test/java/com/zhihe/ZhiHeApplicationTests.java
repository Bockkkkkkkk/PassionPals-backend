package com.zhihe;

import com.zhihe.model.domain.User;
import com.zhihe.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootTest
class ZhiHeApplicationTests {
	@Autowired
	private UserService userService;

	@Test
	void contextLoads() {
		userService.updateUser(new User(),new User());
    }

}
