package com.msb.dongbao.partal.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: WZY
 * @Date: 2022/3/6 - 03 - 06 - 15:21
 * @Description: com.msb.dongbao.partal.web.controller
 * @version: 1.0
 */
@RestController
@RequestMapping("/user-member")
public class UserMemberController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
