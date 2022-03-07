package com.msb.dongbao.ums.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.msb.dongbao.ums.entity.UmsMember;
import com.msb.dongbao.ums.entity.dto.UserMemberRegisterParamDTO;
import com.msb.dongbao.ums.mapper.UmsMemberMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.msb.dongbao.ums.service.UmsMemberService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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
    UmsMemberMapper umsMemberMapper;

    @Override
    public String register(UserMemberRegisterParamDTO userMemberRegisterParamDTO) {
        //DTO 转换成entity
        UmsMember umsMember = new UmsMember();
        BeanUtils.copyProperties(userMemberRegisterParamDTO,umsMember);

        //Bcrypt加密
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String encode = bCryptPasswordEncoder.encode(userMemberRegisterParamDTO.getPassword());

        //entity设置加密好的encode
        //保存在持久层
        umsMember.setPassword(encode);
        umsMemberMapper.insert(umsMember );
        return "success";
    }
}
