package com.newer.gym.controller;

import com.newer.gym.bean.Admin;
import com.newer.gym.service.serviceImpl.SystemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Description: 管理模块控制层
 * @Author: pjun
 * @CreateDate: 2019-04-18 16:28
 */
@RestController
public class SystemController {
    @Autowired
    SystemServiceImpl systemServiceImpl;

    @PostMapping("/admin/1/addAdmin")
    @CrossOrigin
    public void addAdmin(@RequestBody Admin admin) {
        systemServiceImpl.addAdmin(admin);
    }

    @PostMapping("/admin/1/removeAdmin")
    @CrossOrigin
    public void removeAdmin(int adminId) {
        systemServiceImpl.removeAdmin(adminId);
    }
}
