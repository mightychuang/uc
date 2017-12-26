package com.hhly.user.api.dto.response;

import com.google.gson.Gson;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

/**
* @author wangxianchen
* @create 2017-08-30
* @desc 帐户登录后的数据返回
*/
@Getter
@Setter
public class UserLoginResp {

    private String userId;

    private String loginName;

    private String phone;

    private String email;

    private String sessionKey;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
