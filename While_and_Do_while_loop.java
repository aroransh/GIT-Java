package com.Anshul;

public class While_and_Do_while_loop {

    public static void main(String[] args) {

        //   Syntax for While loop
        //   While(condition){
        //   This code will keep executing until the condition remains true. The moment condition becomes false it will come out of the loop

        int i = 0;
//        while(i<100){
//            i++;
//            System.out.println(i);  // This will print value from 1 to 100
//*************************************************************************************************
//            while(i<100){
//            i+=1;         // This means the value of i will always be increased by 1. If i+=2, then value of i will always be increased by 2
//        System.out.println(i); // This will also print value 1 to 100
//*****************************************************************************************************
//             while (i<100){
//                 System.out.println(i);
//                 i+=1;            // This will print the value from 0 to 99 as sout() command is given first that will print the value of i first

//************************************************************************************************************************************************************
//        while(i<100){
//            System.out.println(i); // This will print 0 for the infinite times as the value of i remains static i.e. 0
//*************************************************************************************************************************************************************
        do {
            System.out.println(i);
            i+=2;           // This means that value of i will increase by 2
        }
        while (i < 100);



    }
    }

/*Difference between Whiel and Do while loop
 In while loop, the code block gets execute continuously until the condition remains true whereas, Do while is exactly same like
 while loop but here the code block gets exceuted atleast once and then, the condition is checked
 */
