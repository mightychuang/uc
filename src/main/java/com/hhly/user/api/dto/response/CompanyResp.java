package com.hhly.user.api.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
* @author wangxianchen
* @create 2017-08-31
* @desc 律师角色明细
*/
@Getter
@Setter
@ToString
public class CompanyResp {

    @JsonIgnore
    private Long id;

    private String name;

    private String legal;

    private String idCard;

    private String busiCode;

    private String busiCodePic;

    private String certificate;

    private String orgCode;

    private String userId;

    private Byte isAuth;




}