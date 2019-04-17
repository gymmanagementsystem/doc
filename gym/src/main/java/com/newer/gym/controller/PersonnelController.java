package com.newer.gym.controller;

import com.newer.gym.bean.Department;
import com.newer.gym.bean.Staff;
import com.newer.gym.repository.PersonnelMapper;
import com.newer.gym.service.PersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
* @Description:    人事控制器    为外部服务器提供数据交互接口
* @Author:         HiFiYi
* @CreateDate:     2019/4/17 15:20
*/
@Controller("/personenel/1")
public class PersonnelController{

    @Autowired
    PersonnelService personnelService;

    public void addStaff(Staff staff) {
        personnelService.addStaff(staff);
    }


    public void editorStaff(Staff staff) {
        personnelService.editorStaff(staff);
    }


    public void removeStaff(int staffId) {
        personnelService.removeStaff(staffId);
    }


    public List<Staff> getStaffs(Staff staff, int currentPage, int pageSize) {
        return personnelService.getStaffs(staff,currentPage,pageSize);
    }


    public Staff getStaff(int staffId) {
        return personnelService.getStaff(staffId);
    }


    public void addDepartment(Department department) {
        personnelService.addDepartment(department);
    }

    public void editorDepartment(Department department) {
        personnelService.editorDepartment(department);
    }


    public void removeDepartment(int departmentId) {
        personnelService.removeDepartment(departmentId);
    }


    public List<Department> getDepartments(Department department, int currentPage, int pageSize) {
        return personnelService.getDepartments(department,currentPage,pageSize);
    }


    public Department getDepartment(int departmentId) {
        return personnelService.getDepartment(departmentId);
    }
}
