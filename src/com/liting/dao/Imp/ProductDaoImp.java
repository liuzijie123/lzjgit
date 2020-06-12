package com.liting.dao.Imp;

import com.liting.dao.ProductDao;
import com.liting.domain.Products;
import com.liting.util.C3p0;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.util.List;

public class ProductDaoImp implements ProductDao {
    private QueryRunner qr=new QueryRunner(C3p0.getDataSource());


    @Override
    public List<Products> findcategory(String category,Integer pageSize, Integer currPage) throws Exception {
        String sql="SELECT *from products where 1=1 ";
        if (category!=null){
            sql=sql+" and category=? limit ?,?";
        }else {
            sql=sql+"limit ?,?";
            return qr.query(sql,new BeanListHandler<Products>(Products.class),(currPage-1)*pageSize,pageSize);
        }
        return qr.query(sql,new BeanListHandler<Products>(Products.class),category,(currPage-1)*pageSize,pageSize);
    }

    @Override
    public List<Products> findAll(Integer currPage, Integer pageSize) throws Exception {
        String sql="SELECT *from products LIMIT ?,?";
        return qr.query(sql,new BeanListHandler<Products>(Products.class),(currPage-1)*pageSize,pageSize);
    }

    @Override
    public int findAllCount(String category) throws Exception {
        String sql="select count(*) from products where 1=1";
        if (category!=null){
            sql=sql+" and category=?";
        }else {
            return ((Long)qr.query(sql,new ScalarHandler())).intValue();
        }
        return ((Long)qr.query(sql,new ScalarHandler(),category)).intValue();
    }

    @Override
    public List<Products> findProductByName(String name, Integer pageSize, Integer currPage)throws Exception {
        String sql="select *from products where 1=1 ";
        if (name!=null){
            sql=sql+" and name= like '%"+name+"%'";
        }else {
            return qr.query(sql,new BeanListHandler<Products>(Products.class),pageSize,(currPage-1)*pageSize);
        }
        return qr.query(sql,new BeanListHandler<Products>(Products.class),name,pageSize,(currPage-1)*pageSize);
    }

    @Override
    public Products findProductById(Integer id) throws Exception {
        String sql="select *from products where id=?";
        return qr.query(sql,new BeanHandler<Products>(Products.class),id);
    }
    @Override
    public Products findProductByIds(String id) throws Exception {
        String sql="select *from products where id=?";
        return qr.query(sql,new BeanHandler<Products>(Products.class),id);
    }

    @Override
    public boolean findProductByIdandUserId(String[] bookId, Integer id) throws Exception {
        String sql="SELECT *from products p,user u WHERE  p.id =? AND u.id=?";
        qr.query(sql,new BeanHandler<Products>(Products.class),bookId,id);
        return false;
    }

    @Override
    public Products changNums(String id) throws Exception {
        String sql="select *from products where id =?";
        return qr.query(sql,new BeanHandler<Products>(Products.class),id);
    }

    @Override
    public void updatepnum(String id, Integer num, Integer totalNum) throws  Exception{
        String sql ="update products set pnum=? where id=?";
         qr.update(sql,(totalNum-num),id);
    }

}
