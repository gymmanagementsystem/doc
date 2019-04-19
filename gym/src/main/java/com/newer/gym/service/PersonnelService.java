package com.newer.gym.service;

import com.newer.gym.bean.Department;
import com.newer.gym.bean.Staff;

import java.util.List;

/**
* @Description:    人事数据服务接口
* @Author:         HiFiYi
* @CreateDate:     2019/4/17 14:33
*/

public interface PersonnelService {
    void addStaff (Staff staff);


    void editorStaff (Staff staff);


    void removeStaff (int staffId);


    List<Staff> getStaffs (Staff staff, int currentPage, int pageSize);


    Staff getStaff (int staffId);


    void addDepartment (Department department);


    void editorDepartment(Department department);


    void removeDepartment(int departmentId);


    List<Department> getDepartments();


    Department getDepartment (int departmentId);




























}
