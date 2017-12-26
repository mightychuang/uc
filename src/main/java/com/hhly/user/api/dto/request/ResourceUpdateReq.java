package com.hhly.user.api.dto.request;

import com.hhly.common.annotation.ContainCheck;
import com.hhly.common.annotation.DiscardBlank;
import com.hhly.common.annotation.EnumCheck;
import com.hhly.user.api.enums.ResEnums;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

/**
 * Description: 菜单更新 请求数据
 *
 * @author: zsq-1186
 * Date: 2017-08-08-20:04
 */
@Getter
@Setter
@ToString
@DiscardBlank
public class ResourceUpdateReq {

    @NotEmpty(message="菜单编码不能为空")
    private String code;

    /**
     * 菜单名称 <=20
     */

    @Size(max = 20,message = "菜单名称长度超过20个字符")
    private String name;


    /**
     *菜单URL <=100
     */
    @Size(max = 100,message = "菜单URL长度超过100个字符")
    private String url;


    /**
     *菜单排序 <=2 长度为2  最大值 99
     */
    @ContainCheck(value = "1,99",message = "菜单排序错误",type="NUMBER")
    private Byte seq;


    /**
     *菜单图标 <=100
     */
    @Size(max = 100,message = "菜单图标长度超过100个字符")
    private String icon;

    /**
     *菜单类型 MENU,URL,BUTTON,MOBILE,API,MODULE,FUNCTION
     */
    @EnumCheck(value = ResEnums.TYPE.class,message = "菜单类型错误")
    private String type;


    /**
     * 资源操作方法 资源操作方法(GET,POST,PUT,DELETE), 多个用逗号分隔
     */
    @EnumCheck(value = ResEnums.METHODE.class,message = "资源操作方法错误")
    private String method;

    /**
     * 应用于哪个平台(IOS, ANDROID, PC, H5, ALL) 默认为
     */
    @EnumCheck(value = ResEnums.APPLY_TO.class,message = "平台类型错误")
    private String applyTo;

    /**
     * 是否加入白名单(0:否 1:是)
     */
    private Byte joinWhiteList;


    /**
     *菜单状态( 1：启用 0：禁用)
     */
    @ContainCheck(value = "0,1",message = "菜单状态错误",type="NUMBER")
    private Byte state;
}
