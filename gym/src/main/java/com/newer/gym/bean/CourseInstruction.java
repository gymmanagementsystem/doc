package com.newer.gym.bean;

public class CourseInstruction {
    private int id;//课程编号
    private String name;//课程名称
    private int capacity;//课程容纳人数
    private double cost;//课程费用
    private String introduction;//课程介绍
    private String remark;//课程备注

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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public CourseInstruction(int id, String name, int capacity, double cost, String introduction, String remark) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.cost = cost;
        this.introduction = introduction;
        this.remark = remark;
    }

    public CourseInstruction() {
        super();
    }

    @Override
    public String toString() {
        return "CourseInstruction{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", capacity=" + capacity +
                ", cost=" + cost +
                ", introduction='" + introduction + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
