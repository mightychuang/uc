package com.hhly.user.api.dto.response;


import lombok.Getter;
import lombok.Setter;

/**
* @author wangxianchen
* @create 2017-09-01
* @desc 角色数据返回前端
*/
@Setter
@Getter
public class RoleResp {

    private String name;

    private String code;

    public RoleResp(){

    }

    public RoleResp(String name, String code) {
        this.name = name;
        this.code = code;
    }


}
