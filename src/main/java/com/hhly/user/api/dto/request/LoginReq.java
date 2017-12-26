package com.hhly.user.api.dto.request;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hhly.common.annotation.ContainCheck;
import com.hhly.common.annotation.DiscardBlank;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.NotEmpty;

/**
* @author wangxianchen
* @create 2017-09-01
* @desc 登录请求体
*/
@Getter
@Setter
@ToString
@DiscardBlank
public class LoginReq {

    /**
     * 登录名称
     */
    @NotEmpty(message="登录名称不能为空")
    private String loginName;

    /**
     * 登录密码
     */
    @NotEmpty(message="登录密码不能为空")
    private String password;


    @JsonIgnore
    public String toJSONStr(){
        return JSON.toJSONString(this);
    }
}
