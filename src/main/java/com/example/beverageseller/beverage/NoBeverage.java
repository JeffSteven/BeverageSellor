package com.example.beverageseller.beverage;

public class NoBeverage extends Beverage{
    @Override
    public String getDescription() {
        return "非法!";
    }

    @Override
    public double getPrice() {
        return 999;
    }
}
