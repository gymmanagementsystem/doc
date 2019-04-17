package com.newer.gym.repository;

import com.newer.gym.bean.Member;
import org.apache.ibatis.annotations.Mapper;

/**
* @Description:    会员数据操作接口
* @Author:         HiFiYi
* @CreateDate:     2019/4/16 17:01
*/
@Mapper
public interface MemberMapper {

    void insertMember(Member member);


    void updateMember(Member member);


    void deleteMember(int memberId);


    void selectMember()
}
