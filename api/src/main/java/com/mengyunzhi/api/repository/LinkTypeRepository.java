package com.mengyunzhi.api.repository;

import com.mengyunzhi.api.entity.LinkType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by XINGYANNIAN on 2018/8/22.
 */
public interface LinkTypeRepository extends JpaRepository<LinkType,Long>{
    //查询公共链接类型
    public List<LinkType> findLinkTypeByIsCommonIsTrue();
}
