package com.driver;

public class DeluxePizza extends Pizza {

    //deluxe pizza extend pizza
    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        addExtraCheese();
        addExtraToppings();
    }
}
