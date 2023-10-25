package com.xpanxion.assignments.student;

import javax.xml.crypto.Data;
import java.util.ArrayList;

public class Repository implements DataAccess {
    ArrayList<Person> list = new ArrayList<Person>();
    public Repository(){
        list.add(new Person(1, "John Doe"));
    }
    @Override
    public String getPerson() {
        return list.get(0).getID() + " " + list.get(0).getFirstName() + " " + list.get(0).getLastName();
    }
}
