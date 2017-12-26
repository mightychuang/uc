package com.hhly.user.api.dto.request;

import com.hhly.common.annotation.DiscardBlank;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Description: 角色绑定资源 请求
 *
 * @author: zsq-1186
 * Date: 2017-08-08-9:14
 */
@Getter
@Setter
@ToString
@DiscardBlank
public class RoleResourceReq {

    /**
     *角色编码
     */
    @NotEmpty(message="角色编码不能为空")
    private String roleCode;

    /**
     *资源编码
     */
    @Size(min = 1,message="资源编码不能为空")
    private List<String> resCodeArray;


    /**
     *操作类型(1:绑定 2:取消绑定)
     */
    @Min(value = 1,message = "操作类型错误")
    @Max(value = 2,message = "操作类型错误")
    private int opType;



}

