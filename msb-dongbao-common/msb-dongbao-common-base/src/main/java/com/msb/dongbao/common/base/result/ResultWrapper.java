package com.msb.dongbao.common.base.result;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @Auther: WZY
 * @Date: 2022/3/8 - 03 - 08 - 14:44
 * @Description: com.msb.dongbao.common.base.result
 * @version: 1.0
 */
@Data
@Builder
public class ResultWrapper<T> implements Serializable {

    //状态码
    private int code;

    //提示信息
    private String msg;

    private T data;
}
