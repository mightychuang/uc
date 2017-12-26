package com.hhly.user.api.dto.request;

import com.hhly.common.annotation.DiscardBlank;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


/**
* @author wangxianchen
* @create 2017-09-01
* @desc 重置密码请求体
*/
@Getter
@Setter
@ToString
@DiscardBlank
public class ResetPwdReq {
    /**
     * 帐户名称
     */
    @NotEmpty(message="帐户名称不能为空")
    private String loginName;

    /**
     * 手机号码
     */
    @NotEmpty(message="手机号码不能为空")
    @Pattern(regexp = "^(1)\\d{10}$",message="手机号码不正确")
    private String phoneNo;

    /**
     * 验证码
     */
    @NotEmpty(message="验证码不能为空")
    private String checkCode;


    @NotEmpty(message="新密码不能为空")
    @Size(max = 32,message = "密码长度超过32个字符")
    private String newPwd;


}
