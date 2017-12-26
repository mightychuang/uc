package com.hhly.user.api.dto.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Pattern;

/**
 * @author wangxianchen
 * @create 2017-11-09
 * @desc 根据参数按天统计注册的用户数
 */
@Getter
@Setter
@ToString
public class CountRegUserReq {

    private Byte accType;

    private String regDeviceType;

    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}",message = "注册开始日期格式不对")
    private String createTimeBegin;

    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}",message = "注册结束日期格式不对")
    private String createTimeEnd;

}
