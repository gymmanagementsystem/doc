package com.newer.gym.bean;

import java.util.Date;

/**
 * @Author:        XiaoYongJun
 * @CreateDate:   2019-04-09 11:22
 * @Description:  员工表实体类
 */
public class Staff {
    private int id;       //员工id	staff_id int
    private String name;  //员工姓名	staff_anme	varchar
    private int sex;   //员工性别	staff_sex	char
    private Date birthday;//员工生日	staff_birthday	date
    private Date time;    //入职时间	staff_time	date
    private String address ;//地址	staff_addres	varchar
    private String job;     //员工职位	staff_job	varchar
    private String phone;  //联系方式	staff_phone	char
    private Department department;//所属部门id	department_id	int
    private String remark;      // 备注

    public Staff() {
        super();
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", time=" + time +
                ", address='" + address + '\'' +
                ", job='" + job + '\'' +
                ", phone='" + phone + '\'' +
                ", department=" + department +
                ", remark='" + remark + '\'' +
                '}';
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

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Staff(int id, String name, int sex, Date birthday, Date time, String address, String job, String phone, Department department, String remark) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.time = time;
        this.address = address;
        this.job = job;
        this.phone = phone;
        this.department = department;
        this.remark = remark;
    }
}