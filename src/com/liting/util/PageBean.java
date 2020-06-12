package com.liting.util;

import java.util.List;

public class PageBean<E> {
    private List<E> bean;            // 存放实体类集合
    private int currPage;    // 当前页
    private int pageSize;        // 每页显示的条数
    private int totalPage;        // 总页数 可以用总条数除以每页显示的条数
    private int totalCount;    // 总条数
    private  String name; //命名

    public PageBean(List<E> bean, int currentPage, int pageSize,  int totalCount) {
        this.bean = bean;
        this.currPage = currentPage;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
    }


    public PageBean() {
    }

    public List<E> getBean() {
        return bean;
    }

    public void setBean(List<E> bean) {
        this.bean = bean;
    }

    public int getCurrPage() {
        return currPage;
    }

    public void setCurrPage(int currPage) {
        this.currPage = currPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
