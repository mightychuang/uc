package com.hhly.user.api.enums;

/**
* @author wangxianchen
* @create 2017-09-01
* @desc resource
*/
public class ResEnums {

    public enum TYPE{
        MENU, URL, BUTTON, MOBILE, API, MODULE, FUNCTION
    }
    public enum METHODE{
        GET, POST, PUT, DELETE
    }
    public enum  APPLY_TO{
        IOS, ANDROID, PC, H5
    }

    //是否加入白名单(0:否 1:是)
    public enum JOIN_WHITE_LIST {

        NO((byte)0,"否"),

        YES((byte)1,"是");

        private Byte code;

        private String label;

        JOIN_WHITE_LIST(Byte code,String label){
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

    }
}
