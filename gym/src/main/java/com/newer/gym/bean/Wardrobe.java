package com.newer.gym.bean;

import java.util.Date;

/**
* @Description:    衣柜类--存放物品的工具
* @Author:         HiFiYi
* @CreateDate:     2019/4/16 14:06
*/
public class Wardrobe {
    private int id;             // 编号
    private int state;          // 使用状态 0、未使用 1、正在使用
    private Member member;      // 使用该衣柜的会员
    private double cost;        // 费用
    private String position;    // 衣柜所在的位置
    private String remark;      // 备注

    @Override
    public String toString() {
        return "Wardrobe{" +
                "id=" + id +
                ", state=" + state +
                ", member=" + member +
                ", cost=" + cost +
                ", position='" + position + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }

    public Wardrobe() {
        super();
    }

    public Wardrobe(int id, int state, Member member,  double cost, String position, String remark) {
        this.id = id;
        this.state = state;
        this.member = member;
        this.cost = cost;
        this.position = position;
        this.remark = remark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
