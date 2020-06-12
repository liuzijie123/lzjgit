package com.liting.domain;


import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Orders {

    private  String id;
    private  Double money;
    private  String receiverAddress;
    private  String receiverName;
    private  String receiverPhone;
    private  Integer paystate;
    private Date ordertime;

    public Orders(String id, Double money, String receiverAddress,
                  String receiverName, String receiverPhone, Integer paystate,
                  Date ordertime, Products productsList, Orderitem orderitems) {
        this.id = id;
        this.money = money;
        this.receiverAddress = receiverAddress;
        this.receiverName = receiverName;
        this.receiverPhone = receiverPhone;
        this.paystate = paystate;
        this.ordertime = ordertime;
        this.productsList = productsList;
        this.orderitems = orderitems;
    }

    public Orders() {
    }

    private  Products productsList;
    private  User user;
    private Orderitem orderitems;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public Integer getPaystate() {
        return paystate;
    }

    public void setPaystate(Integer paystate) {
        this.paystate = paystate;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public Products getProductsList() {
        return productsList;
    }

    public void setProductsList(Products productsList) {
        this.productsList = productsList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Orderitem getOrderitems() {
        return orderitems;
    }

    public void setOrderitems(Orderitem orderitems) {
        this.orderitems = orderitems;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id='" + id + '\'' +
                ", money=" + money +
                ", receiverAddress='" + receiverAddress + '\'' +
                ", receiverName='" + receiverName + '\'' +
                ", receiverPhone='" + receiverPhone + '\'' +
                ", paystate=" + paystate +
                ", ordertime=" + ordertime +
                ", productsList=" + productsList +
                ", user=" + user +
                ", orderitems=" + orderitems +
                '}';
    }
}
