package com.newer.gym;

import com.newer.gym.bean.CardType;
import com.newer.gym.bean.Member;
import com.newer.gym.service.MemberService;
import com.newer.gym.service.PersonnelService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GymApplicationTests {

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
    }





}
