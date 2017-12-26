package com.hhly.user.api.dto.request;

import com.hhly.common.annotation.ContainCheck;
import com.hhly.common.annotation.DiscardBlank;
import com.hhly.common.annotation.EnumCheck;
import com.hhly.user.api.enums.AppEnum;
import com.hhly.user.api.enums.ResEnums;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

/**
 * Description:
 *平台新资源添加请求
 * @author: zsq-1186
 * Date: 2017-08-08-17:32
 */
@Getter
@Setter
@ToString
@DiscardBlank
public class ResourceReq {

    /**
     * 菜单名称 <=20
     */
    @NotEmpty(message="菜单名称不能为空")
    @Size(max = 20,message = "菜单名称长度超过20个字符")
    private String name;

    /**
     * 菜单编码 <=32
     */
    @NotEmpty(message="菜单编码不能为空")
    @Size(max =32,message = "菜单编码长度超过32个字符")
    private String code;

    /**
     * 父菜单ID <=1000
     */
    @Min(value = 0,message = "父菜单不能小于0")
    @Max(value = 1000,message = "父菜单不能超过1000")
    private int parentId;


    /**
     *菜单URL <=100
     */
    @Size(max = 100,message = "菜单URL长度超过100个字符")
    private String url;

    /**
     *菜单排序 <=2 长度为2  最大值 99
     */
    @ContainCheck(value = "1,99",message = "资源排序超过指定范围",type="NUMBER")
    private byte seq = 1;

    /**
     *菜单图标 <=100
     */
    @Size(max = 100,message = "菜单图标长度超过100个字符")
    private String icon;

    /**
     *菜单类型 MENU,URL,BUTTON,MOBILE,API,MODULE,FUNCTION
     */
    @NotEmpty(message="菜单类型不能为空")
    @EnumCheck(value = ResEnums.TYPE.class,message = "菜单类型错误")
    private String type;

    /**
     * 资源操作方法 资源操作方法(GET,POST,PUT,DELETE), 多个用逗号分隔
     */
    @EnumCheck(value = ResEnums.METHODE.class,message = "资源操作方法错误")
    private String method;

    /**
     * 应用于哪个平台(IOS, ANDROID, PC, H5) 默认为
     */
    @EnumCheck(value = ResEnums.APPLY_TO.class,message = "平台类型错误")
    private String applyTo;

    /**
     * 是否加入白名单(0:否 1:是)
     */
    @ContainCheck(value = "0,1",message = "是否加入白名单状态码错误",type="NUMBER")
    private byte joinWhiteList;

    /**
     *菜单状态( 1：启用 0：禁用)
     */
    @ContainCheck(value = "0,1",message = "资源状态码错误",type="NUMBER")
    private byte state;


    /**
     *菜单所属应用编码 <=10
     */
    @NotEmpty(message="应用编码不能为空")
    @EnumCheck(value = AppEnum.class,message = "应用编码错误")
    private String appCode;

}
