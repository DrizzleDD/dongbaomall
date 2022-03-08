package com.msb.dongbao.partal.web.controller;

import com.msb.dongbao.common.base.result.ResultWrapper;
import com.msb.dongbao.ums.entity.dto.UmsMemberLoginParamDTO;
import com.msb.dongbao.ums.entity.dto.UmsMemberRegisterParamDTO;
import com.msb.dongbao.ums.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/register")
    public ResultWrapper register(@RequestBody UmsMemberRegisterParamDTO userMemberRegisterParamDTO){
        umsMemberService.register(userMemberRegisterParamDTO);
        return ResultWrapper.getSuccessBuilder().data(null).build();
    }

    @PostMapping("/login")
    public String login(@RequestBody UmsMemberLoginParamDTO umsMemberLoginParamDTO){

        return umsMemberService.login(umsMemberLoginParamDTO);
    }
}
