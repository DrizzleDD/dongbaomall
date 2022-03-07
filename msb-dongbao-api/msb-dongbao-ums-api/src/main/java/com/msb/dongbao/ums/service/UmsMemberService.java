package com.msb.dongbao.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.msb.dongbao.ums.entity.*;
import com.msb.dongbao.ums.entity.dto.UserMemberRegisterParamDTO;

/**
 * <p>
 * 后台用户表 服务类
 * </p>
 *
 * @author Clark
 * @since 2022-03-06
 */
public interface UmsMemberService {

    String register(UserMemberRegisterParamDTO userMemberRegisterParamDTO);

}
