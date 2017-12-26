package com.hhly.user.api.dto.request;

import com.hhly.common.annotation.ContainCheck;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author wangxianchen
 * @create 2017-09-26
 * @desc 移动资源树,改变资源之间的挂靠关系
 */
@Getter
@Setter
@ToString
public class ResourceMoveReq {

    @ContainCheck(value = "0,1000",message = "资源ID超过范围",type="NUMBER")
    private int selfId;

    @ContainCheck(value = "0,1000",message = "资源ID超过范围",type="NUMBER")
    private int parentId;
}
