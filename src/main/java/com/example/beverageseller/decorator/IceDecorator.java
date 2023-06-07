package com.example.beverageseller.decorator;

import com.example.beverageseller.beverage.Beverage;

public class IceDecorator extends Decorator{

    Beverage beverage;

    public IceDecorator(Beverage beverage){
        this.beverage=beverage;
    }
    @Override
    public double getPrice() {
        return beverage.getPrice();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" 加 Ice";
    }
}
