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
                "Double Beef Borger $13",
                R.drawable.order1
        ));
        orders.put(2, new Order(
                2,
                "Chicken Borger $11",
                R.drawable.order2
        ));
        orders.put(3, new Order(
                3,
                "Beef Borger $11",
                R.drawable.order3
        ));
        orders.put(4, new Order(
                4,
                "Double Chicken Borger $13",
                R.drawable.order4
        ));
        orders.put(5, new Order(
                5,
                "Chesee Borger $9",
                R.drawable.order5
        ));
        orders.put(6, new Order(
                6,
                "Double Cheese Borger $10",
                R.drawable.order6
        ));
        orders.put(7, new Order(
                7,
                "Mixed Borger $14",
                R.drawable.order7
        ));
        orders.put(8, new Order(
                8,
                "Triple Beef Borger $15",
                R.drawable.order8
        ));
        orders.put(9, new Order(
                9,
                "Thick Chips $7",
                R.drawable.order9
        ));
        orders.put(10, new Order(
                10,
                "Small Chips $5",
                R.drawable.order10
        ));
        orders.put(11, new Order(
                11,
                "Gravy Chips $8",
                R.drawable.order11
        ));
        orders.put(12, new Order(
                12,
                "Cola $4",
                R.drawable.order12
        ));
        orders.put(13, new Order(
                13,
                "Fanta $4",
                R.drawable.order13
        ));
        orders.put(14, new Order(
                14,
                "Sprite $4",
                R.drawable.order14
        ));
        orders.put(15, new Order(
                15,
                "Nuggets $7",
                R.drawable.order15
        ));
    }
}
