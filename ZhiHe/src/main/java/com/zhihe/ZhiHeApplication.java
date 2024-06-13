package com.zhihe;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Arrays;

@SpringBootApplication
@MapperScan("com.zhihe.mapper")
@EnableScheduling
@EnableTransactionManagement
public class ZhiHeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZhiHeApplication.class, args);

	}

}
