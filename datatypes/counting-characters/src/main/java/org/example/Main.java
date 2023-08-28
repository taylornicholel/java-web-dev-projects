// package org.example;

package org.launchcode;

import java.util.HashMap;
import java.util.Map;
// import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        HashMap<Character, Integer> hiddenFigures = new HashMap<>();

        // Scanner input = new Scanner(System.in);
        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] quoteString = quote.toCharArray();
        int  total = 0;
        // hiddenFigures.put(, total);

        // FORMAT THE CONDITIONS
        /*
        for (int i = 0; i < quoteString.length; i++) {
            String letter = quoteString[i];
            newCharacter = input.nextLine();

            if (newCharacter != hiddenFigures.getKey(letter)) {
                hiddenFigures.put(newCharacter, total+1);

            } else {

            }

            System.out.println("\nClass roster:");


            for (Map.Entry<String, Double> student : students.entrySet()) {
                System.out.println(student.getKey() + " (" + student.getValue() + ")");

            } */
        for (char letter : quoteString) {
            if (hiddenFigures.containsKey(letter)) {
                hiddenFigures.put(letter, hiddenFigures.get(letter) + 1);
            } else {
                hiddenFigures.put(letter, 1);
            }
        }

        for (Map.Entry<Character, Integer> count : hiddenFigures.entrySet()) {
            System.out.println(count.getKey() + " : " + count.getValue());
        }


        // System.out.println("SOMETHING: ");
    }
}