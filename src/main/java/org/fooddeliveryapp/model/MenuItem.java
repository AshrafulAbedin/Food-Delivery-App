package org.fooddeliveryapp.model;

public class MenuItem {
    private String id;
    private String name;
    private double price;
    private int inStockQnty;
    private boolean available;

    //getter
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getInStockQnty() {
        return inStockQnty;
    }
    public boolean isAvailable() {
        return available;
    }
    //setter
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setInStockQnty(int inStockQnty) {
        this.inStockQnty = inStockQnty;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
}
