package com.company;

import java.util.Scanner;

public class UsingStringMethods {

    public static void main(String[] args) {
//                       method that doesn't do anything
        System.out.println("Enter a word: ");
        Scanner kbd = new Scanner(System.in);
        String answer = kbd.nextLine();
        System.out.println("Enter a number as an index: ");
        Integer number = kbd.nextInt();

        System.out.println("The length of the alphabet is : " + answer.length());


        if(answer.length() < number){
            System.out.println("Invalid");
        } else{
            System.out.println("The substring from 0 to " + number + " is : " +
                    answer.substring(0,number));
        }

    }
    }
