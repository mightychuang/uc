package com.hhly.user.api.dto.request;

import com.hhly.common.annotation.DiscardBlank;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

/**
 * Description:
 *  根据code删除的请求
 * @author: zsq-1186
 * Date: 2017-09-01-14:29
 */

@Getter
@Setter
@DiscardBlank
public class DelByCodeReq {

    /**
     *编码,
     */
    @NotEmpty(message="编码不能为空")
    @Size(max = 32,message = "编码长度超过32个字符")
    private String code;
}
