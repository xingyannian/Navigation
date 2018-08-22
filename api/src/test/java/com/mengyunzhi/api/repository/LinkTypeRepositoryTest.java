package com.mengyunzhi.api.repository;

import com.mengyunzhi.api.entity.LinkType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by XINGYANNIAN on 2018/8/22.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class LinkTypeRepositoryTest {
    @Autowired
    private LinkTypeRepository linkTypeRepository;
    //测试增加链接类型
    @Test
    public void isSaveSuccess(){
        LinkType linkType = new LinkType();
        linkType.setName("常用网址");
        linkType.setCommom(true);
        linkTypeRepository.save(linkType);
    }

}