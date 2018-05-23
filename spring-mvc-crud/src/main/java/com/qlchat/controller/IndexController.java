package com.qlchat.controller;

import com.qlchat.base.ApiResponse;
import com.qlchat.base.DataResponse;
import com.qlchat.dto.UserInfo;
import com.qlchat.exception.BusinessException;
import com.qlchat.exception.ErrorCode;
import com.qlchat.utils.LogUtils;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class IndexController {
    private static final String template = "Hello, %s!";
    Logger logger =  LogUtils.getBussinessLogger();

// http://localhost:8082/?name=xh

//    @GetMapping("/")
    @RequestMapping(value = "/", method = GET)
    public String index(@RequestParam(value="name", required=false, defaultValue="World") String name,Model m){
        m.addAttribute("someAttribute",String.format(template,name));

//        logger.info("Bussiness！！");
        return "index";
    }

    @ResponseBody
    @RequestMapping(value = "/test", method = GET)
    public ApiResponse userInfo(){
        ApiResponse response = ApiResponse.ok();

        UserInfo userInfo = new UserInfo();
        userInfo.setNick("DaPeng");
        userInfo.setEmail("wuxiaopeng@qlchat.com");

        response.setData(userInfo);

        return response;
    }

    @ResponseBody
    @RequestMapping(value = "/v/{num}", method = GET)
    public DataResponse user(@PathVariable String num){
        DataResponse response = DataResponse.ok();

        Map<String,Object> ret = new HashMap<>();
        ret.put("num",num);
        response.setData(ret);

        return response;
    }

    @ResponseBody
    @RequestMapping(value = "/e/{error}", method = GET)
    public ApiResponse error(@PathVariable String error)  {


        throw  new BusinessException(ErrorCode.SIGN_PARAM_ERROR);
    }

}
