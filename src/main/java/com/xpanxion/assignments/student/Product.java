package com.xpanxion.assignments.student;

public class Product extends Base{

    private int code;
    private String name;
    private double price;
    public Product(int code, String name, double price){
        setID(code);
        this.name = name;
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }
    @Override
    void setID(int id) {

    }
}
