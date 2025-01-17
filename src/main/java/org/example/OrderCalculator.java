package org.example;

import java.util.ArrayList;
import java.util.List;

public class OrderCalculator {
    private List<Item> items = new ArrayList<>();
    public int totalPrice;
    public List<Item> addItems(String name,int price ,int quantity) {

        items.add(new Item(name, price,quantity));

        return items;
    }


    public int totalPrice() {

        for( int i = 0; i < items.size(); i++) {

            totalPrice += items.get(i).getPrice()*items.get(i).getQuantity();

        }

        return totalPrice;
    }
}