package com.xpanxion.assignments.student;

import java.util.ArrayList;
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
}
