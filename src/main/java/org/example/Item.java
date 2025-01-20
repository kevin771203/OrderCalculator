package org.example;

import lombok.Getter;

public class Item {
    @Getter
    private final String name;
    private final int price;
    private final int quantity;

    public Item(String name,int price ,int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
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

