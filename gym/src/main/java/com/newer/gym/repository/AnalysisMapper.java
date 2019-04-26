package com.newer.gym.repository;

import com.newer.gym.bean.*;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
* @Description:    统计分析模块数据持久化接口
* @Author:         HiFiYi
* @CreateDate:     2019/4/23 14:18
*/
@Mapper
public interface AnalysisMapper {
    @Select("select s.id,s.name,s.department_id,sum(c.price) as achievement from staff s," +
            "member_card mc,card_type c where mc.counselor = s.id and c.id =mc.cardtype_id group by s.id")
    List<QueryVo> getStaffAchievements();





    @Select("select count(t.id) from (select s.id as id ,s.name as name,s.department_id,sum(c.price) as achievement from " +
            "staff s,member_card mc,card_type c where mc.counselor = s.id and c.id =mc.cardtype_id group by s.id) t;")
    int getStaffAchievementsCount();
    @Select("select sum(c.price) as achievement from staff s,member_card mc,card_type c where mc.counselor = s.id and c.id =mc.cardtype_id where" +
            "mc.opentime > #{startDate} and mc.opentime < #{now}")
    double getMonthIncome(Date startDate,Date now);
    double getMonthSale(Date startDate,Date now);

    @Select("select sum(cost) from member_expense")
    double getAllIncome();
    @Select("select sum(cost) from member_expense")
    double getAllSale();

    /**
    * 方法实现说明    用于消费记录的显示
    * @author      HiFiYi
    * @date        2019/4/25 14:11
    */
    @SelectProvider(method = "selectMemberExpense",type = AnalysisMapperProvider.class)
    @Results({@Result(column = "member_id",property = "member",one = @One(select = "selectMemberById")),
    @Result(column = "product_id",property = "product",one = @One(select = "selectProductById")),
    @Result(column = "course_id",property = "course",one=@One(select = "selectCourseById"))})
    List<MemberExpense> selectMemberExpense(Map<String,String> map);
    @Select("select * from member_card where id =#{id}")
    Member selectMemberById(@Param("id") int id);
    @Select("select * from product where id =#{id}")
    Product selectProductById(@Param("id")int id);
    @Select("select * from course where id=#{id}")
    Course selectCourseById(@Param("id")int id);
    @SelectProvider(method = "selectMemberExpenseCount",type = AnalysisMapperProvider.class)
    int selectMemberExpenseCount(Map<String,String> map);

    /**
    * 方法实现说明    获得所有商品总数
    * @author      HiFiYi
    * @date        2019/4/25 14:16
    */
    @Select("select count(id) from product")
    int selectProductCount();
    /**
    * 方法实现说明    总销售额
    * @author      HiFiYi
    * @date        2019/4/25 14:19
    */
    @Select("select sum(cost) from member_expense")
    double selectAllTotalSales();

    /**
    * 方法实现说明    查看本月销售额
    * @author      HiFiYi
    * @date        2019/4/25 14:23
    */
    @Select("select sum(cost) from member_expense " +
            "where  time>date_add(curdate(), interval - day(curdate()) + 1 day)" +
            "AND time <= now();")
    double selectMonthSales();

    /**
    * 方法实现说明   会员总人数
    * @author      HiFiYi
    * @date        2019/4/25 15:48
    */
    @Select("select count(*) from member_card")
    int selectMemberCount();
}
