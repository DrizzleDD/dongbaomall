package com.msb.dongbao.common.base.result;

import com.msb.dongbao.common.base.enums.StateCodeEnum;
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


    /**
     *  返回成功的包装
     * @return
     */
    public  static ResultWrapper.ResultWrapperBuilder getSuccessBuilder(){
        return ResultWrapper.builder().code(StateCodeEnum.SUCCESS.getCode()).msg(StateCodeEnum.SUCCESS.getMsg());
    }

    /**
     * 请求失败的包装
     * @return
     */
    public  static ResultWrapper.ResultWrapperBuilder getFailBuilder(){
        return ResultWrapper.builder().code(StateCodeEnum.FAIL.getCode()).msg(StateCodeEnum.FAIL.getMsg());
    }

}
