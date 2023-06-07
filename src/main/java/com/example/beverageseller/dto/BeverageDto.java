package com.example.beverageseller.dto;

public class BeverageDto {
    boolean buySuccess=false;
    String getDescription;
    Double price;
    String quantity;

    public boolean isBuySuccess() {
        return buySuccess;
    }

    public void setBuySuccess(boolean buySuccess) {
        this.buySuccess = buySuccess;
    }

    public String getGetDescription() {
        return getDescription;
    }

    public void setGetDescription(String getDescription) {
        this.getDescription = getDescription;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public BeverageDto(String getDescription, Double price, String quantity) {
        this.getDescription = getDescription;
        this.price = price;
        this.quantity = quantity;
        this.buySuccess = true;
    }
}
