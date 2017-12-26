package com.hhly.user.api.dto.request;

import lombok.Getter;
import lombok.Setter;

/**
 * @author wangxianchen
 * @create 2017-08-28
 * @desc request header
 */
@Setter
@Getter
public class HeaderReq {

    //帐户ID
    private String userId;
    //登录来自应用
    private String appCode;
    //登录设备类型
    private String platform;
    //登录设备ID
    private String imei;
    //终端设备(浏览器)版本标识
    private String userAgent;
    //访问请求过来,产生的sessionKey

   //以下属性不包含在request header里
    /**登录IP**/
    private String ip;
    //appCode,platform,imei,userAgent,ip 的Md5加密
    private String secretKey;

    @Override
    public String toString() {
        return "HeaderReq{" +
                "userId='" + userId + '\'' +
                ", appCode='" + appCode + '\'' +
                ", platform='" + platform + '\'' +
                ", imei='" + imei + '\'' +
                ", userAgent='" + userAgent + '\'' +
                ", ip='" + ip + '\'' +
                '}';
    }
}
