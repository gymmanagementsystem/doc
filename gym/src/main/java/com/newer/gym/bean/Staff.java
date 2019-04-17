package com.newer.gym.bean;

import java.util.Date;

/**
 * @Author:        XiaoYongJun
 * @CreateDate:   2019-04-09 11:22
 * @Description:  员工表实体类
 */
public class Staff {
    private int staff_id;       //员工id	staff_id int
    private String staff_anme;  //员工姓名	staff_anme	varchar
    private String staff_sex;   //员工性别	staff_sex	char
    private Date staff_birthday;//员工生日	staff_birthday	date
    private Date staff_time;    //入职时间	staff_time	date
    private String staff_addres ;//地址	staff_addres	varchar
    private String staff_job;     //员工职位	staff_job	varchar
    private String staff_phone;  //联系方式	staff_phone	char
    private Department department;//所属部门id	department_id	int

    public Staff() {
    }

    public Staff(int staff_id, String staff_anme, String staff_sex, Date staff_birthday, Date staff_time,
                 String staff_addres, String staff_job, String staff_phone, Department department) {
        this.staff_id = staff_id;
        this.staff_anme = staff_anme;
        this.staff_sex = staff_sex;
        this.staff_birthday = staff_birthday;
        this.staff_time = staff_time;
        this.staff_addres = staff_addres;
        this.staff_job = staff_job;
        this.staff_phone = staff_phone;
        this.department = department;
    }

    public int getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
    }

    public String getStaff_anme() {
        return staff_anme;
    }

    public void setStaff_anme(String staff_anme) {
        this.staff_anme = staff_anme;
    }

    public String getStaff_sex() {
        return staff_sex;
    }

    public void setStaff_sex(String staff_sex) {
        this.staff_sex = staff_sex;
    }

    public Date getStaff_birthday() {
        return staff_birthday;
    }

    public void setStaff_birthday(Date staff_birthday) {
        this.staff_birthday = staff_birthday;
    }

    public Date getStaff_time() {
        return staff_time;
    }

    public void setStaff_time(Date staff_time) {
        this.staff_time = staff_time;
    }

    public String getStaff_addres() {
        return staff_addres;
    }

    public void setStaff_addres(String staff_addres) {
        this.staff_addres = staff_addres;
    }

    public String getStaff_job() {
        return staff_job;
    }

    public void setStaff_job(String staff_job) {
        this.staff_job = staff_job;
    }

    public String getStaff_phone() {
        return staff_phone;
    }

    public void setStaff_phone(String staff_phone) {
        this.staff_phone = staff_phone;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staff_id=" + staff_id +
                ", staff_anme='" + staff_anme + '\'' +
                ", staff_sex='" + staff_sex + '\'' +
                ", staff_birthday=" + staff_birthday +
                ", staff_time=" + staff_time +
                ", staff_addres='" + staff_addres + '\'' +
                ", staff_job='" + staff_job + '\'' +
                ", staff_phone='" + staff_phone + '\'' +
                ", department=" + department +
                '}';
    }
}