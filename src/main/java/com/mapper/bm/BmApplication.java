package com.mapper.bm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//@ComponentScan(basePackages = "com.mapper.bm.mapper")
//@MapperScan(value = "com.mapper.bm.mapper")
@MapperScan(value = "com.mapper.bm.mapper")
public class BmApplication {

    public static void main(String[] args) {
        SpringApplication.run(BmApplication.class, args);
    }

}
