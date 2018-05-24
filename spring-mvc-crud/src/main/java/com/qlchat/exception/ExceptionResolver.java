package com.qlchat.exception;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.qlchat.base.ApiResponse;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.springframework.core.annotation.Order;
/**
 * @author grabbywu
 * @Title: spring-mvc-ssm
 * @Package com.qlchat.exception
 * @Description: 异常解释处理类
 * @date 5/23/185:26 PM
 */
@Order(-1000)
public class ExceptionResolver implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception ex) {

        JSONObject json=new JSONObject();
        //处理异常
        if(ex instanceof BusinessException) {
            BusinessException businessException = (BusinessException) ex;
            json.put("code",businessException.getCode());
            json.put("msg",businessException.getMsg());
        } else { //其它错误
            json.put("code",102);
            json.put("msg","异常");
            ex.printStackTrace();
        }
        try {
            httpServletResponse.setContentType("text/javascript; charset=utf-8"); //处理中文乱码
            httpServletResponse.getWriter().write(JSON.toJSONString(json));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return  new ModelAndView();
    }
}
