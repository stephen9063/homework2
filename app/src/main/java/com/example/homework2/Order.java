package com.example.homework2;

public class Order {

    private int orderID;

    private String orderitem;

    private int imageDrawableId;

    public Order(int orderID, String orderitem, int imageDrawableId) {
        this.imageDrawableId = imageDrawableId;
        this.orderID = orderID;
        this.orderitem = orderitem;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getImageDrawableId() {
        return imageDrawableId;
    }

    public void setImageDrawableId(int imageDrawableId) {
        this.imageDrawableId = imageDrawableId;
    }

    public String getOrderitem() {
        return orderitem;
   }

    public void setOrderitem(String orderitem) {
        this.orderitem = orderitem;
    }
}
