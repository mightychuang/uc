package com.hhly.user.api.dto.request;

import com.hhly.common.annotation.ContainCheck;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;


/**
 * @author wangxianchen
 * @create 2017-08-30
 * @desc 用户列表查询请求体
 */
@Getter
@Setter
public class UserRoleQueryReq {

    //不能为空
    private String userId;

    private String roleName;

    /**
     * 是否选择 1:已选择  2:未选择 不能为空
     */
    private String type = "1";

}
