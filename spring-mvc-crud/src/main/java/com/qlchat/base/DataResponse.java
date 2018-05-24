package com.qlchat.base;

import java.util.HashMap;
import java.util.Map;

/**
 * @author grabbywu
 * @Title: spring-mvc-ssm
 * @Package com.qlchat.base
 * @Description: 基于Map的response
 * @date 5/23/182:48 PM
 */
public class DataResponse extends BaseResponse{

    private Map<String,Object> data = new HashMap<>();

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }



    public static DataResponse ok() {
        DataResponse result = new DataResponse();
        result.setCode(200);
        result.setMsg("处理成功！");
        return result;
    }


    public DataResponse error() {
        DataResponse result = new DataResponse();
        result.setCode(100);
        result.setMsg("处理失败！");
        return result;
    }

}
