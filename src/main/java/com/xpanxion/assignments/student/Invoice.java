package com.xpanxion.assignments.student;

import java.util.ArrayList;

public class Invoice extends Base {
    ArrayList<Product> list = new ArrayList<Product>();
    private int code;
    public Invoice(int x){
        setID(x);
    }

    public void addProduct(Product x){
        list.add(x);
    }

    public double getTotalCost(){
        double total = 0.0;
        for(int i = 0; i < list.size(); i++){
            total += list.get(i).getPrice();
        }
        return total;
    }

    @Override
    void setID(int id) {

    }
}
