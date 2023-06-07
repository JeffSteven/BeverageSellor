package com.example.beverageseller.factory;

import com.example.beverageseller.beverage.Beverage;
import com.example.beverageseller.beverage.NoBeverage;
import com.example.beverageseller.decorator.Decorator;
import com.example.beverageseller.decorator.IceDecorator;
import com.example.beverageseller.decorator.MilkDecorator;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class DecoratorFactory implements Factory{

    public Beverage getBeverage(Beverage beverage,String name) {
        if(beverage.getClass()== NoBeverage.class){
            return new NoBeverage();
        }
        Decorator decorator=null;
        if(name.equals("Milk")){
            decorator=new MilkDecorator(beverage);
        }else if(name.equals("Ice")){
            decorator=new IceDecorator(beverage);
        }
        return decorator;
    }
}
