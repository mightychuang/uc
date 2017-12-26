package com.hhly.user.api.dto.request;

import com.hhly.common.annotation.ContainCheck;
import com.hhly.common.annotation.DateCheck;
import com.hhly.common.annotation.DiscardBlank;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

/**
* @author pengchao
* @create 2017-09-06
* @desc 黑名单请求体
*/
@Getter
@Setter
@ToString
@DiscardBlank
public class BlackReq {
    /**
     * id
     */
    private int id;
    /**
     * 是否永久封禁0:定期 2:永久
     */
    @ContainCheck(value = "0,1",message = "是否永久不正确",type = "NUMBER")
    private int forever;

    /**
     * 黑名单类型:IP,ACCOUNT,IMEI
     */
    @NotEmpty(message="黑名单类型不能为空")
    @ContainCheck(value = "IP,ACCOUNT,IMEI",message = "黑名单类型不正确")
    private String blackType;

    /**
     * 黑名单内容
     */
    @NotEmpty(message="黑名单内容不能为空")
    @Size(max = 100,message = "黑名单内容长度超过100个字符")
    private String blackName;

    /**
     * 备注
     */
    @Size(max = 500,message = "黑名单描述长度超过500个字")
    private String description;

    /**
     * 过期时间（天）
     */
    @ContainCheck(value = "0,1,3,7,15,30,90,180",message = "过期时间(天)不在允许范围",type = "NUMBER")
    private int timeOut;
}