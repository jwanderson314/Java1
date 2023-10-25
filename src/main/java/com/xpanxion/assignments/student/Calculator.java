package com.xpanxion.assignments.student;

import java.util.ArrayList;

public class Calculator {

    ArrayList<String> arr = new ArrayList<String>();

    public Calculator(){

    }
    public void add(String s) {
        arr.add(s);
    }

    public void getHistory() {
        for(int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }
    }
}
