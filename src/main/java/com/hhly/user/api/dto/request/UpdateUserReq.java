package com.hhly.user.api.dto.request;

import com.hhly.common.annotation.ContainCheck;
import com.hhly.common.annotation.DateCheck;
import com.hhly.common.annotation.DiscardBlank;
import com.hhly.common.util.ValidatorUtil;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
* @author wangxianchen
* @create 2017-09-01
* @desc 帐户编辑请求体
*/
@Getter
@Setter
@DiscardBlank
public class UpdateUserReq {
    /**
     * 手机号
     */
    @Pattern(regexp = "^(1)\\d{10}$",message="手机号码不正确")
    private String phone;
    /**
     * 邮件地址<=50
     */
    @Pattern (regexp="[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}", message="邮件格式错误")
    private String email;
    /**
     * 真实姓名<=30
     */
    @Size(max = 30,message = "真实姓名字符长度不能大于30")
    private String realName;

}
