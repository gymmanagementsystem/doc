package com.newer.gym.repository;

import com.newer.gym.bean.CardType;
import com.newer.gym.bean.Experience;
import com.newer.gym.bean.Member;
import com.newer.gym.bean.MemberGet;
import org.apache.ibatis.annotations.*;

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
    @Insert("insert into member_card(name,cardtype_id,sex,closetime,balance,tel" +
            ",state,birthday,coach,counselor,identify,idcard,address,remark) " +
            "values (#{name},#{cardType.id},#{sex},#{closeTime},#{balance}," +
            "#{tel},#{state},#{birthday},#{coach.id},#{counselor.id}," +
            "#{identify},#{idCard},#{address},#{remark})")
    void insertMember(Member member);

    /**
    * 方法实现说明    会员信息修改
    * @author      HiFiYi
    * @date        2019/4/17 9:14
    */
    @Update("update member_card set name=#{name},cardtype_id=#{cardType.id},sex=#{sex}," +
            "opentime=#{openTime},closetime=#{closeTime},balance=#{balance},tel=#{tel}"+
           ",state=#{state},birthday=#{birthday},coach=#{coach.id},wardrobe_id=#{wardrobe.id}" +
            ",counselor=#{counselor.id},identify=#{identify},idcard=#{idCard}," +
            "address=#{address},remark=#{remark} where id=#{id}")
    void updateMember(Member member);

    /**
    * 方法实现说明    删除会员信息
    * @author      HiFiYi
    * @date        2019/4/17 9:15
    */
    @Delete("delete from member_card where id =#{memberId}")
    void deleteMember(@Param("memberId") int memberId);

    /**
    * 方法实现说明    查询单个会员信息
    * @author      HiFiYi
    * @return
    * @date        2019/4/17 9:15
    */
    @Select("select * from member_card where id=#{id}")
    @Results({@Result(column ="coach",property = "coach",one = @One(select = "com.newer.gym.repository.PersonnelMapper.selectStaff")),
              @Result(column = "counselor",property = "counselor",one = @One(select = "com.newer.gym.repository.PersonnelMapper.selectStaff")),
              //@Result(column = "wardrobe_id",property = "wardrobe",one = @One(select = "com.newer.gym.repository.WardrobeMapper.getWardrobe")),
              @Result(column = "opentime",property = "openTime"),@Result(column = "closetime",property = "closeTime"),
              @Result(column = "idcard",property = "idCard"),@Result(column = "cardtype_id",property = "cardType",one = @One(select = "selectCardType"))})
    Member selectMember(@Param("id") int memberId);

    /**
    * 方法实现说明    分页
     *  根据页码，页面容量查出多个会员信息
    * @author      HiFiYi
    * @return
    * @date        2019/4/17 9:16
    */
    List<Member> selectMembers(Member member, int currentPage, int pageSize);

    /**
    * 方法实现说明    添加一条会员来访记录
    * @author      HiFiYi
    * @date        2019/4/17 9:22
    */
    @Insert("insert into member_get(member_cardid,remark) values (#{member.id},#{remark})")
    void insertMemberGet(MemberGet memberGet);

    /**
    * 方法实现说明    首次体验登记
    * @author      HiFiYi
    * @date        2019/4/17 9:23
    */
    @Insert("insert into experience(username,contact,address,sex,time,remark) values (#{name}," +
            "#{contact},#{address},#{sex},#{time},#{remark})")
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
    @Insert("insert into card_type(name,price,remark) values (#{name},#{price},#{remark})")
    void insertCardType(CardType cardType);

    /**
    * 方法实现说明    修改会员卡类型信息
    * @author      HiFiYi
    * @date        2019/4/17 9:25
    */
    @Update("update card_type set name=#{name},price=#{price},remark=#{remark} where id=#{id} ")
    void updateCardType(CardType cardType);

    /**
    * 方法实现说明    删除一个会员卡类型
    * @author      HiFiYi
    * @date        2019/4/17 9:25
    */
    @Delete("delete from card_type where id =#{cardTypeId}")
    void deleteCardType(@Param("cardTypeId") int cardTypeId);

    /**
     * 方法实现说明    获得多个会员卡类型
     * @author      HiFiYi
     * @return      会员卡类型实体的集合
     * @date        2019/4/17 9:25
     */
    @Select("select * from card_type")
    List<CardType> selectCardTypes();

    /**
    * 方法实现说明    获得单个会员卡类型信息
    * @author      HiFiYi
    * @return      一个会员卡类型实体
    * @date        2019/4/17 9:27
    */
    @Select("select * from card_type where id=#{cardTypeId}")
    CardType selectCardType(@Param("cardTypeId") int cardTypeId);

    /**
    * 方法实现说明    会员卡充值
    * @author      HiFiYi
    * @date        2019/4/17 9:27
    */
    @Update("update member_card set balance=balance+#{cost} where id=#{memberId}")
    void addBanlence(@Param("memberId") int memberId,@Param("cost") int cost);
}
