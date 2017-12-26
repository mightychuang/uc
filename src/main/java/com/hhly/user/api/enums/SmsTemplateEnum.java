package com.hhly.user.api.enums;

/**
* @author wangxianchen
* @create 2017-09-01
* @desc 手机短信模板
*/
public enum SmsTemplateEnum {

    /**
     * 登录时
     * 亲爱的律师平台用户，您正在进行登录操作，验证码是：@1@。请于@2@分钟内输入，请不要把验证码泄露给其他人。如非本人操作请忽略本短信
     */
    LOGIN("ZD30059-0010"),

    /**
     * 注册时
     * 亲爱的律师平台用户，您正在进行手机注册操作，验证码是：@1@。请于@2@分钟内输入，请不要把验证码泄露给其他人。如非本人操作请忽略本短信
     */
    REGIST("ZD30059-0009"),

    /**
     * 忘记密码时
     * 亲爱的律师平台用户，您正在进行找回密码操作，验证码是：@1@。请于@2@分钟内输入，请不要把验证码泄露给其他人。如非本人操作请忽略本短信
     */
    FORGET_PWD("ZD30059-0012"),

    /**
     * 变更密码时
     * 亲爱的律师平台用户，您正在进行修改密码操作，验证码是：@1@。请于@2@分钟内输入，请不要把验证码泄露给其他人。如非本人操作请忽略本短信
     */
    CHANGE_PWD("ZD30059-0011");

    private String id;

    SmsTemplateEnum(String id){
        this.id = id;
    }

    public String getId() {
        return id;
    }

}
