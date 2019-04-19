package com.newer.gym.service.serviceImpl;

import com.newer.gym.bean.Department;
import com.newer.gym.bean.Staff;
import com.newer.gym.repository.PersonnelMapper;
import com.newer.gym.service.PersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
* @Description:    人事数据服务实现类
* @Author:         HiFiYi
* @CreateDate:     2019/4/17 15:03
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
    public List<Staff> getStaffs(Staff staff, int currentPage, int pageSize) {
        return null;
    }

    @Override
    public Staff getStaff(int staffId) {
        return personnelMapper.selectStaff(staffId);
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
        List<Department> list=personnelMapper.selectDepartments();
        for (Department d:list
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
