/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Date;

/**
 *
 * @author Dell Inc
 */
public class order {

    private int orderId;
    private int orderDetailId;
    private int Producid;
    private int quantity;
    private int UserID;
    private Date date;
    private float total;

    public order() {
    }

    public order(int orderId, int orderDetailId, int Producid, int quantity) {// for order detail
        this.orderId = orderId;
        this.orderDetailId = orderDetailId;
        this.Producid = Producid;
        this.quantity = quantity;
    }

    public order(int orderId, int UserID, Date date, float total) {// for order
        this.orderId = orderId;
        this.UserID = UserID;
        this.date = date;
        this.total = total;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(int orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public int getProducid() {
        return Producid;
    }

    public void setProducid(int Producid) {
        this.Producid = Producid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }


    
}
