package com.hhly.user.api.dto.response;

import com.google.gson.Gson;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

/**
* @author wangxianchen
* @create 2017-08-30
* @desc 帐户详细信息
*/
@Getter
@Setter
public class UserDetailResp {

    private String userId;

    private String loginName;

    private String realName;

    private String phone;

    private String email;

    private Byte state;

    private String stateDesc;

    private Byte regType;

    private Byte isAuth;

    private Byte accType;

    private String appCode;

    private String regDeviceType;

    private String regDeviceId;

    private Date createTime;

    private String createUser;

    private Date updateTime;

    private String updateUser;

    private Byte isDelete;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
