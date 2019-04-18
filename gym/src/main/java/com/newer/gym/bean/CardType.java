package com.newer.gym.bean;
/**
 * @Author:        XiaoYongJun
 * @CreateDate:   2019-04-09 10:58
 * @Description:  会员卡类型实体
 */
public class CardType {
    private int id;        //会员卡类型编号 int
    private String name;   // 会员卡类型名称varchar
    private double price; //会员卡价格	double
    private String remark; //会员卡备注	text
    
    public CardType() {
    }

    public CardType(int id, String name, double price, String remark) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "CardType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
