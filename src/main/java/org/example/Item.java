package org.example;

public class Item {
    private String name;
    private int price;
    private int quantity;

    public Item(String name,int price ,int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Item: " + name + ", Quantity: " + quantity + ", Price: " + price;
    }
}

