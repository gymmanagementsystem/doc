package com.newer.gym.repository;

import com.newer.gym.bean.*;
import org.apache.ibatis.annotations.*;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Description: 会员数据操作接口
 * @Author: HiFiYi
 * @CreateDate: 2019/4/16 17:01
 */
@Mapper
public interface MemberMapper {
    /**
     * 方法实现说明    会员开户
     *
     * @author HiFiYi
     * @date 2019/4/17 9:14
     */
    @Insert("insert into member_card(name,cardtype_id,sex,closetime,balance,tel" +
            ",state,birthday,coach,counselor,identify,idcard,address,remark) " +
            "values (#{name},#{cardType.id},#{sex},#{closeTime},#{balance}," +
            "#{tel},#{state},#{birthday},#{coach.id},#{counselor.id}," +
            "#{identify},#{idCard},#{address},#{remark})")
    void insertMember(Member member);

    /**
     * 方法实现说明    会员信息修改
     *
     * @author HiFiYi
     * @date 2019/4/17 9:14
     */
    @Update("update member_card set name=#{name},cardtype_id=#{cardType.id},sex=#{sex}," +
            "opentime=#{openTime},closetime=#{closeTime},balance=#{balance},tel=#{tel}" +
            ",state=#{state},birthday=#{birthday},coach=#{coach.id},wardrobe_id=#{wardrobe.id}" +
            ",counselor=#{counselor.id},identify=#{identify},idcard=#{idCard}," +
            "address=#{address},remark=#{remark} where id=#{id}")
    void updateMember(Member member);

    /**
     * 方法实现说明    删除会员信息
     *
     * @author HiFiYi
     * @date 2019/4/17 9:15
     */
    @Delete("delete from member_card where id =#{memberId}")
    void deleteMember(@Param("memberId") int memberId);

    /**
     * 方法实现说明    查询单个会员信息
     *
     * @return
     * @author HiFiYi
     * @date 2019/4/17 9:15
     */
    @Select("select * from member_card where id=#{id}")
    @Results({@Result(column = "coach", property = "coach", one = @One(select = "com.newer.gym.repository.PersonnelMapper.selectStaff")),
            @Result(column = "counselor", property = "counselor", one = @One(select = "com.newer.gym.repository.PersonnelMapper.selectStaff")),
            //@Result(column = "wardrobe_id",property = "wardrobe",one = @One(select = "com.newer.gym.repository.WardrobeMapper.getWardrobe")),
            @Result(column = "opentime", property = "openTime"), @Result(column = "closetime", property = "closeTime"),
            @Result(column = "idcard", property = "idCard"), @Result(column = "cardtype_id", property = "cardType", one = @One(select = "selectCardType"))})
    Member selectMember(@Param("id") int memberId);

    /**
     * 方法实现说明    分页
     * 根据页码，页面容量查出多个会员信息
     *
     * @return
     * @author HiFiYi
     * @date 2019/4/17 9:16
     */
    @SelectProvider(method = "selectMembers", type = MemberMapperProvider.class)
    @Results({@Result(column ="cardtype_id",property = "cardType",one=@One(select = "memberSelectCardTypeById")),
            @Result(column = "opentime",property = "openTime"),@Result(column = "closetime",property = "closeTime"),
            @Result(column = "wardrobe_id",property = "wardrobe",one = @One(select = "selectWardrobeById")),
            @Result(column = "counselor",property = "counselor",one = @One(select = "selectStaff")),
            @Result(column = "coach",property = "coach",one = @One(select = "selectStaff")),
            @Result(column = "idcard",property = "idCard")
    })
    List<Member> selectMembers(Map<String, Object> map);
    @SelectProvider(method = "selectMembersCount", type = MemberMapperProvider.class)
    int selectMemberCount(Map<String,Object> map);
    @Select("select * from card_type where id=#{id}")
    CardType memberSelectCardTypeById(@Param("id") int id);
    @Select("select * from wardrobe where id =#{id}")
    @Results({@Result(column = "usestate",property = "state")})
    Wardrobe selectWardrobeById(@Param("id") int id);
    @Select("select count(*) from member_card")
    int selectMembersCount();
    @Select("select * from staff where id=#{id}")
    Staff selectStaff(@Param("id") int staffId);


    /**
     * 方法实现说明        查出所有会员信息
     *
     * @author HiFiYi
     * @date 2019/4/22 14:05
     */
    @Select("select * from member_card ")
    @Results({@Result(column = "coach", property = "coach", one = @One(select = "com.newer.gym.repository.PersonnelMapper.selectStaff")),
            @Result(column = "counselor", property = "counselor", one = @One(select = "com.newer.gym.repository.PersonnelMapper.selectStaff")),
            // @Result(column = "wardrobe_id",property = "wardrobe",one = @One(select = "com.newer.gym.repository.WardrobeMapper.selectWardrobe")),
            @Result(column = "opentime", property = "openTime"), @Result(column = "closetime", property = "closeTime"),
            @Result(column = "idcard", property = "idCard"), @Result(column = "cardtype_id", property = "cardType", one = @One(select = "selectCardType"))})
    List<Member> selectAllMembers();





    /**
     * 方法实现说明    添加一条会员来访记录
     *
     * @author HiFiYi
     * @date 2019/4/17 9:22
     */
    @Insert("insert into member_get(member_cardid,remark) values (#{member.id},#{remark})")
    void insertMemberGet(MemberGet memberGet);


    @Select("select * from member_get order by time")
    @Results({@Result(column = "member_cardid", property = "member", one = @One(select = "selectMember"))})
    List<MemberGet> selectMemberGets();

    @Select("select count(*) from member_get")
    int selectMemberGetsCount();

    /**
     * 方法实现说明    首次体验登记
     *
     * @author HiFiYi
     * @date 2019/4/17 9:23
     */
    @Insert("insert into experience(username,contact,address,sex,remark) values (#{name}," +
            "#{contact},#{address},#{sex},#{remark})")
    void insertExperience(Experience experience);

    /**
     * 方法实现说明    多个体验记录展示
     *
     * @author HiFiYi
     * @date 2019/4/17 9:23
     */
    @Select("select * from experience order by time")
    @Results({@Result(column = "username", property = "name")})
    List<Experience> selectExperiences();

    @Select("select count(*) from experience")
    int selectExperiencesCount();


    /**
     * 方法实现说明    添加会员卡类型
     *
     * @author HiFiYi
     * @date 2019/4/17 9:24
     */
    @Insert("insert into card_type(name,price,remark) values (#{name},#{price},#{remark})")
    void insertCardType(CardType cardType);

    /**
     * 方法实现说明    修改会员卡类型信息
     *
     * @author HiFiYi
     * @date 2019/4/17 9:25
     */
    @Update("update card_type set name=#{name},price=#{price},remark=#{remark} where id=#{id} ")
    void updateCardType(CardType cardType);

    /**
     * 方法实现说明    删除一个会员卡类型
     *
     * @author HiFiYi
     * @date 2019/4/17 9:25
     */
    @Delete("delete from card_type where id =#{cardTypeId}")
    void deleteCardType(@Param("cardTypeId") int cardTypeId);

    /**
     * 方法实现说明    获得多个会员卡类型
     *
     * @return 会员卡类型实体的集合
     * @author HiFiYi
     * @date 2019/4/17 9:25
     */
    @Select("select * from card_type")
    List<CardType> selectCardTypes();

    /**
     * 方法实现说明    获得单个会员卡类型信息
     *
     * @return 一个会员卡类型实体
     * @author HiFiYi
     * @date 2019/4/17 9:27
     */
    @Select("select * from card_type where id=#{cardTypeId}")
    CardType selectCardType(@Param("cardTypeId") int cardTypeId);

    /**
     * 方法实现说明    会员卡充值
     *
     * @author HiFiYi
     * @date 2019/4/17 9:27
     */
    @Update("update member_card set balance=balance+#{cost} where id=#{memberId}")
    void addBanlence(@Param("memberId") int memberId, @Param("cost") int cost);
}
