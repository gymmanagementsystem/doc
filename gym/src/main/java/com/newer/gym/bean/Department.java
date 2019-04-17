package com.newer.gym.bean;

import java.util.List;

/**
 * @Author:        XiaoYongJun
 * @CreateDate:   2019-04-09 11:08
 * @Description:  部门实体类
 */
public class Department {
    private int id;      //部门id	int
    private String 	name; //部门名称 varchar
    private String info; //部门信息 text
    private List<Staff> staffs;     //部门下的所有员工
    private String remark;      //备注
    public Department() {
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public Department(int id, String name, String info, List<Staff> staffs, String remark) {
        this.id = id;
        this.name = name;
        this.info = info;
        this.staffs = staffs;
        this.remark = remark;
    }

    public int getId() {
        return id;
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

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public List<Staff> getStaffs() {
        return staffs;
    }

    public void setStaffs(List<Staff> staffs) {
        this.staffs = staffs;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
