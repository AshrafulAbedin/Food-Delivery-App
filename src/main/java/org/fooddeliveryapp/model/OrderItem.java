package org.fooddeliveryapp.model;

public final class OrderItem {
    private String menuItemId;
    private String name;
    private double unitPrice;
    private int quantity;
    private String totalPrice;
    private String customizations;
    private String string;

    public OrderItem()
    {
    }
    //CLASSES USED AS INHERITANCE, YOU SHOULD NOT CALL SETTERS IN CONSTRUCTOR... BUT OTHERWISE, USE SETTERS IN CONSTRUCTOR
    public OrderItem(String menuItemId, String name, double unitPrice, int quantity) throws IllegalArgumentException {
        setMenuItemId(menuItemId);
        setName(name);


    }

    //SETTERS
    public void setMenuItemId(final String menuItemId) throws IllegalArgumentException {
        if(menuItemId == null)
            throw new IllegalArgumentException("MenuItem Id cannot be null");
        this.menuItemId = menuItemId.trim();
    }
    public void setName(final String name) throws IllegalArgumentException{
        if(name ==null)
            throw new IllegalArgumentException();
        this.name = name.trim();
    }
    public void setUnitPrice(final double unitPrice) throws IllegalArgumentException{
        if (unitPrice < 0)
            throw new IllegalArgumentException();
        this.unitPrice = unitPrice;
    }
    public void setQuantity(final int quantity) throws IllegalArgumentException{
        if (quantity < 0)
            throw new IllegalArgumentException();
        this.quantity = quantity;
    }
    public void setCustomizations(final String customizations) {
        this.customizations = customizations.trim();
    }

    public double getTotalPrice() {
        if (quantity <0)
            throw new java.lang.IllegalArgumentException("Quantity cannot be Negative");
        return unitPrice * quantity;
    }
    public String getMenuItemId() {
        return menuItemId;
    }

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCustomizations() {
        return customizations;
    }
}
