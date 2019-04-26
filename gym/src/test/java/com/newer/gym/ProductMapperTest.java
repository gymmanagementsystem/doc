package com.newer.gym;

import com.newer.gym.bean.Category;
import com.newer.gym.bean.Product;
import com.newer.gym.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductMapperTest {
    @Autowired
    ProductService productService;

    @Test   //添加一条商品数据
    public void addProduct( ) {
        Category category=productService.getCategory(2);
        Product product=new Product(1,"蛋白粉","暂无",2,200,category,"无");
        for(int i=0;i<4;i++){
            productService.addProduct(product);
        }
    }

    @Test   //修改一条商品信息
    public void editorProduct( ) {
        Category category=productService.getCategory(3);
        Product product=new Product(2,"哇哈哈矿泉水","暂无",2,200,category,"无");
        productService.editorProduct(product);
    }

    @Test   //删除一条商品信息
    public void removeProduct( ) {
        productService.removeProduct(7);
    }

    @Test
    public void getProducts( ) {
        productService.getProducts(0,1,2);
    }

    @Test   //获得一条商品信息
    public void getProduct( ) {

        System.out.println(productService.getProduct(2));
    }

    @Test   //添加一条商品分类信息
    public void addCategory( ) {
        Category category=new Category(4,"其他","无",null,"无");
        productService.addCategory(category);
    }

    @Test   //修改一条商品分类信息
    public void editorCategory( ) {
        Category category=new Category(4,"balabala","无",null,"无");
        productService.editorCategory(category);
    }

    @Test   //删除一条商品分类信息
    public void removeCategory( ) {
        productService.removeCategory(4);
    }

    @Test   //获得多个商品分类信息
    public void getCategories( ) {
        for (Category c: productService.getCategorys()
             ) {
            System.out.println(c);
        }
    }

    @Test   //获得一条商品分类信息
    public void getCategory( ) {
        System.out.println(productService.getCategory(2));
    }
}
