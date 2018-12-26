/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entities;

import java.util.Date;

/**
 *
 * @author Pung's Computer
 */
public class TransactionHsitory {
    private int id;
    private String braed;
    private double price;
    private int quan;
    private Date date;

    public TransactionHsitory(int id, String braed, double price, int quan, Date date) {
        this.id = id;
        this.braed = braed;
        this.price = price;
        this.quan = quan;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public int getQuan() {
        return quan;
    }

    public void setQuan(int quan) {
        this.quan = quan;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String getBraed() {
        return braed;
    }

    public void setBraed(String braed) {
        this.braed = braed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
}
