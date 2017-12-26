package com.hhly.user.api.dto.request;

import com.hhly.common.annotation.DiscardBlank;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


/**
 * Description:
 *
 * @author: zsq-1186
 * Date: 2017-09-01-15:06
 */

@Getter
@Setter
@DiscardBlank
public class DelByIdReq {

    @Min(value = 0,message = "ID最小值为0")
    @NotNull(message = "ID不能为空")
    private Integer id;
}
