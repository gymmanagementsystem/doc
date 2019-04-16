package com.newer.gym.bean;

import java.util.Date;

/**
* @Description:    会员记录消费类
* @Author:         HiFiYi
* @CreateDate:     2019/4/16 13:42
*/
public class MemberExpense {
    private int id;             // 消费记录编号
    private Member member;      // 消费会员
    private Product product;    // 商品信息
    private Course course;      // 课程信息
    private double cost;        // 花费金额
    private int quantity;       // 数量
    private Date time;          // 购买时间
    private String remark;      // 备注

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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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

    public MemberExpense(int id, Member member, Product product, Course course, double cost, int quantity, Date time, String remark) {
        this.id = id;
        this.member = member;
        this.product = product;
        this.course = course;
        this.cost = cost;
        this.quantity = quantity;
        this.time = time;
        this.remark = remark;
    }

    public MemberExpense() {
        super();
    }

    @Override
    public String toString() {
        return "MemberExpense{" +
                "id=" + id +
                ", member=" + member +
                ", product=" + product +
                ", course=" + course +
                ", cost=" + cost +
                ", quantity=" + quantity +
                ", time=" + time +
                ", remark='" + remark + '\'' +
                '}';
    }
}
