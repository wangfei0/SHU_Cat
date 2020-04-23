package com.wf.shucat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(value = "com.wf.shucat.mapper")//扫描mapper接口所在的包
public class ShuCatApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShuCatApplication.class, args);
    }

}
