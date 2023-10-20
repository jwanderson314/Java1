package com.xpanxion.assignments.student;

import java.sql.SQLOutput;
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
        System.out.println("Student 1: ex7.");
    }

    public void ex8() {
        System.out.println("Student 1: ex8.");
    }

    public void ex9() {
        System.out.println("Student 1: ex9.");
    }

    public void ex10() {
        System.out.println("Student 1: ex10.");
    }

    //
    // Private helper methods
    //
}
