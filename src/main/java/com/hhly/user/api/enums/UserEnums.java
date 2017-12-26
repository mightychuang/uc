package com.hhly.user.api.enums;


/**
* @author wangxianchen
* @create 2017-09-01
* @desc 帐户
*/
public class UserEnums {

    /**
     * 状态(0:锁定 1:启用)
     */
    public enum STATE{
        DISABLE((byte)0,"锁定"),
        ENABLE((byte)1,"启用");

        private Byte code;

        private String label;

        STATE(Byte code,String label){
            this.code = code;
            this.label = label;
        }
        public Byte getCode() {
            return code;
        }

        public void setCode(Byte code) {
            this.code = code;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public String getLabelByCode(Byte code){
            for(STATE obj:STATE.values()){
                if(obj.code.equals(code)){
                    return obj.label;
                }
            }
            return null;
        }
    }

    /**
     * 是否认证(0:未认证 1:已认证律师 2:已认证知识产权代理人)
     */
    public enum IS_AUTH{
        UNAUTHORIZED((byte)0,"未认证"),
        AUTHORIZED_LAWYER((byte)1,"已认证律师"),
        AUTHORIZED_AGENT((byte)2,"已认证知识产权代理人");

        private Byte code;

        private String label;

        IS_AUTH(Byte code,String label){
            this.code = code;
            this.label = label;
        }
        public Byte getCode() {
            return code;
        }

        public void setCode(Byte code) {
            this.code = code;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public String getLabelByCode(Byte code){
            for(IS_AUTH obj: IS_AUTH.values()){
                if(obj.code.equals(code)){
                    return obj.label;
                }
            }
            return null;
        }
    }


    /**
     * 注册方式 1:手机号 2:邮箱
     */
    public enum REG_TYPE{
        MOBILE_PHONE_NO((byte)1,"手机号"),
        EMAIL((byte)2,"邮箱");

        private Byte code;

        private String label;

        REG_TYPE(Byte code,String label){
            this.code = code;
            this.label = label;
        }
        public Byte getCode() {
            return code;
        }

        public void setCode(Byte code) {
            this.code = code;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public String getLabelByCode(Byte code){
            for(REG_TYPE obj: REG_TYPE.values()){
                if(obj.code.equals(code)){
                    return obj.label;
                }
            }
            return null;
        }
    }

    /**
     * 帐户类型(0:系统 1:律师 2:用户)
     */
    public enum ACC_TYPE{
        PLATFORM((byte)0,"系统", AppEnum.PLATFORM),
        LAWYER((byte)1,"律师", AppEnum.LAWYER),
        USER((byte)2,"用户", AppEnum.USER);

        private Byte code;

        private String label;

        private AppEnum app;

        ACC_TYPE(Byte code,String label,AppEnum app){
            this.code = code;
            this.label = label;
            this.app = app;
        }

        public Byte getCode() {
            return code;
        }

        public String getLabel() {
            return label;
        }

        public AppEnum getApp() {
            return app;
        }

        public static String getLabelByCode(Byte code){
            for(ACC_TYPE obj: ACC_TYPE.values()){
                if(obj.code.equals(code)){
                    return obj.label;
                }
            }
            return null;
        }

        public static String getAppCodeByCode(Byte code){
            for(ACC_TYPE obj: ACC_TYPE.values()){
                if(obj.code.equals(code)){
                    return obj.app.name();
                }
            }
            return null;
        }

        public static Byte getCodeByAppCode(String appCode){
            for(ACC_TYPE obj: ACC_TYPE.values()){
                if(obj.app.name().equals(appCode)){
                    return obj.code;
                }
            }
            return null;
        }
    }
}
