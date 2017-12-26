package com.hhly.user.api.dto.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author wangxianchen
 * @create 2017-11-09
 * @desc 根据参数按天统计注册的用户数返回结果集
 */
@Getter
@Setter
@ToString
public class CountRegUserResp {

    private String everyday;

    private Integer total;
}
