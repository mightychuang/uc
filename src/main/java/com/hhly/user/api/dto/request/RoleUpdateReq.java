package com.hhly.user.api.dto.request;

import com.hhly.common.annotation.ContainCheck;
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
 *
 * 角色编辑请求
 * Created by zsq-1186 on 2017/8/7.
 *
 */
@Getter
@Setter
@ToString
@DiscardBlank
public class RoleUpdateReq {

    /**
     * 角色名称 <=30
     */
    @Size(max = 30,message = "角色名称长度超过30个字符")
    private String name;

    /**
     *角色编码,惟一性约束,一旦创建不可更改  <=20
     */
    @NotEmpty(message="角色编码不能为空")
    private String code;

    /**
     *状态(1：启用 0：禁用)
     */
    @ContainCheck(value = "0,1",message = "状态码不正确")
    private String state;

    /**
     *描述 <=50
     */
    @Size(max = 50,message = "描述长度超过50个字符")
    private String description;


}
