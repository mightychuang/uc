package com.hhly.user.api.dto.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * @author wangxianchen
 * @create 2017-09-21
 * @desc
 */
@Getter
@Setter
@NoArgsConstructor
public class UserRoleQueryResp {

    private String uuid;

    private String userId;

    private Date createTime;

    private String roleId;

    private String roleCode;

    private String roleName;

}
