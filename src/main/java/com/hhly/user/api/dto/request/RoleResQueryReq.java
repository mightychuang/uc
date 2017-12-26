package com.hhly.user.api.dto.request;

import com.hhly.common.annotation.ContainCheck;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * Description: 查询 权限上
 *
 * @author: zsq-1186
 * Date: 2017-09-22-15:20
 */

@Getter
@Setter
@ToString
public class RoleResQueryReq {

    @NotEmpty(message = "角色编码不能为空")
    private String roleCode;

    private String resName;

    /**
     * 选择状态 1:已选择  2:未选择
     */
    @ContainCheck(value = "1,2",message = "选择状态格式错误")
    private String type = "1";

    private String appCode;
}
