package com.qlchat.interceptor;

import com.qlchat.exception.BusinessException;
import com.qlchat.exception.ErrorCode;
import com.qlchat.utils.SignUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

/**
 * Created by Administrator on  此处应用于业务/api 接口
 */
public class ApiInterceptor implements HandlerInterceptor {
    private static final String SECRET = "";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse httpServletResponse, Object o) {
        //该方法将在请求处理之前进行调用，比如判断当前登录的用户，如果没有登录
        // 跳到你自己的登录页面 response.sendRedirect("/admin/login"); 返回 false，下面两个方法都不会执行
        //有登录，返回true
        Map<String, String[]> map = request.getParameterMap();
        System.out.println("ApiInterceptor");

//        String timestamp = request.getParameter("timestamp");
        String sign = request.getParameter("sign");
//        String id = request.getParameter("id");

//        if (StringUtils.isBlank(timestamp) || StringUtils.isBlank(sign) || StringUtils.isBlank(id)) {
        if ( StringUtils.isBlank(sign)) {
            throw new BusinessException(ErrorCode.WRONG_PARAMS);

        } else {
            boolean flag = true; //todo
            //验证用户发来参数中的校验签名是否和秘钥一致
//            boolean flag = SignUtils.verifyParam(map, SECRET);

            if (!flag) {
                throw new BusinessException(ErrorCode.SIGN_PARAM_ERROR);
            }

            return flag;
        }
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object
            o, ModelAndView modelAndView) throws Exception {
        //preHandle 方法的返回值为true 时才能被调当前请求进行处理之后，
        // 也就是Controller 方法调用之后执行，但是它会在DispatcherServlet 进行视图返回渲染之前被调用

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse
            httpServletResponse, Object o, Exception e) throws Exception {
        //该方法将在整个请求结束之后，也就是在DispatcherServlet 渲染了对应的视图之后执行
        // 在这里可以做些日志处理 LogUtils.saveLog(request, handler, e);
    }

    private void returnJson(HttpServletResponse response, String json) throws Exception {
        PrintWriter writer = null;
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=utf-8");
        try {
            writer = response.getWriter();
            writer.print(json);

        } catch (IOException e) {
            System.out.println("1111");
        } finally {
            if (writer != null)
                writer.close();
        }
    }
}
