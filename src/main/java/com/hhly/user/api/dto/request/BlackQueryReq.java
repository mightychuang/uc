package com.hhly.user.api.dto.request;

import com.hhly.common.Const;
import com.hhly.common.annotation.DateCheck;
import com.hhly.common.annotation.DiscardBlank;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
* @author pengchao
* @create 2017-09-06
* @desc 黑名单查询体
*/
@Getter
@Setter
@ToString
@DiscardBlank
public class BlackQueryReq {

    /**
     * 是否永久封禁0:定期 2:永久
     */
    //@ContainCheck(value = "0,1",message = "是否永久不正确",type = "NUMBER")
    private int forever;

    /**
     * 黑名单类型:IP,ACCOUNT,IMEI
     */
    //@ContainCheck(value = "IP,ACCOUNT,IMEI",message = "黑名单类型不正确")
    private String blackType;

    /**
     * 黑名单内容
     */
    //@Size(max = 100,message = "黑名单内容长度超过100个字符")
    private String blackName;

    /**
     * 备注
     */
    private String description;

    /**
     * 过期时间(开始)
     */
    @DateCheck(value="yyyy-MM-dd HH:mm:ss", message="过期时间格式错误")
    private String expireStartTime;

    /**
     * 过期时间(截止)
     */
    @DateCheck(value="yyyy-MM-dd HH:mm:ss", message="过期时间格式错误")
    private String expireEndTime;

    private int page = Const.DEFAULT_PAGE_NO;

    private int limit = Const.DEFAULT_LIMIT;
}
