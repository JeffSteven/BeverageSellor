package com.example.beverageseller.beverage;

public class Coffee extends Beverage{
    public Coffee(){
        getDescription();
    }

    @Override
    public String getDescription() {
        return "Coffee";
    }

    @Override
    public double getPrice() {
        return 9.9;
    }
}
