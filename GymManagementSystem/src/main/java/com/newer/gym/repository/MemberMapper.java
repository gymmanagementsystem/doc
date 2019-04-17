package com.newer.gym.repository;

import com.newer.gym.bean.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @Description:    会员数据操作接口
* @Author:         HiFiYi
* @CreateDate:     2019/4/16 17:01
*/
@Mapper
public interface MemberMapper {
    /**
    * 方法实现说明    会员开户
    * @author      HiFiYi
    * @date        2019/4/17 9:14
    */
    void insertMember(Member member);

    /**
    * 方法实现说明    会员信息修改
    * @author      HiFiYi
    * @date        2019/4/17 9:14
    */
    void updateMember(Member member);

    /**
    * 方法实现说明    删除会员信息
    * @author      HiFiYi
    * @date        2019/4/17 9:15
    */
    void deleteMember(int memberId);

    /**
    * 方法实现说明    查询单个会员信息
    * @author      HiFiYi
    * @date        2019/4/17 9:15
    */
    Member selectMember(int memberId);

    /**
    * 方法实现说明
     *  根据页码，页面容量查出多个会员信息
    * @author      HiFiYi
    * @date        2019/4/17 9:16
    */
    List<Member> selectMembers(Member member, int currentPage, int pageSize);


    
}
