package com.hhly.user.api.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
* @author wangxianchen
* @create 2017-09-01
* @desc 律师信息结果返回体
*/
@Getter
@Setter
@ToString
public class LawyerResp {

    @JsonIgnore
    private Long id;

    private String userId;

    private String spreaPhone;

    private String idCard;

    private String idCardPic;

    private String occupationCard;

    private String occupationCardPic;

    private String province;

    private String city;

    private String district;

    private String street;

    private String address;

    private String company;

    private String instroduce;

    private Byte isAuth;

    private Byte isWork;

    private Byte workTime;

    private String logo;

}