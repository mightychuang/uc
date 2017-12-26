package com.hhly.user.api.dto;

import com.alibaba.fastjson.JSON;
import com.hhly.common.dto.ErrorCodeEnum;
import com.hhly.common.exception.ValidationException;
import com.hhly.common.util.DateUtil;

import java.util.Date;

/**
* @author wangxianchen
* @create 2017-08-04
* @desc 保存在redis里的验证码对象
*/
public class CheckCode {

    /**
     * 验证码生成日期,格式:yyyy-MM-dd HH:mm:ss
     */
    private String generaTime;

    /**
     * 验证码输入错误字数
     */
    private int wrongCount;

    /**
     * 验证码
     */
    private String code;

    public Date convertGeneraTime(){
        try {
            return DateUtil.toDate(generaTime,DateUtil.PATTERN_yyyy_MM_dd_HH_mm_ss);
        } catch (Exception e) {
            throw new ValidationException(ErrorCodeEnum.PARSE_STR_TO_DATE_ERROR);
        }
    }

    public void setGeneraTime(Date date){
        try {
            this.generaTime = DateUtil.formatDate(date,DateUtil.PATTERN_yyyy_MM_dd_HH_mm_ss);
        } catch (Exception e) {
            throw new ValidationException(ErrorCodeEnum.PARSE_DATE_TO_STR_ERROR);
        }
    }
    public String getGeneraTime() {
        return generaTime;
    }

    public void setGeneraTime(String generaTime) {
        this.generaTime = generaTime;
    }

    public int getWrongCount() {
        return wrongCount;
    }

    public void setWrongCount(int wrongCount) {
        this.wrongCount = wrongCount;
    }

    public String getCode() {
        return code;
    }

    public CheckCode setCode(String code) {
        this.code = code;
        return this;
    }

    public String toJSONString(){
        return JSON.toJSONString(this);
    }

    @Override
    public String toString() {
        return toJSONString();
    }
}
