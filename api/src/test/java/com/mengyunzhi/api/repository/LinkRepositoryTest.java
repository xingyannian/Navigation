package com.mengyunzhi.api.repository;

import com.mengyunzhi.api.entity.Link;
import com.mengyunzhi.api.entity.LinkType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by XINGYANNIAN on 2018/8/22.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class LinkRepositoryTest {
    @Autowired
    private LinkRepository linkRepository;
    //测试保存
    @Test
    public void saveTest(){
        Link link = new Link();
        link.setLinkName("百度");
        link.setLinkUrl("https://baidu.com");
        List<LinkType> linkTypeList = new ArrayList<>();
        LinkType linkType1 = new LinkType();
        linkType1.setId(1L);
        linkType1.setCommom(true);
        linkType1.setName("常用网址");
        LinkType linkType2 = new LinkType();
        linkType2.setName("继续教育");
        linkType2.setId(2L);
        linkType2.setCommom(true);
        linkTypeList.add(linkType1);
        linkTypeList.add(linkType2);
        link.setLinkTypes(linkTypeList);
        linkRepository.save(link);
    }
}