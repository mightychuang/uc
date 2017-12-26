package com.hhly.user.api.dto.request;

import com.hhly.common.annotation.DiscardBlank;
import com.hhly.common.annotation.EnumCheck;
import com.hhly.user.api.enums.BizTypeEnum;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Pattern;

/**
* @author wangxianchen
* @create 2017-09-01
* @desc 验证码请求体
*/
@Getter
@Setter
@ToString
@DiscardBlank
public class CheckCodeReq {

    /**
     * 业务类型
     */
    @NotEmpty(message="业务类型不能为空")
    @EnumCheck(value = BizTypeEnum.class,message = "业务类型不正确")
    private String bizType;

    /**
     * 手机号码
     */
    @NotEmpty(message="手机号码不能为空")
    @Pattern(regexp = "^(1)\\d{10}$",message="手机号码不正确")
    private String phoneNo;

}
