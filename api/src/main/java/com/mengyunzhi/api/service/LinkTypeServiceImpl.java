package com.mengyunzhi.api.service;

import com.mengyunzhi.api.entity.LinkType;
import com.mengyunzhi.api.repository.LinkRepository;
import com.mengyunzhi.api.repository.LinkTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by XINGYANNIAN on 2018/8/23.
 */
@Service
public class LinkTypeServiceImpl implements LinkTypeService {
    @Autowired
    private LinkTypeRepository linkTypeRepository;
    @Override
    public List<LinkType> findCommentLinkType() {
        return linkTypeRepository.findLinkTypeByIsCommonIsTrue();
    }

    @Override
    public Long add(LinkType linkType) {
        return null;
    }
}
