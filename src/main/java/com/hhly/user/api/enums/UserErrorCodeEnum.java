package com.hhly.user.api.enums;

import com.hhly.common.enums.IEnum;

/**
 * @author wangxianchen
 * @create 2017-09-26
 * @desc
 */
public enum UserErrorCodeEnum implements IEnum {



    /**********用户中心 帐户权限相关 **********/
    NO_LOGIN(1201,"未登录或会话已过期"),
    SESSION_EXPIRED(1202,"会话已过期请重新登录"),
    NO_AUTH(1203,"权限不足"),
    NO_USER(1204,"无此用户"),
    USER_EXIST(1205,"帐户已存在"),
    USERNAME_OR_PWD_ERR(1206,"帐户名或密码不对"),
    PWD_ERR(1207,"密码不对"),
    CHECK_CODE_ERR(1208,"验证码不对"),
    CHECK_CODE_NOT_EXIST(1209,"验证码已过期请重新获取"),
    NOT_EXCEEDING_TIME_LIMIT(1210,"获取验证码超过频率限制"),
    CHECK_CODE_SEND_ERROR(1211,"验证码发送失败"),
    NON_REPEATABLE_LOGIN(1212,"不可重复登录"),
    NON_REPEATABLE_REGIST(1213,"不可重复注册"),
    REQUEST_HEADER_PARAMETER_MISSING(1214,"请求头参数缺失"),
    ILLEGAL_OPERATION(1215,"非法的操作"),
    UNSUPPORT_REG_TYPE(1216,"不支持的注册方式"),
    GET_PIC_CHECKCODE_FAIL(1217,"获取图片验证码失败"),
    CHECK_AUTH_ERR(1218,"验证权限时出现异常"),


    /***************用户中心 业务操作相关****************/
    COMPANY_ROLE_AUTHENTICATED(1219,"企业角色已认证"),
    LAWYER_ROLE_AUTHENTICATED(1220,"律师角色已认证"),
    STUDENT_ROLE_AUTHENTICATED(1221,"学生角色已认证"),
    COMPANY_ROLE_NOT_AUTHENTICATION(1222,"企业角色未认证"),
    LAWYER_ROLE_NOT_AUTHENTICATION(1223,"律师角色未认证"),
    STUDENT_ROLE_NOT_AUTHENTICATION(1224,"学生角色未认证"),
    RESOURCE_CODE_HAS_EXIST_ERROR(1225,"菜单编码已经存在"),
    PARENT_ID_NOT_EXIST_ERROR(1226,"父菜单ID无效"),
    ROLE_NOT_EXIST_ERROR(1227,"角色不存在"),
    RESOURCE_NOT_EXIST_ERROR(1228,"资源不存在"),
    APP_NOT_EXIST(1229,"应用不存在或不可用");


    private int code;
    private String message;

    UserErrorCodeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public int code() {
        return this.code;
    }

    @Override
    public String message() {
        return this.message;
    }
}
