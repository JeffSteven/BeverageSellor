package com.example.beverageseller.controller;

import com.example.beverageseller.beverage.Beverage;
import com.example.beverageseller.dto.BeverageDto;
import com.example.beverageseller.factory.BeverageFactory;
import com.example.beverageseller.factory.DecoratorFactory;
import com.example.beverageseller.order.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BuyController {
    @Autowired
    BeverageFactory beverageFactory;
    @Autowired
    DecoratorFactory decoratorFactory;
    @PostMapping("/buy")
    public BeverageDto buy(@RequestBody Order order){
        Beverage beverage = beverageFactory.getBeverage(order.getDrinkType());
        for (String addOn : order.getAddOns()) {
            beverage=decoratorFactory.getBeverage(beverage,addOn);
        }
        System.out.println();
        System.out.println(beverage.getDescription());
        System.out.println("一共做了"+order.getQuantity()+"杯");
        double profit=beverage.getPrice()*Double.parseDouble(order.getQuantity());
        System.out.println("卖了"+profit+" 元");
        return new BeverageDto(beverage.getDescription(),profit ,order.getQuantity());
    }
    @GetMapping("/getDrink")
    public Double getDrink(@RequestParam("drink") String drink){
        return beverageFactory.getBeverage(drink).getPrice();
    }
}
