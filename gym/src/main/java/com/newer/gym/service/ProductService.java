package com.newer.gym.service;

import com.newer.gym.bean.Category;
import com.newer.gym.bean.Product;

import java.util.List;

/**
* @Description:    商品数据服务接口
* @Author:         HiFiYi
* @CreateDate:     2019/4/17 14:36
*/
public interface ProductService {

    void addProduct(Product product);


    void editorProduct (Product product);


    void removeProduct (int productId);


    List<Product> getProducts(Product product, int currentPage, int pageSize);


    Product getProduct (int productId);


    void addCategory(Category category);


    void editorCategory (Category category);


    void removeCategory (int categoryId);


    List<Category> getCategorys (Category category,int currentPage,int pageSize);


    Category getCategory (int categoryId);

}
