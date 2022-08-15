package com.example.westcornerback.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("Order")
public class Order {
    private String owner;
    private String formula;
    private Boolean fries;
    private String burger;
    private String drink;
    private String dessert;

    

    public Order(String owner, String formula, Boolean fries, String burger, String drink, String dessert) {
        this.owner = owner;
        this.formula = formula;
        this.fries = fries;
        this.burger = burger;
        this.drink = drink;
        this.dessert = dessert;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public Boolean getFries() {
        return fries;
    }

    public void setFries(Boolean fries) {
        this.fries = fries;
    }

    public String getBurger() {
        return burger;
    }

    public void setBurger(String burger) {
        this.burger = burger;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getDessert() {
        return dessert;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    };

    
}
