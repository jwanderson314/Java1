package com.xpanxion.assignments.student;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class JavaOne {

    //
    // Constructors
    //
    Scanner scan = new Scanner(System.in);

    public JavaOne() {}

    //
    // Public methods
    //

    public void ex1() {
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        name = name.toUpperCase();
        System.out.println("Your name in uppercase is: " + name);

    }

    public void ex2() {
        System.out.println("Enter a string: ");
        String text = scan.nextLine();
        int count = 0;
        for(int i = 0; i < text.length();i++){
            if(Character.isUpperCase(text.charAt(i)))
                count++;
        }
        System.out.println("Number of uppercase letters: " + count);

    }

    public void ex3() {
        System.out.println("Enter a string: ");
        String text = scan.nextLine();
        int x = 1;
        StringTokenizer st = new StringTokenizer(text);
        while(st.hasMoreTokens()){
            if(x == 1){
                System.out.print(st.nextToken().toUpperCase() + " ");
                x *= -1;
            }
            else{
                System.out.print(st.nextToken() + " ");
                x *= -1;
            }
        }


    }

    public void ex4() {

        System.out.println("Enter string: ");
        String text = scan.nextLine();
        String reversed = "";
        for(int i = text.length() - 1; i >= 0; i--){
            reversed += String.valueOf(text.charAt(i));
        }
        if(reversed.equals(text)){
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }

    public void ex5() {

        int vowels = 0, consonants = 0;
        String input = "";
        while(!input.equalsIgnoreCase("quit")){
            System.out.println("Enter a string: ");
            input = scan.nextLine();
            for(int i = 0; i < input.length(); i++){
                char x = input.toLowerCase().charAt(i);
                if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x =='u' || x == 'y')
                    vowels++;
                else
                    consonants++;
            }
            System.out.println("Number of vowels: " + vowels);
            System.out.println("Number of consonants: " + consonants);

        }
    }

    public void ex6() {
        System.out.println("Enter first number: ");
        int first = scan.nextInt();
        System.out.println("Enter second number: ");
        int second = scan.nextInt();
        int result = first + second;
        System.out.println("Result: " + result);
    }

    public void ex7() {
        System.out.println("Enter first number: ");
        int first = scan.nextInt();
        System.out.println("Enter second number: ");
        int second = scan.nextInt();
        int result = 0;
        System.out.println("Enter operation (add, sub, mul, div): ");
        String input = scan.next();
        if(input.equalsIgnoreCase("add"))
            result = first + second;
        else if(input.equalsIgnoreCase("sub"))
            result = first - second;
        else if(input.equalsIgnoreCase("mul"))
            result = first * second;
        else if(input.equalsIgnoreCase("div"))
            result = first / second;
        System.out.println("Result: " + result);
    }

    public void ex8() {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter price per square feet: ");
        double price = scan1.nextDouble();
        double total = 0;
        String done = "";
        do{
            System.out.println("Enter carpet dimensions: ");
            done = scan.nextLine();
            if(done.equals("done"))
            {
                break;
            }
            String[] parts = done.split("x");
            String p1 = parts[0];
            String p2 = parts[1];

            p1 = p1.substring(0, p1.length()-1);
            p2 = p2.substring(1);
            int n1 = Integer.parseInt(p1);
            int n2 = Integer.parseInt(p2);
            total += price * (n1 * n2);
        }while(!done.equalsIgnoreCase("done"));
        System.out.println("Total cost: $" + total);

    }

    public void ex9() {

        int guess = 0;
        Random rand = new Random();
        int num = rand.nextInt(5) + 1;
        while(guess != num){
            System.out.println("Enter a number: ");
            guess = scan.nextInt();
            if(guess != num)
                System.out.println("Try again...");
        }
        System.out.println("You guessed it!");
    }

    public void ex10() {
        System.out.println("Student 1: ex10.");
    }

    //
    // Private helper methods
    //
}
