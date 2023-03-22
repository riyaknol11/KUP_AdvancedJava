package com.knoldus.Assignment4;

import java.util.*;
import java.util.stream.Collectors;

// Interface for string operation functions
interface StringFunction {
    List<String> distinctString(List<String> stringList);
}

public class StringOperationUsingLambda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the list of strings: ");
        String stringInput = input.nextLine();

        // Converting user input to a list of strings
        List<String> stringList = Arrays.asList(stringInput.split(" "));

       /*
       Lambda function returns a new list of strings with duplicates removed and sorted in alphabetical order.
       It calls the distinct() method of stream to remove any duplicate strings in the list.
       sorted() method of stream to sort the list in ascending order.
       collect() method of stream with a Collectors.toList() collector to convert the resulting stream back into a list of strings.
        */
        StringFunction stringFunction = (stringList1) ->
                stringList.stream().distinct().sorted().collect(Collectors.toList());


        List<String> finalString = stringFunction.distinctString(stringList);
        for (String stringIndex : finalString) {
            System.out.print(stringIndex + " ");
        }
    }
}
