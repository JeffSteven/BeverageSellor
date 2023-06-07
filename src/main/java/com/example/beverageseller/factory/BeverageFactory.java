package com.example.beverageseller.factory;

import com.example.beverageseller.beverage.Beverage;
import com.example.beverageseller.beverage.Coca;
import com.example.beverageseller.beverage.Coffee;
import com.example.beverageseller.beverage.NoBeverage;
import org.springframework.stereotype.Component;

@Component
public class BeverageFactory implements Factory{

    public Beverage getBeverage(String name) {
        Beverage beverage=new NoBeverage();
        if(name.equals("Coffee")){
            beverage= new Coffee();
        }else if(name.equals("Coca")){
            beverage= new Coca();
        }
        return beverage;
    }
}
