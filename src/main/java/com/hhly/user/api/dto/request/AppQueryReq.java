package com.hhly.user.api.dto.request;

import com.hhly.user.api.enums.StateEnum;
import lombok.Getter;
import lombok.Setter;

/**
 * @author wangxianchen
 * @create 2017-09-27
 * @desc
 */
@Getter
@Setter
public class AppQueryReq {

    private String appCode;

    private String appName;

    private Byte state = StateEnum.ENABLE.getCode();
}
