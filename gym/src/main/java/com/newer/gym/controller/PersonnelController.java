package com.newer.gym.controller;

import com.newer.gym.bean.Department;
import com.newer.gym.bean.Staff;
import com.newer.gym.service.PersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
* @Description:    人事控制器    为外部服务器提供数据交互接口
* @Author:         HiFiYi
* @CreateDate:     2019/4/17 15:20
*/
@RestController
@CrossOrigin
public class PersonnelController{

    @Autowired
    PersonnelService personnelService;
    @GetMapping("/personnel/addStaff")
    public void addStaff(@RequestBody Staff staff) {
        personnelService.addStaff(staff);
    }

    @GetMapping("/personnel/editorStaff")
    public void editorStaff(@RequestBody Staff staff) {
        personnelService.editorStaff(staff);
    }

    @GetMapping("/personnel/removeStaff")
    public void removeStaff(int staffId) {
        personnelService.removeStaff(staffId);
    }

    @GetMapping("/personnel/getStaffs")
    public List<Staff> getStaffs(@RequestBody Staff staff, int currentPage, int pageSize) {
        return personnelService.getStaffs(staff,currentPage,pageSize);
    }

    @GetMapping("/personnel/getStaff")
    public Staff getStaff(int staffId) {
        return personnelService.getStaff(staffId);
    }

    @GetMapping("/personnel/addDepartment")
    public void addDepartment(@RequestBody Department department) {
        personnelService.addDepartment(department);
    }
    @GetMapping("/personnel/editorDepartment")
    public void editorDepartment(@RequestBody Department department) {
        personnelService.editorDepartment(department);
    }

    @GetMapping("/personnel/removeDepartment")
    public void removeDepartment(int departmentId) {
        personnelService.removeDepartment(departmentId);
    }

    @GetMapping("/personnel/getDepartments")
    public List<Department> getDepartments() {
        return personnelService.getDepartments();
    }

    @GetMapping("/personnel/getDepartment")
    public Department getDepartment(int departmentId) {
        return personnelService.getDepartment(departmentId);
    }
}
