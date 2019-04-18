package com.newer.gym.service.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.newer.gym.bean.Admin;
import com.newer.gym.bean.Logger;
import com.newer.gym.bean.Notice;
import com.newer.gym.bean.PageBean;
import com.newer.gym.repository.SystemMapper;
import com.newer.gym.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SystemServiceImpl implements SystemService {
    @Autowired
    SystemMapper systemMapper;
    private int loggersCount;


    @Override
    public void addAdmin(Admin admin) {
        systemMapper.addAdmin(admin);
    }

    @Override
    public void updateAdmin(Admin admin) {
        systemMapper.updateAdmin(admin);
    }

    @Override
    public void removeAdmin(int adminId) {
        systemMapper.deleteAdmin(adminId);
    }

    @Override
    public List<Admin> getAdmins() {
        List<Admin> adminList = systemMapper.selectAdmins();
        return adminList;
    }

    @Override
    public Admin getAdmin(int adminId) {
        Admin admin = systemMapper.selectAdmin(adminId);
        return admin;
    }

    @Override
    public void addNotice(int type, String content, int member, String remark) {
        systemMapper.addNotice(type, content, member, remark);
    }

    @Override
    public void editorNotice(int id, int type, String content, int member, String remark) {
        systemMapper.updateNotice(id, type, content, member, remark);
    }

    @Override
    public void removeNotice(int noticeId) {
        systemMapper.deleteNotice(noticeId);
    }

    @Override
    public List<Notice> getNotices(String date, String type, int currentPage, int pageSize) {
        return null;
    }

    @Override
    public Notice getNotice(int noticeId) {
        Notice notice = systemMapper.selectNotice(noticeId);
        return notice;
    }

    @Override
    public void addLogger(Logger logger) {
        systemMapper.insertLogger(logger);
    }

    @Override
    public Logger getLogger(int loggerId) {
        Logger logger = systemMapper.selectLogger(loggerId);
        return logger;
    }

    @Override
    public List<Logger> getLoggers(String begin, String finish, String adminName, int currentPage, int pageSize) {
        PageHelper.startPage(currentPage,pageSize);//将当前页，页面大小传入
        Map<String, Object> map = new HashMap<>();//筛选条件
        map.put("begin", begin);
        map.put("finish", finish);
        map.put("adminName", adminName);
        List<Logger> loggerList = systemMapper.selectLoggers(map);//调用mappr陈获得日志集合
        int loggersCount = systemMapper.selectLoggersCount(map);//调用mapper层日志集合数量
        PageBean<Logger> pg=new PageBean<Logger>(currentPage,pageSize,loggersCount);
        pg.setItems(loggerList);//将集合set给Items
        return pg.getItems();//取出返回
    }
}
