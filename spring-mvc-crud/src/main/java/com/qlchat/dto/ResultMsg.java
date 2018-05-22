package com.qlchat.dto;

import java.util.HashMap;
import java.util.Map;

/**
 * @author grabbywu
 * @Title: spring-mvc-ssm
 * @Package com.qlchat.dto
 * @Description: 将response 划分为 {code ,msg} 以及 data{K:V , K:V  }
 * @date 5/22/184:48 PM
 */
public class ResultMsg {
    // 状态码
    private  int code;


    // 返回信息
    private  String msg;

    // 要返回的数据
    private Map<String,Object> data = new HashMap<String,Object>();


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    public ResultMsg putData(String key,Object value) {
        this.getData().put(key,value);
        return this;
    }

    public static ResultMsg success(){
        ResultMsg result = new ResultMsg();
        result.setCode(200);
        result.setMsg("处理成功！");
        return result;
    }

    public static ResultMsg fail(){
        ResultMsg result = new ResultMsg();
        result.setCode(100);
        result.setMsg("处理失败！");
        return result;
    }

}
