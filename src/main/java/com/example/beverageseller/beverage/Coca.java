package com.example.beverageseller.beverage;

public class Coca extends Beverage{
    public Coca(){
        getDescription();
    }

    @Override
    public String getDescription() {
        return "Coca";
    }

    @Override
    public double getPrice() {
        return 2.5;
    }
}
