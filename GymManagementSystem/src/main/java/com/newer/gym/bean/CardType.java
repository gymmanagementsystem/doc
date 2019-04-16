package com.newer.gym.bean;
/**
 * @Author:        XiaoYongJun
 * @CreateDate:   2019-04-09 10:58
 * @Description:  会员卡类型实体
 */
public class CardType {
    private int ctype_id;        //会员卡类型编号 int
    private String ctype_name;   // 会员卡类型名称varchar
    private double ctype_price; //会员卡价格	double
    private String ctype_remark; //会员卡备注	text
    
    public CardType() {
    }

    public CardType(int ctype_id, String ctype_name, double ctype_price, String ctype_remark) {
        this.ctype_id = ctype_id;
        this.ctype_name = ctype_name;
        this.ctype_price = ctype_price;
        this.ctype_remark = ctype_remark;
    }

    public int getCtype_id() {
        return ctype_id;
    }

    public void setCtype_id(int ctype_id) {
        this.ctype_id = ctype_id;
    }

    public String getCtype_name() {
        return ctype_name;
    }

    public void setCtype_name(String ctype_name) {
        this.ctype_name = ctype_name;
    }

    public double getCtype_price() {
        return ctype_price;
    }

    public void setCtype_price(double ctype_price) {
        this.ctype_price = ctype_price;
    }

    public String getCtype_remark() {
        return ctype_remark;
    }

    public void setCtype_remark(String ctype_remark) {
        this.ctype_remark = ctype_remark;
    }

    @Override
    public String toString() {
        return "CardType{" +
                "ctype_id=" + ctype_id +
                ", ctype_name='" + ctype_name + '\'' +
                ", ctype_price=" + ctype_price +
                ", ctype_remark='" + ctype_remark + '\'' +
                '}';
    }
}
