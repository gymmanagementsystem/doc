package com.newer.gym.service.serviceImpl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.newer.gym.bean.Department;
import com.newer.gym.bean.PageBean;
import com.newer.gym.bean.Staff;
import com.newer.gym.repository.PersonnelMapper;
import com.newer.gym.service.PersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description: 人事数据服务实现类
 * @Author: HiFiYi
 * @CreateDate: 2019/4/17 15:03
 */
@Service
public class PersonnelServiceImpl implements PersonnelService {
    @Autowired
    PersonnelMapper personnelMapper;

    @Override
    public void addStaff(Staff staff) {
        personnelMapper.insertStaff(staff);
    }

    @Override
    public void editorStaff(Staff staff) {
        personnelMapper.updateStaff(staff);
    }

    @Override
    public void removeStaff(int staffId) {
        personnelMapper.deleteStaff(staffId);
    }

    @Override
    public PageBean<Staff> getStaffs(Map<String, Object> map, int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        if(map==null) map=new HashMap<>();
        List<Staff> list = personnelMapper.selectStaffs(map);
        int staffCount = personnelMapper.selectStaffsCount(map);
        PageBean<Staff> pg = new PageBean<Staff>(currentPage, pageSize, staffCount);
        pg.setItems(list);
        return pg;

    }

    @Override
    public Staff getStaff(int staffId) {
        return personnelMapper.selectStaff(staffId);
    }

    @Override
    public List<Staff> getStaffsByDepartmentId(int departmentId) {
        return personnelMapper.selectStaffsByDepartmentId(departmentId);
    }

    @Override
    public void addDepartment(Department department) {
        personnelMapper.insertDepartment(department);
    }

    @Override
    public void editorDepartment(Department department) {
        personnelMapper.updateDepartment(department);
    }

    @Override
    public void removeDepartment(int departmentId) {
        personnelMapper.deleteDepartment(departmentId);
    }

    @Override
    public List<Department> getDepartments() {
        List<Department> list = personnelMapper.selectDepartments();
        for (Department d : list
        ) {
            d.setStaffs(personnelMapper.selectStaffsByDepartmentId(d.getId()));
        }
        return list;
    }

    @Override
    public Department getDepartment(int departmentId) {
        return personnelMapper.selectDepartment(departmentId);
    }
}
