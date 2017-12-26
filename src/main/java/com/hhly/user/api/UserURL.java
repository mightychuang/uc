package com.hhly.user.api;


/**
 * @author wangxianchen
 * @create 2017-08-28
 * @desc 用户中心API
 */
public class UserURL {

    public static String buildURL(String url) {
        return SERVICE_HOSTNAME + url;
    }

    /** 用户中心 service name**/
    public static final String SERVICE_NAME = "USER";

    public static final String SERVICE_HOSTNAME = "http://USER";
    /**用户登录**/
    public static final String USER_LOGIN = "/usercenter/user/login";
    /**用户登出**/
    public static final String USER_LOGOUT = "/usercenter/user/logout";
    /**用户注册**/
    public static final String USER_REGISTER = "/usercenter/user/register";
    /**用户信息更新**/
    public static final String USER_UPDATE = "/usercenter/user/update";
    /**更新用户认证状态**/
    public static final String USER_UPDATE_AUTH = "/usercenter/user/updateAuth";
    /**修改密码**/
    public static final String USER_CHANGE_PWD = "/usercenter/user/changePwd";
    /**判断用户是否存在**/
    public static final String USER_CHECK_EXIST = "/usercenter/user/checkExist";
    /**重置密码**/
    public static final String USER_RESET_PWD = "/usercenter/user/resetPwd";
    /**用户信息明细**/
    public static final String USER_DETAIL = "/usercenter/user/detail";
    /**用户列表查询**/
    public static final String USER_LIST = "/usercenter/user/list";
    /**改变用户状态**/
    public static final String USER_CHANGE_STATE = "/usercenter/user/changeState";
    /**发送验证码**/
    public static final String USER_SEND_CHECK_CODE = "/usercenter/user/sendCheckCode";
    /**获取图片验证码**/
    public static final String USER_GET_PIC_CHECK_CODE = "/usercenter/user/getPicCheckCode";
    /**角色添加**/
    public static final String ROLE_ADD = "/usercenter/role/add";
    /**角色查询详细信息**/
    public static final String ROLE_DETAIL = "/usercenter/role/detail";
    /**角色更新**/
    public static final String ROLE_UPDATE = "/usercenter/role/update";
    /**角色绑定资源**/
    public static final String ROLE_BIND_RES = "/usercenter/role/bindRes";
    /**角色上绑定资源的列表**/
    public static final String ROLE_RES_LIST = "/usercenter/role/roleResList";
    /**角色绑定用户**/
    public static final String ROLE_BIND_USER = "/usercenter/role/bindUser";
    /**角色列表**/
    public static final String ROLE_LIST = "/usercenter/role/list";
    /**用户角色列表**/
    public static final String USER_ROLE_LIST = "/usercenter/role/userRoleList";
    /**角色删除**/
    public static final String ROLE_DELETE = "/usercenter/role/delete";
    /**应用添加**/
    public static final String APP_ADD = "/usercenter/app/add";
    /**应用查询 详细信息**/
    public static final String APP_DETAIL = "/usercenter/app/detail";
    /**应用查询**/
    public static final String APP_QUERY = "/usercenter/app/query";
    /**应用更新**/
    public static final String APP_UPDATE = "/usercenter/app/update";
    /**资源添加**/
    public static final String RESOURCE_ADD = "/usercenter/resource/add";
    /**资源详细信息**/
    public static final String RESOURCE_DETAIL = "/usercenter/resource/detail";
    /**资源更新**/
    public static final String RESOURCE_UPDATE = "/usercenter/resource/update";
    /**资源删除**/
    public static final String RESOURCE_DELETE = "/usercenter/resource/delete";
    /**资源树**/
    public static final String RESOURCE_TREE = "/usercenter/resource/tree";
    /**改变资源挂靠**/
    public static final String RESOURCE_MOVE = "/usercenter/resource/move";
    /**权限验证**/
    public static final String AUTH_CHECK = "/usercenter/authCheck";
    /**导航菜单**/
    public static final String RESOURCE_NAVIGATION_TREE = "/usercenter/resource/navigationTree";
    /**统一每天注册用户数**/
    public static final String COUNT_EVERYDAY_REG_USERS = "/usercenter/countEverydayRegUsers";
    /**按用户类型统计用户数**/
    public static final String COUNT_REG_USERS = "/usercenter/countRegUsers";

    /**新增黑名单**/
    public static final String BLACK_ADD = "/usercenter/black/add";
    /**黑名单更新**/
    public static final String BLACK_UPDATE = "/usercenter/black/update";
    /**删除黑名单**/
    public static final String BLACK_DELETE = "/usercenter/black/delete";
    /**查询黑名单**/
    public static final String BLACK_GET = "/usercenter/black/get";
    /**查询黑名单分页列表**/
    public static final String BLACK_PAGE = "/usercenter/black/page";
    /**刷新黑名单**/
    public static final String BLACK_REFRESH = "/usercenter/black/refresh";
    /**刷新白名单**/
    public static final String WHITE_REFRESH = "/usercenter/white/refresh";
}
