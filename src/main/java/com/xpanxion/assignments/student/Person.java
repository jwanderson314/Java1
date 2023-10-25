package com.xpanxion.assignments.student;

public class Person {

    private String firstName, lastName;
    private int id;

    public Person(){

    }
    public Person(int x, String y){
        this.id = x;
        String[] parts = y.split(" ");
        this.firstName = parts[0];
        this.lastName = parts[1];

    }

    public Person(int x, String y, String z){
        this.id = x;
        String[] parts = y.split(" ");
        this.firstName = y;
        this.lastName = z;

    }

    public Person( String y){
        String[] parts = y.split(" ");
        this.firstName = parts[0];
        this.lastName = parts[1];

    }

    public String persontoString(){
        return "id = " + this.id + ", firstName = " + this.firstName + ", lastName = " + this.lastName;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getID(){
        return String.valueOf(this.id);
    }
}
