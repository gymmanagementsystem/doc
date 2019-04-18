package com.newer.gym;

import com.newer.gym.bean.Department;
import com.newer.gym.bean.Staff;
import com.newer.gym.service.PersonnelService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonnelMapperTest{
    @Autowired
    PersonnelService personnelService;


   @Test        //添加员工  成功
    public void addStaff() {
        List<Department> list =personnelService.getDepartments();
        Staff staff=new Staff(1,"杜海涛",1,new Date(),
                new Date(),"湖南长沙","教练","15586458754",list.get(2),"无");
        personnelService.addStaff(staff);

    }
    @Test   //更新一个员工的信息     成功
    public void editorStaff() {
        List<Department> list =personnelService.getDepartments();
        Staff staff=new Staff(1,"胡歌",1,new Date(),
                new Date(),"湖南长沙","教练","15586458754",list.get(1),"无");
        personnelService.editorStaff(staff);
    }
    @Test   //删除单个员工
    public void removeStaff() {
       personnelService.removeStaff(8);
    }
    @Test
    public void getStaffs(){

    }
    @Test   //获得单个员工的信息  成功
    public void getStaff() {
        Staff staff=personnelService.getStaff(1);
        System.out.println(staff);
    }
    @Test   //添加一个新部门  成功
    public void addDepartment() {
        Department department=new Department(1,"保洁部","保洁部门",null,"无");
        personnelService.addDepartment(department);
    }
    @Test   //修改一个部门的信息 成功
    public void editorDepartment() {
        Department department=new Department(1,"教练部","教练部门",null,"无");
        personnelService.editorDepartment(department);
    }
    @Test   //删除一条部门信息  成功
    public void removeDepartment() {
        personnelService.removeDepartment(5);
    }
    @Test   //获得多个部门信息  成功
    public void getDepartments() {
        List<Department> list =personnelService.getDepartments();
        for (Department d:list
        ) {
            System.out.println(d);
        }
    }
    @Test   //获得单个部门的信息   成功
    public void getDepartment() {
        Department d=personnelService.getDepartment(1);
        System.out.println(d);
    }
}
