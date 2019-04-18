package com.newer.gym.controller;

import com.newer.gym.bean.CardType;
import com.newer.gym.bean.Experience;
import com.newer.gym.bean.Member;
import com.newer.gym.bean.MemberGet;
import com.newer.gym.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
* @Description:    会员控制器    为外部服务器提供数据交互接口
* @Author:         HiFiYi
* @CreateDate:     2019/4/17 15:19
*/
@RestController
@CrossOrigin
public class MemberController{
    @Autowired
    MemberService memberService;
    @GetMapping("/member/addMember")
    public void addMember(@RequestBody Member member) {
        memberService.addMember(member);
    }

    @GetMapping("/member/editorMember")
    public void editorMember(@RequestBody Member member) {
        memberService.editorMember(member);
    }

    @GetMapping("/member/removeMember")
    public void removeMember(int memberId) {
        memberService.removeMember(memberId);
    }

    @GetMapping("/member/getMembers")
    public List<Member> getMembers(@RequestBody Member member, int currentPage, int pageSize) {
        return memberService.getMembers(member,currentPage,pageSize);
    }

    @GetMapping("/member/getMember")
    public Member getMember(int memberId) {
        return memberService.getMember(memberId);
    }

    @GetMapping("/member/addMemberGet")
    public void addMemberGet(@RequestBody MemberGet memberGet) {
        memberService.addMemberGet(memberGet);
    }

    @GetMapping("/member/getMemberGets")
    public List<MemberGet> getMemberGets(@RequestBody MemberGet memberGet, int curremtPage, int pageSize) {
        return memberService.getMemberGets(memberGet,curremtPage,pageSize);
    }

    @GetMapping("/member/addExperience")
    public void addExperience(@RequestBody Experience experience) {
        memberService.addExperience(experience);
    }

    @GetMapping("/member/getExperiences")
    public List<Experience> getExperiences (@RequestBody  Experience experience, int curremtPage, int pageSize) {
        return memberService.getExperiences(experience,curremtPage,pageSize);
    }

    @GetMapping("/member/addCardType")
    public void addCardType(@RequestBody CardType cardType) {
        memberService.addCardType(cardType);
    }

    @GetMapping("/member/editorCardType")
    public void editorCardType(@RequestBody CardType cardType) {
        memberService.editorCardType(cardType);
    }

    @GetMapping("/member/removeCardType")
    public void removeCardType(int cardTypeId) {
        memberService.removeCardType(cardTypeId);
    }

    @GetMapping("/member/getCardTypes")
    public List<CardType> getCardTypes() {
        List<CardType> list=memberService.getCardTypes();
        return list;
    }

    @GetMapping("/member/getCardType")
    public CardType getCardType(int cardTypeId) {
        return memberService.getCardType(cardTypeId);
    }

    @GetMapping("/member/addBanlence")
    public void addBanlence(int memberId, int cost) {
        memberService.addBanlence(memberId,cost);
    }
}
