package com.newer.gym.controller;

import com.newer.gym.bean.*;
import com.newer.gym.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Map;

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
    @PostMapping("/member/addMember")
    public void addMember(@RequestBody Map<String,String> map) {
        memberService.addMember(map);
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
    public PageBean<Member> getMembers(@RequestParam(required = false) String id,
                                       @RequestParam(required = false) String sex,
                                       @RequestParam(required = false) String name,
                                       @RequestParam(required = false) String cardTypeId,
                                       @RequestParam(value = "currentPage",defaultValue = "1") int currentPage,
                                       @RequestParam(defaultValue = "8") int pageSize) {
        System.out.println(id);
        System.out.println(sex);
        Member member=new Member();
        try {
            if(id!=null&&id!="undefined"&&id!="") member.setId(Integer.parseInt(id));
        }catch (Exception e){
            member.setId(-1);
        }

        if(sex!=null&&sex!="undefined"&&sex!="") member.setSex(Integer.parseInt(sex));
        if(name!=null && name != "undefined"&& name != "") member.setName(name);
        if(cardTypeId!=null && cardTypeId!= "undefined"&& cardTypeId!= ""){
            CardType cardType =new CardType();
            cardType.setId(Integer.parseInt(cardTypeId));
            member.setCardType(cardType);
        }

        System.out.println(member);
        return memberService.getMembers(member,currentPage,pageSize);
    }
    @GetMapping("/member/getMemberTotal")
    public int getMembersCount(){
        return memberService.getMembersCount();
    }

    @GetMapping("/member/getMember")
    public Member getMember(@RequestParam String memberId) {
        System.out.println(memberId);
        int id=Integer.parseInt(memberId);
        return memberService.getMember(id);
    }
    @GetMapping("/member/getAllMember")
    public PageBean<Member> getAllMember(@RequestParam(defaultValue = "1")int currentPage,@RequestParam(defaultValue = "8") int pageSize){
        return memberService.getAllMembers(currentPage,pageSize);
    }
    @GetMapping("/member/addMemberGet")
    public void addMemberGet(@RequestBody MemberGet memberGet) {
        memberService.addMemberGet(memberGet);
    }

    @GetMapping("/member/getMemberGets")
    public PageBean<MemberGet> getMemberGets(@RequestBody(required = false) MemberGet memberGet, @RequestParam(defaultValue = "1") int curremtPage, @RequestParam(defaultValue = "8") int pageSize) {
        return memberService.getMemberGets(memberGet,curremtPage,pageSize);
    }

    @PostMapping("/member/addExperience")
    public void addExperience(@RequestBody Experience experience) {
        memberService.addExperience(experience);
    }

    @GetMapping("/member/getExperiences")
    public PageBean<Experience> getExperiences (@RequestBody(required = false)  Experience experience, @RequestParam(defaultValue = "1") int currentPage, @RequestParam(defaultValue = "8") int pageSize) {
        return memberService.getExperiences(experience,currentPage,pageSize);
    }

    @PostMapping("/member/addCardType")
    public void addCardType(@RequestBody CardType cardType) {
        System.out.println(cardType);
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
