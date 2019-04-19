package com.newer.gym.controller;

import com.newer.gym.bean.Admin;
import com.newer.gym.service.serviceImpl.SystemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description: 管理模块控制层
 * @Author: pjun
 * @CreateDate: 2019-04-18 16:28
 */
@RestController
public class SystemController {
    @Autowired
    SystemServiceImpl systemServiceImpl;

    @PostMapping("/admin/addAdmin")
    @CrossOrigin
    public void addAdmin(@RequestBody Admin admin) {
        systemServiceImpl.addAdmin(admin);
    }

    @PostMapping("/admin/removeAdmin")
    @CrossOrigin
    public void removeAdmin(int adminId) {
        systemServiceImpl.removeAdmin(adminId);
    }

    @PostMapping("/admin/editorAdmin")
    @CrossOrigin
    public void editorAdmin(@RequestBody Admin admin) {
        systemServiceImpl.updateAdmin(admin);
    }
    @GetMapping("/admin/getAdmins")
    @CrossOrigin
    public List<Admin> getAdmins(){
        List<Admin> adminList= systemServiceImpl.getAdmins();
        return adminList;
    }
    @GetMapping("/admin/getAdmins")
    @CrossOrigin
    public Admin getAdmin(int adminId){
        Admin admin=  systemServiceImpl.getAdmin(adminId);
        return  admin;
    }
}
