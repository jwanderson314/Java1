package com.xpanxion.assignments.student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class JavaTwo {

    public JavaTwo(){

    }

    Scanner scan = new Scanner(System.in);
    public void ex11(){
        int count = 1;
        String input = "";
        ArrayList<Person> list = new ArrayList<Person>();
        do{
            System.out.println("Enter Person " + count +": ");
            input = scan.nextLine();
            if(input.equalsIgnoreCase("done"))
                break;
            Person p = new Person(count, input);
            list.add(p);
            count++;

        }while(!input.equalsIgnoreCase("done"));

        for (Person person : list) {
            person.persontoString();
        }
    }

    public void ex12(){

        HashMap<Integer, Person> map = new HashMap<Integer, Person>();
        map.put(1, new Person(1, "Peter Jones"));
        map.put(2, new Person(2, "John Smith"));
        map.put(3, new Person(3, "Mary Jane"));

        String input = "";
        do{
            System.out.println("Enter person ID: ");
            input = scan.nextLine();
            if(input.equalsIgnoreCase("done"))
                break;
            map.get(Integer.parseInt(input)).persontoString();


        }while(!input.equalsIgnoreCase("done"));

    }
}
