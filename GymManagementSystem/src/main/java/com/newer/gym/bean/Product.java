package com.newer.gym.bean;

/**
* @Description:    商品类
* @Author:         HiFiYi
* @CreateDate:     2019/4/16 14:11
*/
public class Product {
    private int id;         // 商品编号
    private String name;    // 商品名称
    private String images;  // 商品图片
    private double price;   // 商品价格
    private int quantity;   // 商品库存
    private Category category;  //商品类别
    private String remark;      // 备注

    public Product() {
        super();
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", images='" + images + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", category=" + category +
                ", remark='" + remark + '\'' +
                '}';
    }

    public Product(int id, String name, String images, double price, int quantity, Category category, String remark) {
        this.id = id;
        this.name = name;
        this.images = images;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.remark = remark;
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

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
