package com.mengyunzhi.api.service;

import com.mengyunzhi.api.entity.LinkType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.logging.Logger;

import static org.junit.Assert.*;

/**
 * Created by XINGYANNIAN on 2018/8/23.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class LinkTypeServiceTest {
    @Autowired
    private LinkTypeService linkTypeService;
    @Test
    public void findCommentLinkType() {
        List<LinkType> linkTypeList = linkTypeService.findCommentLinkType();
        System.out.println(linkTypeList.toString());
    }

    @Test
    public void add() {
    }
}