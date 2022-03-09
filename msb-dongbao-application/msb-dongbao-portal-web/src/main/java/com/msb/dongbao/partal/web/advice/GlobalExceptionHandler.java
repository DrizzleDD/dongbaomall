package com.msb.dongbao.partal.web.advice;

import com.msb.dongbao.common.base.result.ResultWrapper;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: WZY
 * @Date: 2022/3/9 - 03 - 09 - 10:39
 * @Description: com.msb.dongbao.partal.web.advice
 * @version: 1.0
 */
@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {

    //所有异常都走这里
    @ExceptionHandler(Exception.class)
    public ResultWrapper customException(){
        return ResultWrapper.builder().code(301).msg("统一异常").build();
    }
}
