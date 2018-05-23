package com.qlchat.exception;

import com.alibaba.fastjson.JSON;
import com.qlchat.base.ApiResponse;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author grabbywu
 * @Title: spring-mvc-ssm
 * @Package com.qlchat.exception
 * @Description: todo
 * @date 5/23/185:26 PM
 */
public class ExceptionResolver implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception ex) {

        ApiResponse response = new ApiResponse();
        //处理异常
        if(ex instanceof BusinessException) {
            BusinessException businessException = (BusinessException) ex;
            response.setMsg(businessException.getMsg());
            response.setCode(businessException.getCode());
        } else { //其它错误
            response.setMsg("系统异常");
            response.setCode(100);
        }
        try {
            httpServletResponse.getWriter().write(JSON.toJSONString(response));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return  new ModelAndView();
    }
}
