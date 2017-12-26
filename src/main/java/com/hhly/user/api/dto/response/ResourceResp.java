package com.hhly.user.api.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
* @author wangxianchen
* @create 2017-08-25
* @desc 资源数据返回
*/
@Getter
@Setter
@ToString
@JsonIgnoreProperties(value = {"handler"})
public class ResourceResp {

    private String name;

    private String code;

    private String url;

    private String type;

    private String method;

    private String applyTo;

    public ResourceResp() {
    }

    public ResourceResp(String name, String code, String url, String type,String method,String applyTo) {
        this.name = name;
        this.code = code;
        this.url = url;
        this.type = type;
        this.method = method;
        this.applyTo = applyTo;
    }
}
