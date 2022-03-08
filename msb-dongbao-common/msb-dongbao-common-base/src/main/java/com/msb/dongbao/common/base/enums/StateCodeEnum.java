package com.msb.dongbao.common.base.enums;

import lombok.Data;

/**
 * @Auther: WZY
 * @Date: 2022/3/8 - 03 - 08 - 14:33
 * @Description: com.msb.dongbao.common.base.enums
 * @version: 1.0
 */

public enum StateCodeEnum {

    /**
     * 请求成功
     */
    SUCCESS(200,"请求成功");

    private int code;
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    StateCodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
