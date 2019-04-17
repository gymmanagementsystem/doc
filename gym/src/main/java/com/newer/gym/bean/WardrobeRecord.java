package com.newer.gym.bean;

import java.sql.Date;

/**
 * @Description:    衣柜使用记录实体类
 * @Author:         HiFiYi
 * @CreateDate:     2019/4/16 15:03
 */

public class WardrobeRecord {
    private int id;//使用记录编号id
    private Member member;//会员
    private double cost;//费用
    private Date quantity;//使用时间
    private int state;//使用状态
    private String remark;//备注

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getQuantity() {
        return quantity;
    }

    public void setQuantity(Date quantity) {
        this.quantity = quantity;
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

    public WardrobeRecord(int id, Member member, double cost, Date quantity, int state, String remark) {
        this.id = id;
        this.member = member;
        this.cost = cost;
        this.quantity = quantity;
        this.state = state;
        this.remark = remark;
    }

    public WardrobeRecord() {
        super();
    }

    @Override
    public String toString() {
        return "WardrobeRecord{" +
                "id=" + id +
                ", member=" + member +
                ", cost=" + cost +
                ", quantity=" + quantity +
                ", state=" + state +
                ", remark='" + remark + '\'' +
                '}';
    }
}
