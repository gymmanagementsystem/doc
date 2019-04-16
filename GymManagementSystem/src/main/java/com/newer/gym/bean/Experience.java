package com.newer.gym.bean;

import java.util.Date;

/**
* @Description:    体验类
* @Author:         HiFiYi
* @CreateDate:     2019/4/16 14:16
*/
public class Experience {
    private int id;         // 体验编号
    private String name;    // 体验者名字
    private String contact; // 联系方式
    private String address; // 联系地址
    private int sex;        // 性别
    private Date time;      // 到店时间
    private String remark;  // 备注

    @Override
    public String toString() {
        return "Experience{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                ", address='" + address + '\'' +
                ", sex=" + sex +
                ", time=" + time +
                ", remark='" + remark + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public Experience() {
        super();
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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Experience(int id, String name, String contact, String address, int sex, Date time, String remark) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.address = address;
        this.sex = sex;
        this.time = time;
        this.remark = remark;
    }
}
