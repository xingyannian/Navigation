package com.mengyunzhi.api.repository;

import com.mengyunzhi.api.entity.LinkType;
import com.mengyunzhi.api.entity.User;
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
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;
    //测试user save 功能
    @Test
    public void isSaveSucess(){
        User user = new User();
        user.setUsername("zhangsan");
        user.setPassword("123456");
        userRepository.save(user);
    }
}