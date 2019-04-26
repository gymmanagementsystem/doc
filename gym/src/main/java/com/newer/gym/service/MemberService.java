package com.newer.gym.service;

import com.newer.gym.bean.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
* @Description:    会员数据服务接口
* @Author:         HiFiYi
* @CreateDate:     2019/4/17 14:30
*/
@Service
public interface MemberService {
    void addMember(Map<String,String> member);


    void editorMember(Member member);


    void removeMember(int memberId);


    PageBean<Member> getMembers(Member member, int currentPage, int pageSize);

    PageBean<Member> getAllMembers(int currentPage, int pageSize);

    Member getMember(int memberId);


    void addMemberGet(MemberGet memberGet);


    PageBean<MemberGet> getMemberGets(MemberGet memberGet,int curremtPage,int pageSize);


    void addExperience (Experience experience);


    PageBean<Experience> getExperiences(Experience experience,int curremtPage,int pageSize);

    int getMembersCount();

    void addCardType(CardType cardType);


    void editorCardType(CardType cardType);


    void removeCardType(int cardTypeId);


    List<CardType> getCardTypes();


    CardType getCardType(int cardTypeId);


    void addBanlence(int memberId,int cost);
}
