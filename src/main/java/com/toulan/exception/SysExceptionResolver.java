package com.toulan.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author LOL_toulan
 * @Time 2020/2/24 0:48
 * @Message
 */
public class SysExceptionResolver implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {

        SysException exception = null;

        if (ex instanceof SysException) {
            exception = (SysException) ex;
        } else {
            exception = new SysException("系统正在维护。。。");
        }

        ModelAndView mv = new ModelAndView();

        mv.addObject("errorMsg", exception.getMessage());

        mv.setViewName("error");

        return mv;
    }
}
