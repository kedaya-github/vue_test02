package com.czxy;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhangjian1
 * @version 1.3
 * @Date 2019/10/18
 * @since 1.2
 */
@SpringBootApplication
public class MyBoot {
    public static void main(String[] args) {
        SpringApplication.run(MyBoot.class , args);
        System.out.println("启动");
    }
}
