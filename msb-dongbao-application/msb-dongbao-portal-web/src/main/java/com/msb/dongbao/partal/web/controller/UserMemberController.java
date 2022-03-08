package com.msb.dongbao.partal.web.controller;

import com.msb.dongbao.ums.entity.dto.UmsMemberLoginParamDTO;
import com.msb.dongbao.ums.entity.dto.UmsMemberRegisterParamDTO;
import com.msb.dongbao.ums.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @Autowired
    UmsMemberService umsMemberService;

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/register")
    public String register(@RequestBody UmsMemberRegisterParamDTO userMemberRegisterParamDTO){
        umsMemberService.register(userMemberRegisterParamDTO);
        return "register";
    }

    @GetMapping("/login")
    public String login(@RequestBody UmsMemberLoginParamDTO umsMemberLoginParamDTO){
        umsMemberService.login(umsMemberLoginParamDTO);
        return "login";
    }
}
