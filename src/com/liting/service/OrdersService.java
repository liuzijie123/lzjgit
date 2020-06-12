package com.liting.service;

import com.liting.dao.Imp.OrdersDaoImp;
import com.liting.domain.Orderitem;
import com.liting.domain.Orders;
import com.liting.domain.Products;

import java.util.List;


public class OrdersService {
    private OrdersDaoImp ordersDaoImp = new OrdersDaoImp();


    public void createOrders(Orders orders) {

        try {
            ordersDaoImp.createOrders(orders);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void checkOrders(Orderitem orderitem) {
        try {
            ordersDaoImp.checkOrders(orderitem);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updatepaystate(String id, int paystate) {

        try {
            ordersDaoImp.updatepaystate(id, paystate);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public List<Orders> ShowAllOrders(String user_id) {
        List<Orders> orders = null;
        try {
            orders = ordersDaoImp.ShowAllOrders(user_id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return orders;
    }

    public List<Orders> ShowAllOrdersInfo(String id) {
        List<Orders> orders=null;
        try {
            orders = ordersDaoImp.ShowAllOrdersInfo(id);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return  orders;
    }

    public void DeleteID(String id){
        try {
            ordersDaoImp.DeleteID(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Products> findProductById(){
        List<Products> productById=null;
        try {
            productById = ordersDaoImp.findProductById();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return productById;
    }

    public List<Products> Liketerm(String id, String category, String name){
        List<Products> liketerms=null;
        try {
            liketerms = ordersDaoImp.Liketerm(id,category,name);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return liketerms;
    }

    public List<Orders> OrdersLike(String id,String receiverName){
        List<Orders> orders =null;
        try {
            orders= ordersDaoImp.OrdersLike(id, receiverName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  orders;
    }


    public void AddBook(Products products){
        try {
            ordersDaoImp.AddBook(products);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void redactServlet(Products p){
        try {
            ordersDaoImp.redactServlet(p);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void delete(String id){
        try {
            ordersDaoImp.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public List<Orders> AdminShowAllOrdersInfo(String id){
        List<Orders> orders =null;
        try {
            orders= ordersDaoImp.AdminShowAllOrdersInfo(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return orders;
    }

    public void AdminDeleteID(String id){
        try {
            ordersDaoImp.AdminDeleteID(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
