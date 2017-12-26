package com.hhly.user.api.dto.request;

import com.hhly.common.annotation.ContainCheck;
import com.hhly.common.annotation.DiscardBlank;
import com.hhly.common.annotation.EnumCheck;
import com.hhly.user.api.enums.AppEnum;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.util.List;

/**
* @author wangxianchen
* @create 2017-09-01
* @desc 角色添加请求体
*/
@Getter
@Setter
@ToString
@DiscardBlank
public class RoleAddReq {

    /**
     * 角色名称 <=30
     */
    @NotEmpty(message="角色名称不能为空")
    @Size(max = 30,message = "角色名称长度超过30个字符")
    private String name;

    /**
     *角色编码,惟一性约束,一旦创建不可更改  <=20
     */
    @NotEmpty(message="角色编码不能为空")
    @Size(max = 20,message = "角色编码长度超过20个字符")
    private String code;

    /**
     *所属应用编码,一个角色只能对应一个app  <=32
     */
    @NotEmpty(message="所属应用编码不能为空")
    @EnumCheck(value = AppEnum.class,message = "菜单类型错误")
    private String appCode;

    /**
     *状态(1：启用 0：禁用)
     */
    @NotEmpty(message="状态码不能为空")
    @ContainCheck(value = "0,1",message = "状态码不正确")
    private String state;

    /**
     *描述 <=50
     */
    @Size(max = 50,message = "描述长度超过50个字符")
    private String description;


    
}
