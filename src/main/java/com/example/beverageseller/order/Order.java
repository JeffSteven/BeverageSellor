package com.example.beverageseller.order;

import java.util.ArrayList;
import java.util.List;
public class Order {
    private String drinkType;
    private ArrayList<String> addOns;
    private String quantity;

    public String getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(String drinkType) {
        this.drinkType = drinkType;
    }

    public List<String> getAddOns() {
        return addOns;
    }

    public void setAddOns(ArrayList<String> addOns) {
        this.addOns = addOns;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
