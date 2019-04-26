package com.newer.gym.service.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.newer.gym.bean.*;
import com.newer.gym.repository.MemberMapper;
import com.newer.gym.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

/**
* @Description:    会员数据服务实现类
* @Author:         HiFiYi
* @CreateDate:     2019/4/17 15:02
*/
@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    MemberMapper memberMapper;
    @Override
    public void addMember(Map<String,String> map) {
        Member member=new Member();
        member.setName(map.get("name"));
        member.setSex(Integer.parseInt(map.get("sex")));
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        try {
            member.setBirthday(sdf.parse(map.get("birthday")));
        }catch (Exception e){

        }
        Staff counselor=new Staff();
        counselor.setId(Integer.parseInt(map.get("counselor")));
        member.setCounselor(counselor);
        CardType cardType=new CardType();
        cardType.setId(Integer.parseInt(map.get("cardType")));
        member.setCardType(cardType);
        member.setIdentify(Integer.parseInt(map.get("identify")));
        member.setIdCard(map.get("idCard"));
        member.setTel(map.get("tel"));
        Staff coach=new Staff();
        coach.setId(Integer.parseInt(map.get("coach")));
        member.setCoach(coach);
        member.setAddress(map.get("address"));
        member.setRemark(map.get("remark"));
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(new Date());
        switch (member.getCardType().getId()){
            case 1:
                calendar.add(calendar.DATE,30);
                member.setCloseTime(calendar.getTime());
                break;
            case 2:
                calendar.add(calendar.DATE,90);
                member.setCloseTime(calendar.getTime());
                break;
            case 3:
                calendar.add(calendar.DATE,360);
                member.setCloseTime(calendar.getTime());
                break;
            case 6:
                calendar.add(calendar.DATE,7);
                member.setCloseTime(calendar.getTime());
                break;
        }
        System.out.println(calendar.getTime());
        System.out.println(member);

        memberMapper.insertMember(member);
    }

    @Override
    public void editorMember(Member member) {
        memberMapper.updateMember(member);
    }

    @Override
    public void removeMember(int memberId) {
        memberMapper.deleteMember(memberId);
    }

    /**
    * 方法实现说明
    * @author      HiFiYi
    No such property: code for class: Script1
    * @return
    * @exception
    * @date        2019/4/22 14:19
    */
    @Override
    public PageBean<Member> getMembers(Member member, int currentPage, int pageSize) {
        PageHelper.startPage(currentPage,pageSize);
        if(member==null){
            Map<String, Object> map=new HashMap<>();
            List<Member> list=memberMapper.selectMembers(map);
            int memberCount=memberMapper.selectMemberCount(map);
            PageBean<Member> pg=new PageBean<Member>(currentPage,pageSize,memberCount);
            pg.setItems(list);
            return pg;
        }else{
            Map<String, Object> map=new HashMap<>();
            map.put("id",member.getId());
            if(member.getId()==0){
                map.put("id",null);
            }
            map.put("name",member.getName());
            map.put("sex",member.getSex());
            if(member.getCardType()!=null)
                map.put("cardType",member.getCardType().getId());
            else
                map.put("cardType",null);
            List<Member> list=memberMapper.selectMembers(map);
            int memberCount=memberMapper.selectMemberCount(map);
            PageBean<Member> pg=new PageBean<Member>(currentPage,pageSize,memberCount);
            pg.setItems(list);
            return pg;
        }

    }

    @Override
    public PageBean<Member> getAllMembers(int currentPage,int pageSize) {
//        PageHelper.startPage(currentPage,pageSize);
//        List<Member> members = memberMapper.selectAllMembers();
//        int memberCount = memberMapper.selectMemberCount();
//        PageBean<Member> pg=new PageBean<Member>(currentPage,pageSize,memberCount);
//        pg.setItems(members);
        return null;
    }

    @Override
    public Member getMember(int memberId) {
        Member member=memberMapper.selectMember(memberId);
        member.getCoach().setDepartment(null);
        member.getCounselor().setDepartment(null);
        return member;
    }

    @Override
    public void addMemberGet(MemberGet memberGet) {
        memberMapper.insertMemberGet(memberGet);
    }

    @Override
    public PageBean<MemberGet> getMemberGets(MemberGet memberGet, int currentPage, int pageSize) {
        PageHelper.startPage(currentPage,pageSize);
        List<MemberGet> memberGets = memberMapper.selectMemberGets();
        int memberGetsCount = memberMapper.selectMemberGetsCount();
        PageBean<MemberGet> pg=new PageBean<MemberGet>(currentPage,pageSize,memberGetsCount);
        pg.setItems(memberGets);
        return pg;
    }

    @Override
    public void addExperience(Experience experience) {
        memberMapper.insertExperience(experience);
    }

    @Override
    public PageBean<Experience> getExperiences(Experience experience, int currentPage, int pageSize) {
        PageHelper.startPage(currentPage,pageSize);
        List<Experience> experiences = memberMapper.selectExperiences();
        int experiencesCount = memberMapper.selectExperiencesCount();
        PageBean<Experience> pg=new PageBean<Experience>(currentPage,pageSize,experiencesCount);
        pg.setItems(experiences);
        return pg;
    }

    @Override
    public int getMembersCount() {

        return memberMapper.selectMembersCount();
    }

    @Override
    public void addCardType(CardType cardType) {
        memberMapper.insertCardType(cardType);
    }

    @Override
    public void editorCardType(CardType cardType) {
        memberMapper.updateCardType(cardType);
    }

    @Override
    public void removeCardType(int cardTypeId) {
        memberMapper.deleteCardType(cardTypeId);
    }

    @Override
    public List<CardType> getCardTypes() {
        return memberMapper.selectCardTypes();
    }

    @Override
    public CardType getCardType(int cardTypeId) {
        return memberMapper.selectCardType(cardTypeId);
    }

    @Override
    public void addBanlence(int memberId, int cost) {
        memberMapper.addBanlence(memberId,cost);
    }
}
