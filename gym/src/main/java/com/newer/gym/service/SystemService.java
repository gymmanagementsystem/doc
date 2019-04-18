package com.newer.gym.service;

import com.newer.gym.bean.Admin;
import com.newer.gym.bean.Logger;
import com.newer.gym.bean.Notice;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SystemService {
    /**
     * 添加一个管理员
     *
     * @param admin
     * @return
     * @throws
     * @author pjun
     * @date 2019-04-18 14:33
     */
    public void addAdmin(Admin admin);

    /**
     * 修改管理员信息
     *
     * @param admin
     * @return
     * @throws
     * @author pjun
     * @date 2019-04-18 14:33
     */
    public void updateAdmin(Admin admin);

    /**
     * 删除一个管理员
     *
     * @param adminId
     * @return
     * @throws
     * @author pjun
     * @date 2019-04-18 14:34
     */
    public void removeAdmin(int adminId);

    /**
     * 显示多个管理员
     *
     * @param
     * @return
     * @throws
     * @author pjun
     * @date 2019-04-18 14:35
     */
    public List<Admin> getAdmins();

    /**
     * 根据id获得该管理员信息
     *
     * @param adminId
     * @return
     * @throws
     * @author pjun
     * @date 2019-04-18 14:37
     */
    public Admin getAdmin(int adminId);

    /**
     * 添加一条通知
     *
     * @param type，content，member，remark
     * @return
     * @throws
     * @author pjun
     * @date 2019-04-18 14:42
     */
    public void addNotice(int type, String content, int member, String remark);

    /**
     * 根据id修改一条通知内容
     *
     * @param id 通知id，type 类型，content，member 会员卡号，remark 备注
     * @return
     * @throws
     * @author pjun
     * @date 2019-04-18 14:43
     */
    public void editorNotice(int id, int type, String content, int member, String remark);

    /**
     * 根据id删除一条通知
     *
     * @param noticeId 通知id
     * @return
     * @throws
     * @author pjun
     * @date 2019-04-18 14:44
     */
    public void removeNotice(int noticeId);

    /**
     * 根据时间和类型条件筛选出符合条件的通知，再以分页显示
     *
     * @param date 时间,type 类型，currentPage 当前页面，pageSize 页面大小
     * @return
     * @throws
     * @author pjun
     * @date 2019-04-18 14:46
     */
    public List<Notice> getNotices(String date, String type, int currentPage, int pageSize);

    /**
     * 根据id获得一条通知信息
     *
     * @param noticeId 通知id
     * @return
     * @throws
     * @author pjun
     * @date 2019-04-18 14:54
     */
    public Notice getNotice(int noticeId);

    /**
     * 添加一条日志
     *
     * @param logger 日志实体
     * @return
     * @throws
     * @author pjun
     * @date 2019-04-18 14:55
     */
    public void addLogger(Logger logger);

    /**
     * 根据id获得一条日志内容
     *
     * @param loggerId
     * @return
     * @throws
     * @author pjun
     * @date 2019-04-18 14:56
     */
    public Logger getLogger(int loggerId);

    /**
     * 根据起始时间和操作人名称条件得到符合条件的日志集合，以分页显示
     *
     * @param begin 开始时间,finish 结束时间，adminName 操作人员名称，currentPage 当前页，pageSize 页面大小
     * @return
     * @throws
     * @author pjun
     * @date 2019-04-18 14:57
     */
    public List<Logger> getLoggers(String begin, String finish, String adminName, int currentPage, int pageSize);

}
