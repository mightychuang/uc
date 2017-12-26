package com.hhly.user.api.dto.request;

import com.hhly.common.annotation.ContainCheck;
import com.hhly.common.annotation.DiscardBlank;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
* @author wangxianchen
* @create 2017-09-01
* @desc 更新帐户认证状态
*/
@Getter
@Setter
@DiscardBlank
public class UpdateUserAuthReq {

    @NotEmpty(message = "用户ID不能为空")
    private String userId;

    /**
     * 是否认证(1:已认证律师 2:已认证知识产权代理人)
     */
    @NotEmpty(message = "用户ID不能为空")
    @ContainCheck(value = "1,2",message = "是否提交认证不正确")
    private Byte isAuth;
}
