package com.newer.gym.bean;

import com.newer.gym.bean.Department;

/**
* @Description:    员工业绩
* @Author:         HiFiYi
* @CreateDate:     2019/4/23 14:14
*/
public class QueryVo {
    int id;     //员工id
    String name;    //员工姓名
    Department department;  //员工部门
    double achievement;     //业绩额

    @Override
    public String toString() {
        return "StaffAchievement{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department=" + department +
                ", achievement=" + achievement +
                '}';
    }

    public QueryVo() {
        super();
    }

    public int getId() {
        return id;
    }

    public QueryVo(int id, String name, Department department, double achievement) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.achievement = achievement;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public double getAchievement() {
        return achievement;
    }

    public void setAchievement(double achievement) {
        this.achievement = achievement;
    }
}
