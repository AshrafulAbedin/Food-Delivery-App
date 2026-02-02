package org.fooddeliveryapp.model;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name;
    private String address;
    private String area;
    private boolean isOpen;
    private List<MenuItem> menuItems;

    // Constructors + JSON Serialization
    public Restaurant()
    {
        this.menuItems = new ArrayList<MenuItem>();
    }

    //getter

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getArea() {
        return area;
    }
    public boolean isOpen() {
        return isOpen;
    }




    //setter
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public void setOpen(boolean open) {
        isOpen = open;
    }
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
}
