package com.newer.gym.repository;

import com.newer.gym.bean.Wardrobe;
import com.newer.gym.bean.WardrobeRecord;
import org.apache.ibatis.annotations.*;

import java.util.List;
/**
* @Description:    衣柜数据操作接口
* @Author:         HiFiYi
* @CreateDate:     2019/4/20 12:30
*/
@Mapper
public interface WardrobeMapper {
    @Insert("insert wardrobe(usestate,cost,position,remark) values " +
            "(#{state},#{cost},#{position},#{remark})")
    void insertWardrobe (Wardrobe wardrobe);

    @Update("update wardrobe set usestate=#{state},user=#{member.id},cost=#{cost},position=#{position} where id=#{id}")
    void updateWardrobe (Wardrobe wardrobe);

    @Delete("delete from wardrobe where id=#{id}")
    void deleteWardrobe (@Param("id") int wardrobeId);

    @SelectProvider(type = WardrobeMapperProvider.class,method = "selectWardrobes")
    @Results({@Result(column = "user",property = "member",one =
    @One(select = "com.newer.gym.repository.MemberMapper.selectMember"))})
    List<Wardrobe> selectWardrobes ();
    @SelectProvider(type = WardrobeMapperProvider.class,method = "selectWardrobesCount")
    int selectWardrobeCount();

    @Select("select * from wardrobe where id=#{id}")
    @Results({@Result(column = "user",property = "member",one =
    @One(select = "com.newer.gym.repository.MemberMapper.selectMember"))})
    Wardrobe selectWardrobe (@Param("id") int wardrobeId);

    @Select("select * from wardrobe where usestate = 0")
    List<Wardrobe> selectFreeWardrobe();




    @Insert("insert into wardroberecord(member_id,cost,time,state,remark) " +
            "values (#{member.id}.#{cost},#{time},#{state},#{remark})")
    void insertWardrobeRecord(WardrobeRecord wardrobeRecord);

    @Update("update wardrobe set member_id=#{member.id},cost=#{cost}," +
            "time=#{time},state=#{state},remark=#{remark}")
    void updateWardrobeRecord(WardrobeRecord wardrobeRecord);


    @Delete("delete from wardrobe_recorde where id=#{id}")
    void deleteWardrobeRecord(@Param("id") int wardrobeRecordId);


    @Select("select * from wardrobe_record")
    List<WardrobeRecord> selectWardrobeRecords();


    @Select("select * from wardrobe_record where id=#{id}")
    @Results({@Result(column = "member_id",property = "member",
            one = @One(select = "com.newer.gym.repository.MemberMapper.selectMember"))})
    WardrobeRecord selectWardrobeRecord(@Param("id")int wardrobeRecordId);


}
