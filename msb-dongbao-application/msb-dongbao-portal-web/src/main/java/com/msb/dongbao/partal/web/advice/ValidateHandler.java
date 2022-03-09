package com.msb.dongbao.partal.web.advice;

import com.msb.dongbao.common.base.result.ResultWrapper;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @Auther: WZY
 * @Date: 2022/3/8 - 03 - 08 - 16:09
 * @Description: com.msb.dongbao.partal.web.advice
 * @version: 1.0
 */
@ControllerAdvice
public class ValidateHandler extends ResponseEntityExceptionHandler {
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                                                                  HttpHeaders headers,
                                                                  HttpStatus status,
                                                                  WebRequest request) {
        StringBuilder sb = new StringBuilder();
        for (FieldError fieldError: ex.getBindingResult().getFieldErrors()){
            String defaultMessage = fieldError.getDefaultMessage();
            sb.append("   "+defaultMessage);

            break;
        }

        return new ResponseEntity(ResultWrapper.builder().code(102).msg(sb.toString()).build() ,
                HttpStatus.OK);
    }
}
