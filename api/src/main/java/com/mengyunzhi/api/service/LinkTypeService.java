package com.mengyunzhi.api.service;

import com.mengyunzhi.api.entity.LinkType;


import java.util.List;

/**
 * Created by XINGYANNIAN on 2018/8/23.
 */

public interface LinkTypeService {
    //列出所有的公共的链接类型
    public List<LinkType> findCommentLinkType();
    //增加一个链接类型,返回增加后的Id
    public Long add(LinkType linkType);
    //删除一个链接类型

    //查找出需要的多个类型列表
    //批量删除

}
