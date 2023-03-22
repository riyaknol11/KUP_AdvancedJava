package com.knoldus.Assignment2;

import java.util.Scanner;

//Interface having one abstract method getNextEven(), implemented using lambda function.
interface NextEvenNumber{
    long getNextEven(long number2);
}
public class EvenNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner input = new Scanner(System.in);
        Long userNumber = input.nextLong();

        // Defining a lambda function to get the next even number
        NextEvenNumber nextEvenNumber = (number) ->{
            if (number % 2 == 0) {
                return (int)number+2;
            }
            else{
                return (int)++number;
            }
        };

        // Calling the getNextEven method on the lambda function to get the next even number
        long result = nextEvenNumber.getNextEven(userNumber);
        System.out.println("Even number next to " + userNumber + " is : " + result);

    }
}
