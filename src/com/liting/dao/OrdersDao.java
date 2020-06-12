package com.liting.dao;

import com.liting.domain.Orderitem;
import com.liting.domain.Orders;
import com.liting.domain.Products;

import java.sql.SQLException;
import java.util.List;

public interface OrdersDao {

    //生成的订单
    public void  createOrders(Orders order)throws  Exception;

    //查看订单的详情
    public  void  checkOrders(Orderitem orderitem) throws Exception;

    //修改支付的状态
    public  void  updatepaystate(String id,int paystate) throws  Exception;

    //显示当前用户的所有订单,一个用户有多个订单，一个订单只能由一个用户创建
    public List<Orders>  ShowAllOrders(String user_id) throws Exception;

    //查看订单的详情
    List<Orders> ShowAllOrdersInfo(String id)throws Exception;

    //通过id删除订单
    void  DeleteID (String id) throws Exception;

    //未支付修改数据库的库存

    void  updatepnum(Integer id)throws  Exception;

    //FindProductByIdServlet,完成根据id查找商品信息
    List<Products> findProductById()throws  Exception;

//   管理员的根据条件模糊查询
    List<Products>  Liketerm (String id,String category,String name) throws Exception;

    //管理员添加书籍
    public void AddBook(Products products) throws Exception;

//    修改信息
    public  void  redactServlet(Products p) throws Exception;

    //删除书籍
    public  void  delete(String id)throws  Exception;

    //   管理员的根据条件模糊查询订单
    public  List<Orders> OrdersLike(String id,String receiverName) throws Exception;

//管理员查看订单详情
    List<Orders> AdminShowAllOrdersInfo(String id)throws Exception;

    //管理员删除订单
    void  AdminDeleteID (String id) throws Exception;
}
