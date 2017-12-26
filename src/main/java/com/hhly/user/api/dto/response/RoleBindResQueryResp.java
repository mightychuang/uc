package com.hhly.user.api.dto.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * Description:
 *
 * @author: zsq-1186
 * Date: 2017-09-22-15:46
 */

@Getter
@Setter
@ToString
public class RoleBindResQueryResp {

    private String  resName;

    private String resCode;

    private Date bindTime;
}
