package com.newer.gym;

<<<<<<< HEAD
import com.newer.gym.bean.CardType;
import com.newer.gym.bean.Member;
import com.newer.gym.service.MemberService;
import com.newer.gym.service.PersonnelService;
=======

import com.newer.gym.bean.*;
import com.newer.gym.repository.SystemMapper;
import com.newer.gym.service.serviceImpl.SystemServiceImpl;
import com.newer.gym.service.MemberService;

>>>>>>> 2bc2437b0cdd092b2f1e9f9b3d23b6a24e2789a7
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Date;
<<<<<<< HEAD
import java.util.List;
=======
import java.util.Map;
>>>>>>> 2bc2437b0cdd092b2f1e9f9b3d23b6a24e2789a7

@RunWith(SpringRunner.class)
@SpringBootTest
public class GymApplicationTests {
    @Autowired
    SystemServiceImpl systemServiceImpl;
    @Autowired
    SystemMapper systemMapper;

<<<<<<< HEAD
    @Autowired
    MemberService memberService;
    @Autowired
    PersonnelService personnelService;


    @Test   // 获得多个会员卡类型的数据信息    成功
    public void testGetCardTypes() {
        List<CardType> list=memberService.getCardTypes();
        for (CardType c:list) {
            System.out.println(c);
        }
=======
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
>>>>>>> 2bc2437b0cdd092b2f1e9f9b3d23b6a24e2789a7
    }
    @Test
    public void removeAdmin() {

<<<<<<< HEAD




=======
      // systemMapper.addNotice(1,"haha",1,"好的");
      // System.out.println(s);
    }
>>>>>>> 2bc2437b0cdd092b2f1e9f9b3d23b6a24e2789a7
}
