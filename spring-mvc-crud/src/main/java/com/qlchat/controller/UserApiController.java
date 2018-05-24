package com.qlchat.controller;

import com.qlchat.base.ApiResponse;
import com.qlchat.dto.UserInfoDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author grabbywu
 * @Title: spring-mvc-ssm
 * @Package com.qlchat.controller
 * @Description: UserApi
 * @date 5/23/1811:10 PM
 */
@RequestMapping("/api")
public class UserApiController {
    /**
     * 以对象的形式转 自动序列化 Converter json
     * @return
     */
    @ResponseBody
//    @RequestMapping(value = "/test", method = GET)
    @GetMapping("/getUserInfo")
    public ApiResponse userInfo(){
        ApiResponse response = ApiResponse.ok();

        UserInfoDto userInfo = new UserInfoDto();
        userInfo.setNick("DaPeng");
        userInfo.setEmail("wuxiaopeng@qlchat.com");

        response.setData(userInfo);

        return response;
    }
}
