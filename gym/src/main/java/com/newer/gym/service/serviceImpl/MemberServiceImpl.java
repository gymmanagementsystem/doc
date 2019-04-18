package com.newer.gym.service.serviceImpl;

import com.newer.gym.bean.CardType;
import com.newer.gym.bean.Experience;
import com.newer.gym.bean.Member;
import com.newer.gym.bean.MemberGet;
import com.newer.gym.repository.MemberMapper;
import com.newer.gym.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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
    public void addMember(Member member) {
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

    @Override
    public List<Member> getMembers(Member member, int currentPage, int pageSize) {
        return null;
    }

    @Override
    public Member getMember(int memberId) {
        return memberMapper.selectMember(memberId);
    }

    @Override
    public void addMemberGet(MemberGet memberGet) {
        memberMapper.insertMemberGet(memberGet);
    }

    @Override
    public List<MemberGet> getMemberGets(MemberGet memberGet, int curremtPage, int pageSize) {
        return null;
    }

    @Override
    public void addExperience(Experience experience) {
        memberMapper.insertExperience(experience);
    }

    @Override
    public List<Experience> getExperiences(Experience experience, int curremtPage, int pageSize) {
        return null;
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
    public List<CardType> getCardTypes(CardType cardType, int currentPage, int pageSize) {
        return null;
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
