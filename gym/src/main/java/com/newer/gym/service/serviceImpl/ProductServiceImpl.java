package com.newer.gym.service.serviceImpl;

import com.newer.gym.bean.Category;
import com.newer.gym.bean.Product;
import com.newer.gym.repository.ProductMapper;
import com.newer.gym.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
* @Description:    商品数据服务实现类
* @Author:         HiFiYi
* @CreateDate:     2019/4/17 15:06
*/
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductMapper productMapper;
    @Override
    public void addProduct(Product product) {
        productMapper.insertProduct(product);
    }

    @Override
    public void editorProduct(Product product) {
        productMapper.updateProduct(product);
    }

    @Override
    public void removeProduct(int productId) {
        productMapper.deleteProduct(productId);
    }

    @Override
    public List<Product> getProducts(Product product, int currentPage, int pageSize) {
        return null;
    }

    @Override
    public Product getProduct(int productId) {
        return productMapper.selectProduct(productId);
    }

    @Override
    public void addCategory(Category category) {
        productMapper.insertCategory(category);
    }

    @Override
    public void editorCategory(Category category) {
        productMapper.updateCategory(category);
    }

    @Override
    public void removeCategory(int categoryId) {
        productMapper.deleteCategory(categoryId);
    }

    @Override
    public List<Category> getCategorys() {
        List<Category> list=productMapper.selectCategorys();
        for (Category c:list){
            c.setProducts(productMapper.selectProductByCategoryId(c.getId()));
        }
        return list;
    }

    @Override
    public Category getCategory(int categoryId) {
        Category category=productMapper.selectCategory(categoryId);
        category.setProducts(productMapper.selectProductByCategoryId(categoryId));
        return category;
    }


}
