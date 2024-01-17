package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(-1);
        numbers.add(-2);
        numbers.add(0);
        numbers.add(7);
        numbers.add(-8);

        Map<String, Integer> result = classifyNumbers(numbers);
        System.out.println("Expected: {Negative Even=2, Negative Odd=1, Zero=1, Positive Odd=4, Positive Even=2} - " +
                "Actual: " + result);

        System.out.println(isStrongPassword("Abcd1234@"));  // Output: true
        System.out.println(isStrongPassword("helloWorld")); // Output: false
        System.out.println(isStrongPassword("P@ssw0rd"));   // Output: true
        System.out.println(isStrongPassword("12!45^67"));  // Output: false
        System.out.println(isStrongPassword("Abc1234"));   // Output: false

        System.out.println("Expected: xHiX - Actual: " + stringX("xxHxix"));
        System.out.println("Expected: abcd - Actual: " + stringX("abxxxcd"));


        
    }

    public static Map<String, Integer> classifyNumbers(List<Integer> list) {
        // create a map that holds the strings and the counts of each
        // create counter variables for each classification
        // loop through the list, looking at each number
        // add to counters if number fits classification
        int zeroCount = 0;
        int posEvenCount = 0;
        int posOddCount = 0;
        int negEvenCount = 0;
        int negOddCount = 0;
        Map<String, Integer> classified = new HashMap<>();
        for(Integer num : list) {
            if(num == 0) {
                zeroCount++;
            }
            else if(num < 0) {
                if(num % 2 == 0) {
                    negEvenCount++;
                }
                else {
                    negOddCount++;
                }
            }
            else {
                if(num % 2 == 0) {
                    posEvenCount++;
                }
                else {
                    posOddCount++;
                }
            }
        }
        if(posOddCount > 0) {
            classified.put("Positive Odd: ", posOddCount);
        }
        if(posEvenCount > 0) {
            classified.put("Positive Even: ", posEvenCount);
        }
        if(negOddCount > 0) {
            classified.put("Negative Odd: ", negOddCount);
        }
        if(negEvenCount > 0) {
            classified.put("Negative Even: ", negEvenCount);
        }
        if(zeroCount > 0) {
            classified.put("Zero: ", zeroCount);
        }
        return classified;
    }

    public static boolean isStrongPassword(String password) {
        boolean isStrong = false;
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        if(password.length()<8) {
            return isStrong;
        }
        for(int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if(Character.isUpperCase(ch)) {
                hasUpper = true;
            }
            else if(Character.isLowerCase(ch)) {
                hasLower = true;
            }
            else if(Character.isDigit(ch)) {
                hasDigit = true;
            }
            else {
                String specialChars = "!@#$%*";
                if(specialChars.contains(ch + "")) {
                    hasSpecial = true;
                }
            }
        }
        return hasUpper && hasLower && hasDigit && hasSpecial;
    }

    public static String stringX(String str) {
        String newStr = "";
        if(str.length() <= 2 || str == null) {
            return str;
        }
        char firstCh = str.charAt(0);
        char lastCh = str.charAt(str.length()-1);
        for(int i = 1; i < str.length()-1; i++) {
            if(str.charAt(i) != 'x') {
                newStr+= str.charAt(i);
            }
        }
        return firstCh + newStr + lastCh;
    }


}