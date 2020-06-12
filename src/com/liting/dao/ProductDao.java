package com.liting.dao;

import com.liting.domain.Products;

import java.util.List;

public interface ProductDao {
    /**
     * 根据类别查询进行分页操作,当前页要显示的数据
     */
    public List<Products> findcategory(String category,Integer pageSize, Integer currPage) throws  Exception;

    /**
     * 点击全部商品查询所有
     */
    public List<Products> findAll(Integer currPage, Integer pageSize) throws  Exception;

    /**
     * 查询的总条数
     * @return
     */
    public int findAllCount(String category) throws  Exception;
    /**
     * 模糊查询，根据要查找的书名获取当前的信息
     */
    public  List<Products> findProductByName(String name,Integer pageSize, Integer currPage) throws Exception;
    //查询id返回的是Products对象
    public  Products findProductById(Integer id)throws  Exception;
    //查询id返回的是Products对象
    public Products findProductByIds(String id)throws  Exception;

    //添加到购物车要获取用户的id和商品的id,商品id为string类型，所以定义个string类型的数据组
    public  boolean findProductByIdandUserId(String [] bookId,Integer id)throws  Exception;

    //查询单个图书
    Products changNums(String id)throws  Exception;

    void updatepnum(String id,Integer num ,Integer totalNum) throws  Exception;

}
