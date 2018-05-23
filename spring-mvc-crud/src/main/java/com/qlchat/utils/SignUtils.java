package com.qlchat.utils;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.DigestUtils;

import java.util.Map;

/**
 * @author grabbywu
 * @Title: spring-mvc-ssm
 * @Package com.qlchat.utils
 * @Description: todo
 * @date 5/23/184:41 PM
 */
public class SignUtils {

    private static String VERIFY_SIGN;


    public static boolean verifyParam(Map<String, String[]> map, String secret) {
        if (map == null || map.size() < 2) {
            return false;
        }

        String sign = null;

        StringBuilder sb = new StringBuilder();
        if (map.size() > 0) {
            for (Map.Entry<String, String[]> entry : map.entrySet()) {
                if (!VERIFY_SIGN.equals(entry.getKey())) {
                    //如果这个键值对不是签名键值对，那么sb后面添上这个东西转成的字符串
                    sb.append(entry.getKey()).append(':').append(entry.getValue()).append('-');
                } else {
                    //如果这个键值对就是签名键值对，那么获取到签名值。
//                    sign = entry.getValue();
                }
            }

            if (StringUtils.isBlank(sign)) {
                return false;
            } else if (sb.length() > 0) {
                //去掉最后一个字符
                sb.deleteCharAt(sb.length() - 1);
            }
            String tmp = "";
            //加密校验签名是否一致
            if (!sign.toLowerCase().equals(DigestUtils.md5DigestAsHex(tmp.getBytes()))) {

                return false;
            }

            return true;
        }
        return false;
    }
}

