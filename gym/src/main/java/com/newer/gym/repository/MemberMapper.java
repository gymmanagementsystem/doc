package com.newer.gym.repository;

import com.newer.gym.bean.CardType;
import com.newer.gym.bean.Experience;
import com.newer.gym.bean.Member;
import com.newer.gym.bean.MemberGet;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

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
    @Insert("insert into member_card(name,cardtype_id,sex,opentime,closetime,balance,tel" +
            ",state,birthday,coach,wardrobe_id,counselor,identify,idcard,address,remark) " +
            "values (#{name},#{cardType.id},#{sex},#{opentime},#{closetime},#{balance}," +
            "#{tel},#{state},#{birthday},#{coach.id},#{wardrobe.id},#{counselor.id}," +
            "#{identify},#{idcard},#{address},#{remark}})")
    void insertMember(Member member);

    /**
    * 方法实现说明    会员信息修改
    * @author      HiFiYi
    * @date        2019/4/17 9:14
    */
    @Update("update member_card set ")
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
    @Select("select * from member_card")
    Member selectMember(int memberId);

    /**
    * 方法实现说明
     *  根据页码，页面容量查出多个会员信息
    * @author      HiFiYi
    * @date        2019/4/17 9:16
    */
    List<Member> selectMembers(Member member, int currentPage, int pageSize);

    /**
    * 方法实现说明    添加一条会员来访记录
    * @author      HiFiYi
    * @date        2019/4/17 9:22
    */
    void insertMemberGet(MemberGet memberGet);

    /**
    * 方法实现说明    首次体验登记
    * @author      HiFiYi
    * @date        2019/4/17 9:23
    */
    void insertExperience(Experience experience);

    /**
    * 方法实现说明    多个体验记录展示
    * @author      HiFiYi
    * @date        2019/4/17 9:23
    */
    List<Experience> selectExperiences(Experience experience, int curremtPage, int pageSize);

    /**
    * 方法实现说明    添加会员卡类型
    * @author      HiFiYi
    * @date        2019/4/17 9:24
    */
    void insertCardType(CardType cardType);

    /**
    * 方法实现说明    修改会员卡类型信息
    * @author      HiFiYi
    * @date        2019/4/17 9:25
    */
    void updateCardType(CardType cardType);

    /**
    * 方法实现说明    删除一个会员卡类型
    * @author      HiFiYi
    * @date        2019/4/17 9:25
    */
    void deleteCardType(int cardTypeId);

    /**
     * 方法实现说明    获得多个会员卡类型
     * @author      HiFiYi
     * @date        2019/4/17 9:25
     */
    List<CardType> selectCardTypes(CardType cardType, int currentPage, int pageSize);

    /**
    * 方法实现说明    获得单个会员卡类型信息
    * @author      HiFiYi
    * @date        2019/4/17 9:27
    */
    CardType selectCardTypes(int cardTypeId);

    /**
    * 方法实现说明    会员卡充值
    * @author      HiFiYi
    * @date        2019/4/17 9:27
    */
    void addBanlence(int memberId, int cost);
}
