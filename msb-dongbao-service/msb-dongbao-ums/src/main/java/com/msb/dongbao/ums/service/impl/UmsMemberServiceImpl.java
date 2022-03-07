package com.msb.dongbao.ums.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.msb.dongbao.ums.entity.UmsMember;
import com.msb.dongbao.ums.entity.dto.UserMemberRegisterParamDTO;
import com.msb.dongbao.ums.mapper.UmsMemberMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.msb.dongbao.ums.service.UmsMemberService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
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
        UmsMember umsMember = new UmsMember();
        BeanUtils.copyProperties(userMemberRegisterParamDTO,umsMember);
        umsMemberMapper.insert(umsMember );
        return "success";
    }
}
