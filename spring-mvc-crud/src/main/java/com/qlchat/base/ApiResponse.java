package com.qlchat.base;

import java.util.HashMap;
import java.util.Map;

/**
 * @author grabbywu
 * @Title: spring-mvc-ssm
 * @Package com.qlchat.dto
 * @Description: 将response 划分为 {code ,msg} 以及 data{K:V , K:V  }
 * @date 5/22/184:48 PM
 */
public class ApiResponse  extends BaseResponse{

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }



    public static ApiResponse ok() {
        ApiResponse result = new ApiResponse();
        result.setCode(200);
        result.setMsg("成功");
        return result;
    }


    public ApiResponse error() {
        ApiResponse result = new ApiResponse();
        result.setCode(100);
        result.setMsg("失败");
        return result;
    }
}
