package com.hhly.user.api.dto.request;

import com.hhly.common.annotation.ContainCheck;
import com.hhly.user.api.enums.StateEnum;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

/**
 * @author wangxianchen
 * @create 2017-09-27
 * @desc
 */
@Getter
@Setter
public class AppUpdateReq {

    @NotEmpty(message = "应用编码不能为空")
    @Size(max = 10,message = "应用编码长度超过10个字符")
    private String appCode;

    @Size(max = 10,message = "应用名称长度超过10个字符")
    private String appName;

    //状态(0:禁用 1:启用)
    @ContainCheck(value = "0,1",message = "状态码不正确")
    private String state;
}
