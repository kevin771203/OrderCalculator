package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class OrderCalculatorTest {

    @Test
    void add_items() {
        OrderCalculator orderCalculator = new OrderCalculator();

        List<Item> items = orderCalculator.addItems("apple", 30, 2);
        orderCalculator.addItems("banana", 50, 3);
        Item item = items.get(0);
        Assertions.assertThat(item.getName()).isEqualTo("apple");
        Assertions.assertThat(item.getQuantity()).isEqualTo(2);
        Assertions.assertThat(item.getPrice()).isEqualTo(30);
        item = items.get(1);
        Assertions.assertThat(item.getName()).isEqualTo("banana");
        Assertions.assertThat(item.getQuantity()).isEqualTo(3);
        Assertions.assertThat(item.getPrice()).isEqualTo(50);
    }

    @Test
    void total_price() {
        OrderCalculator orderCalculator = new OrderCalculator();
        orderCalculator.addItems("banana", 50, 3);
        orderCalculator.addItems("apple", 30, 2);
        Assertions.assertThat(orderCalculator.totalPrice()).isEqualTo(210);
    }


}