package com.example.homework2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;

public class fakedatabase {

    public static Order getOrderById(int orderID){
        return orders.get(orderID);
    }

    public static ArrayList<Order>getAllOrders(){
        return new ArrayList<Order>((List) Arrays.asList(orders.values().toArray()));
    }

    private static final HashMap<Integer, Order> orders = new HashMap<>();

    static  {
        orders.put(1, new Order(
                1,
                "Double Beef Borger",
                R.drawable.order1,
                "$13"

        ));
        orders.put(2, new Order(
                2,
                "Chicken Borger",
                R.drawable.order2,
                "$11"
        ));
        orders.put(3, new Order(
                3,
                "Beef Borger",
                R.drawable.order3,
                "$11"
        ));
        orders.put(4, new Order(
                4,
                "Double Chicken Borger",
                R.drawable.order4,
                "$13"
        ));
        orders.put(5, new Order(
                5,
                "Chesee Borger",
                R.drawable.order5,
                "$9"
        ));
        orders.put(6, new Order(
                6,
                "Double Cheese Borger",
                R.drawable.order6,
                "$10"
        ));
        orders.put(7, new Order(
                7,
                "Mixed Borger",
                R.drawable.order7,
                "$14"
        ));
        orders.put(8, new Order(
                8,
                "Triple Beef Borger",
                R.drawable.order8,
                "$15"
        ));
        orders.put(9, new Order(
                9,
                "Thick Chips",
                R.drawable.order9,
                "$7"
        ));
        orders.put(10, new Order(
                10,
                "Small Chips",
                R.drawable.order10,
                "$5"
        ));
        orders.put(11, new Order(
                11,
                "Gravy Chips",
                R.drawable.order11,
                "$8"
        ));
        orders.put(12, new Order(
                12,
                "Cola",
                R.drawable.order12,
                "$4"
        ));
        orders.put(13, new Order(
                13,
                "Fanta",
                R.drawable.order13,
                "$4"
        ));
        orders.put(14, new Order(
                14,
                "Sprite",
                R.drawable.order14,
                "$4"
        ));
        orders.put(15, new Order(
                15,
                "Nuggets",
                R.drawable.order15,
                "$7"
        ));
    }
}
