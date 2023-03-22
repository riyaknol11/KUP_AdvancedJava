package com.knoldus.Assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

interface UpperCase{
    String  upperCaseFunction(ArrayList<String> stringList1);
}
public class StringUpperCaseConcatenation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the seven strings : ");
        //Taking the 7 string inputs from user in arrayList
        ArrayList<String> stringList = new ArrayList<>();
        for(int index = 0; index<7; index++) {
            System.out.print("Enter string " + (index+1) + ": ");
            stringList.add(input.nextLine());
        }
/*The lambda expression accepting a single argument stringList1 of type List<String> having 7 strings as input
1. stream() method on the stringList object is called to convert it into a stream of strings.
2. map() operation is applied to each string in the stream, which transforms each string to its upper case version using the String::toUpperCase
 */
        UpperCase upperCase = (stringList1) ->
            stringList.stream().map(String::toUpperCase).collect(Collectors.joining());

        String resultString = upperCase.upperCaseFunction(stringList);
        System.out.println(resultString);
    }
}
