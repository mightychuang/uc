package com.hhly.user.api.dto.request;

import com.hhly.common.annotation.DateCheck;
import com.hhly.common.annotation.DiscardBlank;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author wangxianchen
 * @create 2017-08-30
 * @desc 用户列表查询请求体
 */
@Getter
@Setter
public class UserQueryReq {

    private String loginName;

    private String realName;

    private String phone;

    private String email;

    private Byte state;

    //用户类型
    //@NotEmpty
    private Byte accType;

    @DateCheck(value="yyyy-MM-dd HH:mm:ss", message="注册时间格式错误")
    private String createTimeBegin;

    @DateCheck(value="yyyy-MM-dd HH:mm:ss", message="注册时间格式错误")
    private String createTimeEnd;

}
