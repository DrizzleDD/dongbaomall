package com.msb.dongbao.ums.entity.dto;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

/**
 * @Auther: WZY
 * @Date: 2022/3/7 - 03 - 07 - 15:38
 * @Description: com.msb.dongbao.ums.entity.dto
 * @version: 1.0
 */
@Data
@ToString
public class UmsMemberRegisterParamDTO {

    @Size(min = 1,max = 8,message = "用户名长度在1-8之间")
    private String username;

    private String password;

    private String icon;

    @Email
    private String email;

    private String nickName;
}
