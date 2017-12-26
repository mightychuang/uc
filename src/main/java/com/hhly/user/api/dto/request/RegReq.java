package com.hhly.user.api.dto.request;

import com.hhly.common.annotation.ContainCheck;
import com.hhly.common.annotation.DiscardBlank;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.*;

/**
* @author wangxianchen
* @create 2017-09-01
* @desc 注册请求体
*/
@Getter
@Setter
@ToString
@DiscardBlank
public class RegReq {

    /**
     * 注册类型1:手机号 2:邮箱
     */
    @NotEmpty(message = "注册类型不能为空")
    @ContainCheck(value = "1,2",message = "注册类型不正确")
    private String regType;

    /**
     * 帐户名称 <=30
     */
    @NotEmpty(message="帐户名称不能为空")
    @Size(max = 30,message = "帐户名称长度超过30个字符")
    private String regName;

    /**
     * 帐户密码  <=32
     */
    @NotEmpty(message="帐户密码不能为空")
    @Size(max = 32,message = "帐户密码长度超过32个字符")
    private String regPwd;

    /**
     * 验证码
     */
    @NotEmpty(message="验证码不能为空")
    private String checkCode;

}
