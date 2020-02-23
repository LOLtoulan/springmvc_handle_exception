package com.toulan.controller;

import com.toulan.exception.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author LOL_toulan
 * @Time 2020/2/24 0:24
 * @Message
 */
@Controller
@RequestMapping("/test")
public class TestHandleException {


    @RequestMapping("/testException")
    public String testException()throws Exception{
        System.out.println("testException执行了。。。");

        try {
            //模拟程序出现异常
            int a = 10 / 0;
        } catch (Exception e) {
            e.printStackTrace();
            //抛出自定义异常信息
            throw new SysException("系统出现了异常。。。");
        }

        return "success";
    }

}
