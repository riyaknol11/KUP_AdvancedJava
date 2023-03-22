package com.knoldus.Assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//that accepting seven strings and returns a concatenated string in upper case.
interface StringConcatenation{
    String concatenateStrings(String str1, String str2, String str3, String str4, String str5, String str6, String str7);
}


public class StringUpperCaseConcatenationLambda{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter seven strings: ");
        String string1 = input.nextLine();
        String string2 = input.nextLine();
        String string3 = input.nextLine();
        String string4 = input.nextLine();
        String string5 = input.nextLine();
        String string6 = input.nextLine();
        String string7 = input.nextLine();

        /*implementing the interface using a lambda function that concatenates the strings and converts the result to upper case.
         The lambda expression uses the Stream to convert the input String arguments to uppercase and concatenate them using the reduce operation.
         */
        StringConcatenation stringConcatenation = (input1, input2, input3, input4, input5, input6, input7) -> {
            String result = Stream.of(input1, input2, input3, input4, input5, input6, input7).map(String ::toUpperCase).reduce("", String::concat);
            return result;
        };

        String resultString = stringConcatenation.concatenateStrings(string1,string2,string3,string4,string5,string6,string7);
        System.out.println(resultString);
    }
}
