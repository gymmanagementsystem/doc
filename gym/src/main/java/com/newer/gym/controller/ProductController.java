package com.newer.gym.controller;

import com.newer.gym.bean.Category;
import com.newer.gym.bean.Member;
import com.newer.gym.bean.PageBean;
import com.newer.gym.bean.Product;
import com.newer.gym.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
* @Description:    商品控制器    为外部服务器提供数据交互接口
* @Author:         HiFiYi
* @CreateDate:     2019/4/17 15:14
*/
@RestController
@CrossOrigin
public class ProductController {
    @Autowired
    ProductService productService;
    @PostMapping("/product/addProduct")
    public void addProduct(@RequestParam Map map) {
        for (Object key : map.keySet()) {
            System.out.println(key + " ：" + map.get(key));
        }
        System.out.println(map.size());


        Product product=null;
       // productService.addProduct(product);
    }


    public void editorProduct(Product product) {
        productService.editorProduct(product);
    }

    @GetMapping("/product/removeProduct")
    public void removeProduct(@RequestParam int productId) {
        productService.removeProduct(productId);
    }

    @GetMapping("/product/getProducts")
    public PageBean<Product> getProducts(@RequestParam(defaultValue = "0") int categoryId, @RequestParam(defaultValue = "1")int currentPage, @RequestParam(defaultValue = "5") int pageSize) {

        return productService.getProducts(categoryId,currentPage,pageSize);
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


    public Category getCategory(int categoryId) {
        return productService.getCategory(categoryId);
    }
}
