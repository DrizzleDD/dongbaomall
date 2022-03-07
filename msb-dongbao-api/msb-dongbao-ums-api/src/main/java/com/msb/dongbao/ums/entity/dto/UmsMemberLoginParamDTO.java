package com.msb.dongbao.ums.entity.dto;

import lombok.Data;
import lombok.ToString;

/**
 * @Auther: WZY
 * @Date: 2022/3/7 - 03 - 07 - 17:00
 * @Description: com.msb.dongbao.ums.entity.dto
 * @version: 1.0
 */
@Data
@ToString
public class UmsMemberLoginParamDTO {
    private String username;
    private String password;
}
