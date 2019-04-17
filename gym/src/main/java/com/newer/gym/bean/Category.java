package com.newer.gym.bean;

import java.util.List;

/**
* @Description:    商品别类
* @Author:         HiFiYi
* @CreateDate:     2019/4/16 14:14
*/
public class Category {
    private int id;         // 商品类别编号
    private String name;    // 商品类别名称
    private String info;    // 商品介绍信息
    private List<Product> products;     // 该类别下所有商品
    private String remark;  // 备注

    public int getId() {
        return id;
    }

    public Category(int id, String name, String info, List<Product> products, String remark) {
        this.id = id;
        this.name = name;
        this.info = info;
        this.products = products;
        this.remark = remark;
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

    public String getInfo() {
        return info;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", info='" + info + '\'' +
                ", products=" + products +
                ", remark='" + remark + '\'' +
                '}';
    }

    public Category() {
        super();
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
