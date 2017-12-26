package com.hhly.user.api.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * Description: 菜单类 存放菜单相关信息
 *
 * @author: zsq-1186
 * Date: 2017-08-09-17:16
 */
@Getter
@Setter
@ToString
@JsonIgnoreProperties(value = {"handler"})
public class MenuTree {
    /**
     * 菜单编码
     */
    private String code;

    /**
     * 菜单 id
     */
    private int selfId;

    /**
     *菜单父id
     */
    private int parentId;

    /**
     *菜单名称,为适应前端,故将name改成text
     */
    private String text;

    /**
     *菜单url
     */
    private String url;

    /**菜单图标
     *
     */
    private String icon;


    /**
     *菜单状态
     */
    private int state;

    /**
     *菜单排序
     */
    private int seq;

    /**
     *子菜单集合
     */
    private List<MenuTree> children;


   //以下属性不返回给前台,只是应用于mapper查询
    @JsonIgnore
    private String userId;

    private String appCode;

}
