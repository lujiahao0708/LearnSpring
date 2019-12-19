package com.hellodev.common.entity;

import lombok.Getter;

/**
 * 状态码枚举
 * @author lujiahao
 * @date 2019-09-03
 */
@Getter
public enum StatusCode {
    OK(20000, "成功"),
    ERROR(20001, "失败"),
    LOGINERROR(20002, "用户名或密码错误"),
    ACCESSERROR(20003, "权限不足"),
    REMOTEERROR(20004, "远程调用失败"),
    REPERROR(20005, "重复操作");

    private Integer code;
    private String msg;

    StatusCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
