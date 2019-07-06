package com.bookstore.entity;

import java.util.Date;
import java.util.List;

public class Orders {

    private int id;
    private Date createdDate;
    private  boolean isShipping;
    private List<Product> products;
    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public boolean isShipping() {
        return isShipping;
    }

    public void setShipping(boolean shipping) {
        isShipping = shipping;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
