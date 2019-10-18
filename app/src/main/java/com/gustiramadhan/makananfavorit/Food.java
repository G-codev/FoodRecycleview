package com.gustiramadhan.makananfavorit;

public class Food {
    private String name;
    private float rate;
    private double price;
    private Boolean fave;

    public Food(String name, float rate, double price, Boolean fave) {
        this.name = name;
        this.rate = rate;
        this.price = price;
        this.fave = fave;
    }
    public Boolean isFave() {
        return fave;
    }
    public String getName() {
        return name;
    }

    public float getRate() {
        return rate;
    }

    public double getPrice() {
        return price;
    }


}
