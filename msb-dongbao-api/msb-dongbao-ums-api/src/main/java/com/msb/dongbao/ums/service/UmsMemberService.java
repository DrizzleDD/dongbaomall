package com.msb.dongbao.ums.service;

import com.msb.dongbao.ums.entity.dto.UmsMemberLoginParamDTO;
import com.msb.dongbao.ums.entity.dto.UmsMemberRegisterParamDTO;

/**
 * <p>
 * 后台用户表 服务类
 * </p>
 *
 * @author Clark
 * @since 2022-03-06
 */
public interface UmsMemberService {

    String register(UmsMemberRegisterParamDTO userMemberRegisterParamDTO);
    String login(UmsMemberLoginParamDTO umsMemberLoginParamDTO);

}
