package com.newer.gym.bean;

/**
* @Description:    管理员类
* @Author:         HiFiYi
* @CreateDate:     2019/4/16 14:38
*/
public class Admin {
    private int id;         // 管理员编号
    private String password;  // 密码
    private String name;    // 名称
    private String contact;   // 联系方式
    private int state;      // 状态
    private String remark;  // 备注

    public int getId() {
        return id;
    }

    public Admin() {
        super();
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", password=" + password +
                ", name='" + name + '\'' +
                ", contact=" + contact +
                ", state=" + state +
                ", remark='" + remark + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Admin(int id, String password, String name, String contact, int state, String remark) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.contact = contact;
        this.state = state;
        this.remark = remark;
    }
    public Admin( String password, String name, String contact, int state, String remark) {
        this.password = password;
        this.name = name;
        this.contact = contact;
        this.state = state;
        this.remark = remark;
    }

}
