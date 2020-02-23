package com.toulan.exception;

/**
 * @Author LOL_toulan
 * @Time 2020/2/24 0:40
 * @Message 自定义异常类
 */
public class SysException extends Exception {

    private String message;

    public SysException() {
    }

    public SysException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
