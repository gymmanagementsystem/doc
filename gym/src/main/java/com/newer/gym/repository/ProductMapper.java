package com.newer.gym.repository;

import com.newer.gym.bean.Category;
import com.newer.gym.bean.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
* @Description:    商品数据操作接口
* @Author:         HiFiYi
* @CreateDate:     2019/4/17 14:08
*/
@Mapper
public interface ProductMapper {
    /**
    * 方法实现说明        添加一条商品信息
    * @author      HiFiYi
    * @date        2019/4/17 14:12
    */
    @Insert("insert into product(name,images,price,quantity,category_id,remark) " +
            "values (#{name},#{images},#{price},#{quantity},#{category.id},#{remark})")
    void insertProduct(Product product);

    /**
     * 方法实现说明   更新一条商品信息
     * @author      HiFiYi
     * @date        2019/4/17 14:12
     */
    @Update("update product set name=#{name},images=#{images},price=#{price}," +
            "quantity=#{quantity},category_id=#{category.id},remark=#{remark} where id=#{id}")
    void updateProduct (Product product);

    /**
     * 方法实现说明   删除一条商品信息
     * @author      HiFiYi
     * @date        2019/4/17 14:12
     */
    @Delete("delete from product where id =#{id}")
    void deleteProduct (@Param("id") int productId);

    /**
     * 方法实现说明
     * @author      HiFiYi
     * @return
     * @date        2019/4/17 14:14
     */
    @Select("select * from product")
    @Results({@Result(column ="category_id",property = "category",one = @One(select = "selectCategory"))})
    List<Product> selectProducts();

    @Select("select count(*) from product")
    int selectProductCount();

    @Select("select count(*) from product where category_id=#{id}")
    int selectProductCountByCategory(@Param("id") int category_id);
    /**
     * 方法实现说明
     * @author      HiFiYi
     * @return      一条商品信息
     * @date        2019/4/17 14:14
     */
    @Select("select * from product where id=#{id}")
    @Results({@Result(column ="category_id",property = "category",one = @One(select = "selectCategory"))})
    Product selectProduct (int productId);

    /**
     * 方法实现说明   添加一条商品分类信息
     * @author      HiFiYi
     * @date        2019/4/17 14:12
     */
    @Insert("insert into category(name,info,remark) values (#{name},#{info},#{remark})")
    void insertCategory(Category category);

    /**
     * 方法实现说明   更新一条商品分类信息
     * @author      HiFiYi
     * @date        2019/4/17 14:12
     */
    @Update("update category set name=#{name},info=#{info},remark=#{remark} where id=#{id}")
    void updateCategory (Category category);

    /**
     * 方法实现说明   删除一条商品分类信息
     * @author      HiFiYi
     * @date        2019/4/17 14:12
     */
    @Delete("delete from category where id=#{id}")
    void deleteCategory (@Param("id") int categoryId);

    /**
    * 方法实现说明
    * @author      HiFiYi
    * @return
    * @date        2019/4/17 14:14
    */
    @Select("select * from category")
    List<Category> selectCategorys ();

    /**
     * 方法实现说明
     * @author      HiFiYi
     * @return
     * @date        2019/4/17 14:14
     */
    @Select("select * from category where id =#{id}")
    Category selectCategory (@Param("id") int categoryId);

    @Select("select * from product where category_id=#{id}")
    @Results(@Result(column = "category_id",property = "category",one = @One(select = "selectCategory")))
    List<Product> selectProductByCategoryId(@Param("id") int id);






}
