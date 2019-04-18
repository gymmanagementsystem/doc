package com.newer.gym.controller;

import com.newer.gym.bean.Category;
import com.newer.gym.bean.Member;
import com.newer.gym.bean.Product;
import com.newer.gym.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
/**
* @Description:    商品控制器    为外部服务器提供数据交互接口
* @Author:         HiFiYi
* @CreateDate:     2019/4/17 15:14
*/
@Controller("/product/1")
public class ProductController {
    @Autowired
    ProductService productService;

    public void addProduct(Product product) {
        productService.addProduct(product);
    }


    public void editorProduct(Product product) {
        productService.editorProduct(product);
    }


    public void removeProduct(int productId) {
        productService.removeProduct(productId);
    }


    public List<Product> getProducts(Product product, int currentPage, int pageSize) {
        return productService.getProducts(product,currentPage,pageSize);
    }


    public Product getProduct(int productId) {
        return productService.getProduct(productId);
    }


    public void addCategory(Category category) {
        productService.addCategory(category);
    }


    public void editorCategory(Category category) {
        productService.editorCategory(category);
    }

    public void removeCategory(int categoryId) {
        productService.removeCategory(categoryId);
    }


    public List<Category> getCategorys() {
        return productService.getCategorys();
    }

    @
    public Category getCategory(int categoryId) {
        return productService.getCategory(categoryId);
    }
}
