package com.newer.gym;


import com.newer.gym.bean.*;
import com.newer.gym.repository.SystemMapper;
import com.newer.gym.service.serviceImpl.SystemServiceImpl;
import com.newer.gym.service.MemberService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Date;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GymApplicationTests {
    @Autowired
    SystemServiceImpl systemServiceImpl;
    @Autowired
    SystemMapper systemMapper;

    @Test
    public void contextLoads() {
        Map<String, Object> map=new HashMap<>();
        map.put("begin", "2019-04-01");
        map.put("finish", "2019-05-02");
        map.put("adminName", "admin");
       List<Logger> s= systemMapper.selectLoggers(map);
       int s2=systemMapper.selectLoggersCount(map);
        System.out.println(s2);
    }

    @Test
    public void addAdmin() {
    systemMapper.addAdmin(new Admin(2,"123456","gg","123456789",1,"haha"));
    }
    @Test
    public void removeAdmin() {

      // systemMapper.addNotice(1,"haha",1,"好的");
      // System.out.println(s);
    }
}
