package com.hhly.user.api.dto.request;

import com.hhly.common.annotation.ContainCheck;
import com.hhly.common.annotation.DiscardBlank;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Description:
 *
 * @author: zsq-1186
 * Date: 2017-08-28-17:09
 */

@Getter
@Setter
@ToString
@DiscardBlank
public class RoleQueryReq {

    private String roleName;

    //状态(0：禁用 1：启用 )
    @ContainCheck(value = "0,1",message = "状态码错误",type="NUMBER")
    private Byte state;

    private String appCode;

    private Byte isDelete = 0;

}
