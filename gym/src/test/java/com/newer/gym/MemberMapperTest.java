package com.newer.gym;

import com.newer.gym.bean.*;
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
public class MemberMapperTest  {
    @Autowired
    MemberService memberService;
    @Autowired
    PersonnelService personnelService;
    @Test       //添加一条会员信息
    public void addMember() {
        List<CardType> list=memberService.getCardTypes();
        Staff staff=personnelService.getStaff(2);
        Staff staff2=personnelService.getStaff(7);
        Member member=new Member(1,"老舍",list.get(0),1,new Date(),new Date(),10000,"18897554266",1,new Date(),staff,null,
        staff2,1,"432522199511051244","湖南长沙","无");
        memberService.addMember(member);
    }

    @Test       //更改一条会员信息
    public void editorMember() {
        List<CardType> list=memberService.getCardTypes();
        Staff staff=personnelService.getStaff(2);
        Staff staff2=personnelService.getStaff(7);
        Member member=new Member(4,"老舍",list.get(0),1,new Date(),new Date(),10000,"18897554266",1,new Date(),staff2,null,
                staff,1,"432522199511051244","湖南长沙","无");
        memberService.editorMember(member);
    }

    @Test       //删除一条会员信息
    public void removeMember() {
        memberService.removeMember(5);
    }

    @Test
    public void getMembers() {

    }

    @Test   //获得一条会员信息
    public void getMember() {
        Member member=memberService.getMember(4);
        System.out.println(member);
    }

    @Test       //添加一条会员来访记录
    public void addMemberGet() {
        List<CardType> list=memberService.getCardTypes();
        Staff staff=personnelService.getStaff(2);
        Staff staff2=personnelService.getStaff(7);
        Member member=new Member(4,"老舍",list.get(0),1,new Date(),new Date(),10000,"18897554266",1,new Date(),staff2,null,
                staff,1,"432522199511051244","湖南长沙","无");
        MemberGet memberGet=new MemberGet(1,member,null,"无");
        for (int i=5;i<10;i++){
            memberService.addMemberGet(memberGet);
        }
    }

    @Test   //获得多条会员来访记录
    public void getMemberGets() {

    }

    @Test   //添加一条体验记录
    public void addExperience() {
        Experience experience=new Experience(1,"朱自清","14455556666","湖南长沙",1,new Date(),"无");
        for (int i=5;i<10;i++){
            memberService.addExperience(experience);
        }
    }

    @Test
    public void getExperiences() {
    }

    @Test   //添加一条卡类型信息
    public void addCardType() {
        CardType cardType=new CardType(4,"10次卡",1000,"无");
        memberService.addCardType(cardType);
    }
    @Test   //修改一条卡类型信息
    public void editorCardType() {
        CardType cardType=new CardType(1,"月卡",1000,"无");
        CardType cardType1=new CardType(2,"季卡",2500,"无");
        CardType cardType2=new CardType(3,"年卡",10000,"无");
        memberService.editorCardType(cardType);
        memberService.editorCardType(cardType1);
        memberService.editorCardType(cardType2);
    }

    @Test   //删除一条卡类型信息
    public void removeCardType() {
        memberService.removeCardType(4);
    }

    @Test   //获得多个会员卡类型信息
    public void getCardTypes() {
        List<CardType> list=memberService.getCardTypes();
        for (CardType c:list
             ) {
            System.out.println(c);
        }
    }

    @Test   //获得单个会员卡类型信息
    public void getCardType() {
        CardType cardType=memberService.getCardType(1);
        System.out.println(cardType);
    }

    @Test   //充值
    public void addBalance() {
        memberService.addBanlence(2,200);
    }
}
