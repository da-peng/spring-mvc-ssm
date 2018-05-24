package com.qlchat.controller;

import com.qlchat.base.ApiResponse;
import com.qlchat.base.DataResponse;
import com.qlchat.exception.BusinessException;
import com.qlchat.exception.ErrorCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/api")
public class IndexApiController {

    /**
     * 以map的形式转 自动Converter json
     *
     * @param num
     * @return
     */
    @ResponseBody
//    @RequestMapping(value = "/v/{num}", method = GET)
    @GetMapping("/{num}")
    public DataResponse user(@PathVariable String num) {
        DataResponse response = DataResponse.ok();

        Map<String, Object> ret = new HashMap<>();
        ret.put("num", num);
        response.setData(ret);

        return response;
    }

    /**
     * 抛出自定义异常到接口响应
     *
     * @param error
     * @return
     */
    @ResponseBody
//    @RequestMapping(value = "/e/{error}", method = GET)
    @GetMapping("/e/{error}")
    public ApiResponse error(@PathVariable String error) {


        throw new BusinessException(ErrorCode.SIGN_PARAM_ERROR);
    }


}
