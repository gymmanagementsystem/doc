package com.newer.gym.bean;

import java.util.Date;

/**
* @Description:    课程类
* @Author:         HiFiYi
* @CreateDate:     2019/4/16 13:57
*/
public class Course {
    private int id;             // 编号
    private String position;    // 具体的上课地点
    private String classTime;   // 具体的上课时间
    private Date startTime;     // 开始上课的时间
    private Date endTime;       // 结束上课的时间
    private Staff coach;        // 上这门课的教练
    private String remark;      // 备注

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getClassTime() {
        return classTime;
    }

    public void setClassTime(String classTime) {
        this.classTime = classTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Staff getCoach() {
        return coach;
    }

    public void setCoach(Staff coach) {
        this.coach = coach;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Course(int id, String position, String classTime, Date startTime, Date endTime, Staff coach, String remark) {
        this.id = id;
        this.position = position;
        this.classTime = classTime;
        this.startTime = startTime;
        this.endTime = endTime;
        this.coach = coach;
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", position='" + position + '\'' +
                ", classTime='" + classTime + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", coach=" + coach +
                ", remark='" + remark + '\'' +
                '}';
    }

    public Course() {
        super();
    }
}
