package com.xpanxion.assignments.student;

import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.*;

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
            System.out.println(person.persontoString());
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
            System.out.println(map.get(Integer.parseInt(input)).persontoString());


        }while(!input.equalsIgnoreCase("done"));

    }

    public void ex13(){
        var invoice = new Invoice(1);
        invoice.addProduct(new Product(111, "Mustard", 2.00));
        invoice.addProduct(new Product(222, "Ketchup", 3.00));
        invoice.addProduct(new Product(333, "Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }

    public void ex14(){
        var invoice = new Invoice(1);
        invoice.addProduct(new Product(111, "Mustard", 2.00));
        invoice.addProduct(new Product(222, "Ketchup", 3.00));
        invoice.addProduct(new Product(333, "Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }

    public void ex15(){
        var repository = new Repository();
        var p = repository.getPerson();
        System.out.println(p);

    }

    public void ex16(){
        String input = "", operation = "", osymbol = "";
        int num1 = 0, num2 = 0, result = 0;
        String c;
        Calculator calc = new Calculator();
        do{
            System.out.println("Enter first number: ");
            input = scan.nextLine();
            if(Character.isDigit(input.charAt(0)))
                num1 = Integer.parseInt(input);
            else {
                c = "done";
                break;
            }
            System.out.println("Enter second number: ");

            num2 = scan.nextInt();
            System.out.println("Enter operation (add, sub, mul, div): ");
            scan.nextLine();
            operation = scan.nextLine();
            if(operation.equalsIgnoreCase("add")){
                result = num1 + num2;
                osymbol = "+";
            }
            else if(operation.equalsIgnoreCase("sub")){
                result = num1 - num2;
                osymbol = "-";
            }
            else if(operation.equalsIgnoreCase("mul")){
                result = num1 * num2;
                osymbol = "*";
            }
            else if(operation.equalsIgnoreCase("div")){
                result = num1 / num2;
                osymbol = "/";
            }

            calc.add(num1 + " " + osymbol + " " + num2 + " = " + result);
            c = Integer.toString(num1);
            if(c.equalsIgnoreCase("done"))
                break;
        }while(!c.equalsIgnoreCase("done"));
        calc.getHistory();
    }

    public void ex17(){
        var personList = Arrays.asList(new Person(1, "Peter", "Jones"), new Person(2, "John", "Smith"), new Person(3, "Sue", "Anderson"));
        var newpersonList = Arrays.asList(new Person(1, "Peter", "Jones"), new Person(2, "John", "Smith"), new Person(3, "Sue", "Anderson"));
        for(int i = 0; i < personList.size(); i++){
            newpersonList.set(i, new Person(Integer.parseInt(personList.get(i).getID()), personList.get(i).getFirstName(), "xxx"));

        }


        for(Person p : newpersonList){
            System.out.println(p.persontoString());
        }
    }

    public void ex18(){
        var personList = Arrays.asList(new Person(1, "Charlie", "Jones"), new Person(2, "Zoey", "Smith"), new Person(3, "Adam", "Anderson"));
        ArrayList<String> names = new ArrayList<String>();
        var newpersonList = Arrays.asList(new Person(1, "Charlie", "Jones"), new Person(2, "Zoey", "Smith"), new Person(3, "Adam", "Anderson"));

        Person p = new Person();

        for(int i = 0; i < personList.size(); i++){
            names.add(personList.get(i).getFirstName());
        }

        Collections.sort(names);

        for(int i = 0; i < names.size(); i++){
            String name = names.get(i);
            for(int c = 0; c < personList.size(); c++){
                if(personList.get(c).getFirstName().equalsIgnoreCase(name))
                    p = personList.get(c);
            }
            newpersonList.set(i, p);
        }
        for(Person f : newpersonList){
            System.out.println(f.persontoString());
        }
    }

    public void ex19(){
        var personList = Arrays.asList(
                new Person(1, "Charlie", "Jones"),
                new Person(2, "Zoey", "Smith"),
                new Person(3, "Adam", "Anderson")
        );

        var filteredList = new ArrayList<>(List.of(new Person(1, "Charlie", "Jones")));
        filteredList.remove(0);
        for(int i = 0; i < personList.size(); i++){

            if(personList.get(i).getLastName().equalsIgnoreCase("smith"))
                filteredList.add(personList.get(i));
        }

        for(Person p : filteredList){
            System.out.println(p.persontoString());
        }
    }

    public void ex20() throws InterruptedException {

        LinkedList<Cat> queue = new LinkedList<Cat>();
        queue.push(new Cat("Dan"));
        queue.push(new Cat("Charlie"));
        queue.push(new Cat("Bob"));
        queue.push(new Cat("Alice"));
        while(!queue.isEmpty()){
            for(int i = 0; i < queue.size(); i++){
                System.out.print(queue.get(i).getName() + " ");
            }
            System.out.println();
            Thread.sleep(3000);
            queue.pop();
        }
    }
}
