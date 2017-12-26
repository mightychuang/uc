package com.hhly.user.api.dto.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
* @author wangxianchen
* @create 2017-09-27
* @desc 应用查询返回
*/
@Getter
@Setter
@ToString
public class ApplicationResp {

    private String appCode;

    private String appName;

    private Byte state;

}
