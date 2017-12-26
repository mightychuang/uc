package com.hhly.user.api.dto.request;

import com.hhly.common.annotation.DiscardBlank;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

/**
* @author wangxianchen
* @create 2017-09-01
* @desc 密码变更请求体
*/
@Getter
@Setter
@ToString
@DiscardBlank
public class ModifyPwdReq {

    /**
     * 新密码 <=20
     */
    @NotEmpty(message="新密码不能为空")
    @Size(max = 32,message = "新密码长度超过32个字符")
    private String newPwd;

    /**
     * 旧密码 <=20
     */
    @NotEmpty(message="旧密码不能为空")
    @Size(max = 32,message = "旧密码长度超过32个字符")
    private String oldPwd;

    //验证码
    //@NotEmpty(message="验证码不能为空")
    //private String checkCode;


}
