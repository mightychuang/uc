package com.hhly.user.api.constant;


/**
* @author wangxianchen
* @create 2017-08-04
* @desc 用户中心公共常量池
*/
public class UserConstant {

    //用户中心微服务名称
    public static final String USER_CENTER_SERVICE_NAME = "user";

    //保存在redis里的用户session信息前缀
    public static final String SESSION_USER_PREFIX = USER_CENTER_SERVICE_NAME + ":session_user:";

    //登录session,存储在redis里的失效时间,单位:秒. 在这个时间段内没有任何操作的话,session将会被删除,需要重新登录,默认为30分钟
    public static final long LOGIN_SESSION_EXPIR_SECONDS  = 60 * 30;

    //图片验证码redis key前缀
    public static final String PIC_CHECK_CODE_PREFIX = USER_CENTER_SERVICE_NAME + ":pic_check_code:";

    //图片验证码保存在redis里的验证码有效时间 60秒
    public static final int PIC_CHECK_CODE_EXPIR_SECONDS = 60;

    //两次验证码获取的间隔秒数,默认为60S
    public static final long SMS_CHECK_CODE_INTERVAL_SECONDS = 60L;

    //短信验证码redis key前缀
    public static final String SMS_CHECK_CODE_PREFIX = USER_CENTER_SERVICE_NAME + ":sms_check_code";

    //验证码保存在redis里的有效时间,默认2分钟
    public static final long SMS_CHECK_CODE_EXPIR_SECONDS = 60 * 2;

    //终端设备(浏览器信息)标识
    public static final String REQUEST_HEADER_OF_USER_AGENT = "User-Agent";

    //主页左侧菜单树ID
    public static final int NAVIGATION_MENU_TREE_ID = 1;

    //顶级菜单树ID
    public static final int TOP_MENU_TREE_ID = 0;

    //主页左侧菜单树最低层级
    public static final byte NAVIGATION_MENU_DEPTH = 3;



}
