package com.msb.dongbao.partal.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @Auther: WZY
 * @Date: 2022/3/6 - 03 - 06 - 15:22
 * @Description: com.msb.dongbao.partal.web
 * @version: 1.0
 */
@SpringBootApplication(scanBasePackages = "com.msb")
@MapperScan("com.msb.dongbao.ums.mapper")
public class MsbDongbaoPortalWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsbDongbaoPortalWebApplication.class,args);
    }


}


