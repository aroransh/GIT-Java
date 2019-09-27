package com.Anshul;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Userinput {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number 1");
        int number1 = obj.nextInt();
        System.out.println("Enter number 2");
        int number2 = obj.nextInt();
        System.out.println("The sum of Two numbers is  " + number1 + number2);
    }

}
