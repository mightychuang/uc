package com.hhly.user.api.dto.request;

import com.hhly.common.annotation.ContainCheck;
import com.hhly.common.annotation.DiscardBlank;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

/**
 * @author wangxianchen
 * @create 2017-08-31
 * @desc 更改用户状态请求体
 */
@Setter
@Getter
@DiscardBlank
public class UserStateChangeReq {

    @NotEmpty(message = "用户ID不能为空")
    private String userId;

    @NotEmpty(message = "状态码不能为空") // 1:正常 2:锁定
    @ContainCheck(value = "1,2",message = "状态码格式错误")
    private String state;

    @Size(max = 30,message = "变更理由字符长度不能大于30")
    private String stateDesc;
}
