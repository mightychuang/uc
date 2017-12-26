package com.hhly.user.api.enums;

/**
 * @author wangxianchen
 * @create 2017-09-01
 * @desc 通用状态枚举
 */
public enum StateEnum {

    ENABLE((byte)1,"启用"),

    DISABLE((byte)0,"禁用");

    private Byte code;

    private String label;

    StateEnum(Byte code,String label){
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

    public static String getLabelByCode(Byte code){
        for(StateEnum obj: StateEnum.values()){
            if(obj.code.equals(code)){
                return obj.label;
            }
        }
        return null;
    }
}
