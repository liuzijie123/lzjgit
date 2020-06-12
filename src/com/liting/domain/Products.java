package com.liting.domain;

import java.util.Objects;

public class Products {
    private  String id;
    private  String name;
    private  Double price;
    private  String category;
    private  Integer pnum;
    private  String imgurl;
    private  String description;

    @Override
    public String toString() {
        return "Products{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", pnum=" + pnum +
                ", imgurl='" + imgurl + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public Products(String id, String name, Double price, String category, Integer pnum, String imgurl, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.pnum = pnum;
        this.imgurl = imgurl;
        this.description = description;
    }

    public Products() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getPnum() {
        return pnum;
    }

    public void setPnum(Integer pnum) {
        this.pnum = pnum;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (!(o instanceof Products)) {return false;}

        Products products = (Products) o;
        if (this.name.equals(products.getName())) {return  true;}
        if (getId() != null ? !getId().equals(products.getId()) : products.getId() != null) {return false;}
        if (getName() != null ? !getName().equals(products.getName()) : products.getName() != null) {return false;}
        if (getPrice() != null ? !getPrice().equals(products.getPrice()) : products.getPrice() != null) {return false;}
        if (getCategory() != null ? !getCategory().equals(products.getCategory()) : products.getCategory() != null)
        {return false;}
        if (getPnum() != null ? !getPnum().equals(products.getPnum()) : products.getPnum() != null) {return true;}
        if (getImgurl() != null ? !getImgurl().equals(products.getImgurl()) : products.getImgurl() != null)
        {return false;}
        return getDescription() != null ? getDescription().equals(products.getDescription()) : products.getDescription() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getPrice() != null ? getPrice().hashCode() : 0);
        result = 31 * result + (getCategory() != null ? getCategory().hashCode() : 0);
        result = 31 * result + (getPnum() != null ? getPnum().hashCode() : 0);
        result = 31 * result + (getImgurl() != null ? getImgurl().hashCode() : 0);
        result = 31 * result + (getDescription() != null ? getDescription().hashCode() : 0);
        return result;
    }
}
