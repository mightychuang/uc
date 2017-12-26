package com.hhly.user.api.dto.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
* @author pengchao
* @create 2017-09-06
* @desc 黑名单明细
*/
@Getter
@Setter
@ToString
public class BlackResp {
    /**
     * 是否永久封禁0:定期 2:永久
     */
    private int forever;

    /**
     * 黑名单类型:IP,ACCOUNT,IMEI
     */
    private String blackType;

    /**
     * 黑名单内容
     */
    private String blackName;

    /**
     * 备注
     */
    private String description;

    /**
     * 过期时间
     */
    private Date expirartionTime;
}