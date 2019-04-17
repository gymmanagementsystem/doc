package com.newer.gym.bean;

import java.util.List;

/**
* @Description:    用于统计课程有哪些会员购买
* @Author:         HiFiYi
* @CreateDate:     2019/4/16 13:51
*/
public class VipCourse {
    private int id;         // 会员课程的编号
    private List<Member> members;   //有哪些会员购买了该课
    private Course course;          //课程
    private String remark;          //备注信息

    public VipCourse(int id, List<Member> members, Course course, String remark) {
        this.id = id;
        this.members = members;
        this.course = course;
        this.remark = remark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public VipCourse() {
        super();
    }

    @Override
    public String toString() {
        return "VipCourse{" +
                "id=" + id +
                ", members=" + members +
                ", course=" + course +
                ", remark='" + remark + '\'' +
                '}';
    }
}
