package com.newer.gym.controller;

import com.newer.gym.bean.Department;
import com.newer.gym.bean.Member;
import com.newer.gym.bean.PageBean;
import com.newer.gym.bean.Staff;
import com.newer.gym.service.PersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @RequestMapping("/personnel/getStaffs")
    public PageBean<Staff> getStaffs(@RequestParam Map<String, String> map,
                                     @RequestParam(defaultValue = "1") int currentPage ,
                                     @RequestParam(defaultValue = "10")int pageSize) {
        Map<String,Object> map1=new HashMap<>();
        for (String key : map.keySet()) {
            System.out.println(map.get(key)=="");
            map1.put(key,map.get(key).toString());
        }
        return personnelService.getStaffs(map1,currentPage,pageSize);
    }
    @GetMapping("/personnel/getCoachs")
    public List<Staff> getCoachs(){
        return personnelService.getStaffsByDepartmentId(1);
    };

    @GetMapping("/personnel/getCounselors")
    public List<Staff> getCounselors(){
        return personnelService.getStaffsByDepartmentId(3);
    };

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
