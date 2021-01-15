package com.wassouf.ali.builder.pizza;

import com.wassouf.ali.builder.pizza.classes.Calzone;
import com.wassouf.ali.builder.pizza.classes.NyPizza;
import com.wassouf.ali.builder.pizza.classes.Pizza;

public class Demo {
    public static void main(String... args) {
        Pizza pizza = new NyPizza.Builder(NyPizza.Size.LARGE).addTopping(Pizza.Topping.HAM).build();
        Pizza calzone = new Calzone.Builder().sauceInside().addTopping(Pizza.Topping.HAM).build();
    }
}
