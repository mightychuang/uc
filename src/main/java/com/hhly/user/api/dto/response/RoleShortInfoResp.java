package com.hhly.user.api.dto.response;

import lombok.Getter;
import lombok.Setter;

/**
 * Description: 角色简单信息返回
 *
 * @author: zsq-1186
 * Date: 2017-08-29-9:37
 */

@Getter
@Setter
public class RoleShortInfoResp {

    private String roleCode;

    private String roleName;

    private String appCode;

    private String appName;

    private Byte state;

    private Byte isDelete;

    private  String description;

}
