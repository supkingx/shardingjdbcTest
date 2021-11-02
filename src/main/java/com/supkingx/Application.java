package com.supkingx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.transaction.jta.JtaAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @description:
 * @Author: wangchao
 * @Date: 2021/11/1
 */
@MapperScan("com.supkingx.dao")
@SpringBootApplication(exclude = JtaAutoConfiguration.class)
public class Application {
    public static void main(final String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);
    }
}
