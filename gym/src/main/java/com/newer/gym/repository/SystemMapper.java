package com.newer.gym.repository;

import com.newer.gym.bean.Admin;
import com.newer.gym.bean.Logger;
import com.newer.gym.bean.Notice;
import org.apache.ibatis.annotations.*;

import java.sql.Date;
import java.util.List;
import java.util.Map;

@Mapper
public interface SystemMapper {
    /**
     * 添加一个管理员
     *
     * @param
     * @return
     * @throws
     * @author pjun
     * @date 2019-04-17 10:55
     */
    @Insert("insert into admin (id,pwd,name,contact,state,remark) values(#{id},#{password},#{name},#{contact},#{state},#{remark})")
    //@Results(@Result(property = "",column = ""))
    public void addAdmin(Admin admin);

    /**
     * 修改管理员信息
     *
     * @param
     * @return
     * @throws
     * @author pjun
     * @date 2019-04-17 10:57
     */
    @Update("update admin set pwd=#{password},aname=#{name},contact=#{contact},state=#{state},remark=#{remark} where id=#{id}")
    public void updateAdmin(Admin member);

    /**
     * 删除一个管理员
     *
     * @param adminId 管理员id
     * @return
     * @throws
     * @author pjun
     * @date 2019-04-17 11:08
     */
    @Delete("delete from admin where id=#{adminId}")
    public void deleteAdmin(@Param("adminId") int adminId);

    /**
     * 获得所有管理员信息
     *
     * @param
     * @return List<Admin>管理员集合
     * @throws
     * @author pjun
     * @date 2019-04-17 11:10
     */
    @Select("select * from admin")
    public List<Admin> selectAdmins();

    /**
     * 获得一个管理员信息
     *
     * @param
     * @return List<Admin>管理员集合
     * @throws
     * @author pjun
     * @date 2019-04-17 11:10
     */
    @Select("select * from admin where id=#{adminId}")
    public Admin selectAdmin(@Param("adminId") int adminId);

    /**
     * 添加一条通知
     *
     * @param notice
     * @return
     * @throws
     * @author pjun
     * @date 2019-04-17 13:54
     */
    @Insert("insert into notice(type,content,member,remark) values(#{type},#{content},#{member},#{remark})")
    public void addNotice(Notice notice);

    /**
     * 修改通知内容
     *
     * @param notice
     * @return
     * @throws
     * @author pjun
     * @date 2019-04-17 13:56
     */
    @Update("update notice set type=#{type},content=#{content},member=#{member},remark=#{remark}")
    public void updateNotice(Notice notice);

    /**
     * 根据id删除一条通知
     *
     * @param
     * @return
     * @throws
     * @author pjun
     * @date 2019-04-17 14:06
     */
    @Delete("delete from notice where id=#{noticeId}")
    public void deleteNotice(@Param("noticeId") int noticeId);

    /**
     * 根据筛选条件获得通知集合
     *
     * @param notice
     * @return List<Notice>
     * @throws
     * @author pjun
     * @date 2019-04-17 14:22
     */
    @SelectProvider(method = "selectNotices", type = SystemMapperProvider.class)
    public List<Notice> selectNotices(Notice notice);

    /**
     * 据筛选条件获得通知集合的数量
     *
     * @param notice
     * @return int
     * @throws
     * @author pjun
     * @date 2019-04-17 14:39
     */
    @SelectProvider(method = "selectNoticesCount", type = SystemMapperProvider.class)
    public int selectNoticesCount(Notice notice);

    /**
     * 根据id查询一个通知
     *
     * @param noticeId
     * @return Notice
     * @throws
     * @author pjun
     * @date 2019-04-17 14:23
     */
    @Select("select * from notice where id=#{noticeId}")
    public Notice selectNotice(@Param("noticeId") int noticeId);

    /**
     * 添加一条日志
     *
     * @param logger
     * @return
     * @throws
     * @author pjun
     * @date 2019-04-17 14:25
     */
    @Insert("insert into logger(type,module,operater) values(#{type},#{module},#{operater})")
    public void insertLogger(Logger logger);

    /**
     * 根据id查询一条日志
     *
     * @param loggerId
     * @return Logger
     * @throws
     * @author pjun
     * @date 2019-04-17 14:29
     */
    @Select("select * from logger where id=#{loggerId}")
    public Logger selectLogger(@Param("loggerId") int loggerId);

    /**
     * 据筛选条件获得日志集合的数量
     *
     * @param logger
     * @return int
     * @throws
     * @author pjun
     * @date 2019-04-17 14:36
     */
    @SelectProvider(method = "selectloggersCount", type = SystemMapperProvider.class)
    public int selectloggersCount(Logger logger);

    /**
     * 根据起始结束时间和操作员名称查询符合条件的所有日志
     *
     * @param
     * @return List<Logger>
     * @throws
     * @author pjun
     * @date 2019-04-17 14:41
     */
   @SelectProvider(method = "selectLoggers",type =SystemMapperProvider.class )
    public List<Logger> selectLoggers(Map<String,Object> map);
}
