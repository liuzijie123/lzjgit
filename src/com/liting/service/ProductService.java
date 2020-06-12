package com.liting.service;

import com.liting.dao.Imp.ProductDaoImp;
import com.liting.domain.Products;
import com.liting.util.PageBean;

import java.util.List;

public class ProductService {
    private ProductDaoImp productDaoImp = new ProductDaoImp();

    public PageBean findcategory(String category, Integer pageSize, Integer currPage) {
        List<Products> findcategory = null;
        int count = 0;
        try {
            findcategory = productDaoImp.findcategory(category, pageSize, currPage);
            count = productDaoImp.findAllCount(category);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new PageBean(findcategory, currPage, pageSize, count);
    }


    public List<Products> findAll(Integer currPage, Integer pageSize) throws Exception {
        return productDaoImp.findAll(currPage, pageSize);
    }


    public PageBean<Products> findProductByName(String name, Integer pageSize, Integer currPage) {
        List<Products> productByName = null;
        int count = 0;
        try {
            productByName = productDaoImp.findProductByName(name, pageSize, currPage);
            count = productDaoImp.findAllCount(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new PageBean<Products>(productByName, currPage, pageSize, count);
    }

    public Products findProductById(Integer id) {
        Products products = null;
        try {
            products = productDaoImp.findProductById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }

    public Products findProductByIds(String id) {
        Products products = null;
        try {
            products = productDaoImp.findProductByIds(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }


    public Products changNums(String id) {
        Products products = null;
        try {
            products = productDaoImp.changNums(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }

    public void updatepnum(String id, Integer num, Integer totalNum) {
        try {
            productDaoImp.updatepnum(id, num, totalNum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean addToCart(String[] booksId, int userid) {

        return false;
    }

}
