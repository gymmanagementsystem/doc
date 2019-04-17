package com.newer.gym.bean;
/**
 * @Author:        XiaoYongJun
 * @CreateDate:   2019-04-09 11:08
 * @Description:  部门实体类
 */
public class Department {
    private int department_id;      //部门id	int
    private String 	department_name; //部门名称 varchar
    private String department_info; //部门信息 text

    public Department() {
    }

    public Department(int department_id, String department_name, String department_info) {
        this.department_id = department_id;
        this.department_name = department_name;
        this.department_info = department_info;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public String getDepartment_info() {
        return department_info;
    }

    public void setDepartment_info(String department_info) {
        this.department_info = department_info;
    }

    @Override
    public String toString() {
        return "Department{" +
                "department_id=" + department_id +
                ", department_name='" + department_name + '\'' +
                ", department_info='" + department_info + '\'' +
                '}';
    }
}
