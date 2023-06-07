package com.example.beverageseller.decorator;

import com.example.beverageseller.beverage.Beverage;

public class MilkDecorator extends Decorator{
    Beverage beverage;
    public MilkDecorator(Beverage beverage){
        this.beverage=beverage;
    }

    @Override
    public double getPrice() {
        return beverage.getPrice()+1;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" 加 牛奶";
    }
}
