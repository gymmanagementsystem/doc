package com.newer.gym.controller;

import com.newer.gym.bean.CardType;
import com.newer.gym.bean.Experience;
import com.newer.gym.bean.Member;
import com.newer.gym.bean.MemberGet;
import com.newer.gym.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
* @Description:    会员控制器    为外部服务器提供数据交互接口
* @Author:         HiFiYi
* @CreateDate:     2019/4/17 15:19
*/
@Controller("/member/1")
public class MemberController{
    @Autowired
    MemberService memberService;

    public void addMember(Member member) {
        memberService.addMember(member);
    }


    public void editorMember(Member member) {
        memberService.editorMember(member);
    }


    public void removeMember(int memberId) {
        memberService.removeMember(memberId);
    }


    public List<Member> getMembers(Member member, int currentPage, int pageSize) {
        return memberService.getMembers(member,currentPage,pageSize);
    }


    public Member getMember(int memberId) {
        return memberService.getMember(memberId);
    }


    public void addMemberGet(MemberGet memberGet) {
        memberService.addMemberGet(memberGet);
    }


    public List<MemberGet> getMemberGets(MemberGet memberGet, int curremtPage, int pageSize) {
        return memberService.getMemberGets(memberGet,curremtPage,pageSize);
    }


    public void addExperience(Experience experience) {
        memberService.addExperience(experience);
    }


    public List<Experience> getExperiences(Experience experience, int curremtPage, int pageSize) {
        return memberService.getExperiences(experience,curremtPage,pageSize);
    }


    public void addCardType(CardType cardType) {
        memberService.addCardType(cardType);
    }


    public void editorCardType(CardType cardType) {
        memberService.editorCardType(cardType);
    }


    public void removeCardType(int cardTypeId) {
        memberService.removeCardType(cardTypeId);
    }


    public List<CardType> getCardTypes(CardType cardType, int currentPage, int pageSize) {
        return memberService.getCardTypes(cardType,currentPage,pageSize);
    }


    public CardType getCardType(int cardTypeId) {
        return memberService.getCardType(cardTypeId);
    }


    public void addBanlence(int memberId, int cost) {
        memberService.addBanlence(memberId,cost);
    }
}
