package com.example.homework2;

public class Order {

    private int orderID;

    private String orderitem;

    private int imageDrawableId;

    private String price;

    public Order(int orderID, String orderitem, int imageDrawableId, String price) {
        this.imageDrawableId = imageDrawableId;
        this.orderID = orderID;
        this.orderitem = orderitem;
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
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
