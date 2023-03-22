package com.knoldus.Assignment2;
import java.util.Scanner;

//MaxFunction interface with a single abstract method getMax().
interface MaxFunction{
   Integer getMax(int number1, int number2);
}
public class MaximumOfNumbers{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer number1 = Integer.valueOf(input.nextInt());
        Integer number2 = Integer.valueOf(input.nextInt());
        /*Lambda function takes two integer arguments named number1 and number2 and returns
         the maximum of the two numbers using the built-in Math.max function.
         */
        MaxFunction maxFunction = (numberOne, numberTwo) -> Math.max(number1, number2);

        Integer result = maxFunction.getMax(number1,number2);
        System.out.println("The maximum of " + number1 + " and " + number2 + " is " + result);
    }
}
