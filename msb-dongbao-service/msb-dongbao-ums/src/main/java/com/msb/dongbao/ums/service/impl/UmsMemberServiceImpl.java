package com.msb.dongbao.ums.service.impl;

import com.msb.dongbao.ums.entity.*;
import com.msb.dongbao.ums.entity.dto.UmsMemberLoginParamDTO;
import com.msb.dongbao.ums.entity.dto.UmsMemberRegisterParamDTO;
import com.msb.dongbao.ums.mapper.UmsMemberMapper;
import com.msb.dongbao.ums.service.UmsMemberService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author Clark
 * @since 2022-03-06
 */
@Service
public class UmsMemberServiceImpl implements UmsMemberService {

    @Autowired
    private UmsMemberMapper umsMemberMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public String login(UmsMemberLoginParamDTO umsMemberLoginParamDTO) {
        //根据用户名查询得到用户
        UmsMember umsMember = umsMemberMapper.selectByName(umsMemberLoginParamDTO.getUsername());

        if(null != umsMember){
            //得到数据库既存密码
            String passwordDb = umsMember.getPassword();
            //DTO里传来的密码和数据库既存密码对比，用passwordEncoder.matches()
            if(!passwordEncoder.matches(umsMemberLoginParamDTO.getPassword(),passwordDb)){
                return "密码不正确";
            }
        }else {
            return "用户不存在";
        }

        return "token";
    }

    @Override
    public String register(UmsMemberRegisterParamDTO userMemberRegisterParamDTO) {
        //DTO 转换成entity
        UmsMember umsMember = new UmsMember();
        BeanUtils.copyProperties(userMemberRegisterParamDTO,umsMember);

        //Bcrypt加密
        String encode = passwordEncoder.encode(userMemberRegisterParamDTO.getPassword());

        //entity设置加密好的encode
        //保存在持久层
        umsMember.setPassword(encode);
        umsMemberMapper.insert(umsMember );
        return "success";
    }
}
