package com.liting.domain;

public class Orderitem {

    private Orders order_id;
    private  Products p;
    private  Integer buynum;

    public Orders getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Orders order_id) {
        this.order_id = order_id;
    }

    public Products getP() {
        return p;
    }

    public void setP(Products p) {
        this.p = p;
    }

    public Integer getBuynum() {
        return buynum;
    }

    public void setBuynum(Integer buynum) {
        this.buynum = buynum;
    }

    public Orderitem(Orders order_id, Products p, Integer buynum) {
        this.order_id = order_id;
        this.p = p;
        this.buynum = buynum;
    }
    public Orderitem(){}
}
