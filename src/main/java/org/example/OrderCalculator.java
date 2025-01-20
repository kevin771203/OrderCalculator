package org.example;

import java.util.ArrayList;
import java.util.List;

public class OrderCalculator {
    private final List<Item> items = new ArrayList<>();
    public int totalPrice;
    public List<Item> addItems(Item newItem) {

        items.add(newItem);

        return items;
    }


    public int totalPrice() {

        for (Item item : items) {totalPrice += item.getPrice() * item.getQuantity();}

        return totalPrice;
    }
}