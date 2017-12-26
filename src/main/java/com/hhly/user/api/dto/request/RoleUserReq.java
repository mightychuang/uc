package com.hhly.user.api.dto.request;

import com.hhly.common.annotation.DiscardBlank;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.util.List;

/**
* @author wangxianchen
* @create 2017-09-27
* @desc 用户绑定/取消角色
*/
@Getter
@Setter
@ToString
@DiscardBlank
public class RoleUserReq {

    /**
     *帐户编码
     */
    @NotEmpty(message="用户ID不能为空")
    private String userId;

    /**
     *角色编码
     */
    @Size(min = 1,message="角色编码不能为空")
    private List<String> roleCodeArray;

    /**
     *操作类型(1:绑定 2:取消绑定)
     */
    @Min(value = 1,message = "操作类型错误")
    @Max(value = 2,message = "操作类型错误")
    private int opType;


}
