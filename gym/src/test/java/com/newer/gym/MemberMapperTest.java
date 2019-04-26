package com.newer.gym;

import com.newer.gym.bean.*;
import com.newer.gym.repository.MemberMapper;
import com.newer.gym.service.MemberService;
import com.newer.gym.service.PersonnelService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberMapperTest  {
    @Autowired
    MemberService memberService;
    @Autowired
    PersonnelService personnelService;
    @Autowired
    MemberMapper memberMapper;
    @Test       //添加一条会员信息
    public void addMember() {
//        List<CardType> list=memberService.getCardTypes();
//        Staff staff=personnelService.getStaff(2);
//        Staff staff2=personnelService.getStaff(7);
//        Member member=new Member(1,"林天凡",list.get(1),0,new Date(),new Date(),10000,"18897554266",1,new Date(),staff,null,
//        staff2,1,"432522199511051244","湖南长沙","无");
//        String a[]={"沈从文","王安忆","张爱玲","余秋雨","贾平凹","三毛","丰子恺","高行建"};
//        for (String s:a
//             ) {
//            member.setName(s);
//        }

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
//        Member member=new Member(4,"老舍",null,1,new Date(),new Date(),10000,"18897554266",1,new Date(),null,null,
//                null,1,"432522199511051244","湖南长沙","无");
//        PageBean<Member> pg=memberService.getMembers(member,2,2);
//        for (Member m:pg.getItems()){
//            System.out.println(m);
//        }
//        System.out.println(pg);
        Member member=new Member();
//        member.setId(2);
        CardType cardType=new CardType();
        cardType.setId(2);
        member.setCardType(cardType);
        member.setSex(2);
//        Member member=null;
        PageBean<Member> pg=memberService.getMembers(member,1,10);
        System.out.println(pg);
    }

    @Test   //获得一条会员信息
    public void getMember() {
        Member member=memberService.getMember(4);
        System.out.println(member);
    }

    @Test       //添加一条会员来访记录
    public void addMemberGet() {

        Member member=new Member();
        member.setId(2);
        MemberGet memberGet=new MemberGet(1,member,null,"无");
        for (int i=5;i<20;i++){
            memberService.addMemberGet(memberGet);
        }
    }

    @Test   //获得多条会员来访记录
    public void getMemberGets() {
        Map<String,Object>map=new HashMap<>();
        map.put("sex",1);
        List<Member> list=memberMapper.selectMembers(map);
        for (Member m:list
             ) {
            System.out.println(m);
        }
    }

    @Test   //添加一条体验记录
    public void addExperience() {
        Experience experience=new Experience(1,"朱自清","14455556666","湖南长沙",1,new Date(),"无");
        for (int i=5;i<20;i++){
            memberService.addExperience(experience);
        }
    }

    @Test
    public void getExperiences() {
        memberService.getExperiences(null,1,7);
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
