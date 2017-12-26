package com.hhly.user.api.dto.request;

import com.hhly.common.annotation.DiscardBlank;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.validation.constraints.Pattern;

/**
 * Description:
 *
 * @author: zsq-1186
 * Date: 2017-08-10-9:47
 */

@Getter
@Setter
@ToString
@DiscardBlank
public class MenuTreeReq {

    //@Pattern(regexp = "^\\d{0,}$",message="菜单ID格式错误")
    //private String menuId;
    private int menuId;

    private String appCode;

    private String userId;

}
