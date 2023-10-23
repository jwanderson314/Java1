package com.xpanxion.assignments.student;

public class Person {

    private String firstName, lastName;
    private int id;
    public Person(int x, String y){
        this.id = x;
        String[] parts = y.split(" ");
        this.firstName = parts[0];
        this.lastName = parts[1];

    }

    public void persontoString(){
        System.out.println("id = " + this.id + ", firstName = " + this.firstName + ", lastName = " + this.lastName);
    }
}
