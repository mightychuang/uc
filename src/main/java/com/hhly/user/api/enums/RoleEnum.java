package com.hhly.user.api.enums;

/**
* @author wangxianchen
* @create 2017-09-01
* @desc 默认角色
*/
public enum RoleEnum {

    //律师用户角色
    LAWYER_USER,

    //产权代理人
    LAWYER_AGENT,

    //律师用户角色(未认证)
    LAWYER_USER_UNAUTHORIZED,

    //普通用户角色
    GENERAL_USER,

    //学生用户角色
    STUDENT_USER;

    //判断是否包含
    public static boolean contains(String code){
        for(RoleEnum roleEnum : RoleEnum.values()){
            if(roleEnum.name().equals(code)){
                return true;
            }
        }
        return false;
    }
}
