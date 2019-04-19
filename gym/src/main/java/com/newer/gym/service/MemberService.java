package com.newer.gym.service;

import com.newer.gym.bean.CardType;
import com.newer.gym.bean.Experience;
import com.newer.gym.bean.Member;
import com.newer.gym.bean.MemberGet;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @Description:    会员数据服务接口
* @Author:         HiFiYi
* @CreateDate:     2019/4/17 14:30
*/
@Service
public interface MemberService {
    void addMember(Member member);


    void editorMember(Member member);


    void removeMember(int memberId);


    List<Member> getMembers(Member member, int currentPage, int pageSize);


    Member getMember(int memberId);


    void addMemberGet(MemberGet memberGet);


    List<MemberGet> getMemberGets(MemberGet memberGet,int curremtPage,int pageSize);


    void addExperience (Experience experience);


    List<Experience> getExperiences(Experience experience,int curremtPage,int pageSize);



    void addCardType(CardType cardType);


    void editorCardType(CardType cardType);


    void removeCardType(int cardTypeId);


    List<CardType> getCardTypes();


    CardType getCardType(int cardTypeId);


    void addBanlence(int memberId,int cost);
}
