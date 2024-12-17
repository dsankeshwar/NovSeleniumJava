package StringsConcepts_Day3;

import java.lang.constant.Constable;

public class StringConcepts {

    public static void main(String[] args) {

        //String is a sequence of characters
        //String is a combination of characters
        String s2="THis is my first string that iam working on";

        System.out.println(s2);

        //Prints the number of characters present in the string
        System.out.println(s2.length());

        s2="          ";
        //Checks if the given string is blank or not
        //Returns true if the string is blank else false
        System.out.println(s2.isBlank()); //JDK 11 Function
        System.out.println(s2.isEmpty());

        s2="";
        //Checks if the given string is empty or not
        //Returns true if the string is empty else false
        System.out.println(s2.isEmpty()); //true because it does not have even a single character
        System.out.println(s2.isBlank()); //true --> Because there are no values here

        s2="THis is my first string that iam working on";

        //Converts the complete string to CAPITAL LETTERS
        System.out.println(s2.toUpperCase());

        //Converts the complete string to SMALL LETTERS
        System.out.println(s2.toLowerCase());

        //Returns true if the string is starting with the word 'This'
        //Else it returns false
        //Case Sensitivity Matters here
        System.out.println(s2.startsWith("This")); //false
        System.out.println(s2.startsWith(s2)); //true
        System.out.println(s2.startsWith("THis is my"));

        //We are converting the string to small letters and checking whether the string is startign with 'this'
        System.out.println(s2.toLowerCase().startsWith("this"));

        s2="THis is my first string that iam working on";

        //Checks if the given string is ending with 'ing on'
        //Returns true if the condition is satisfied else it returns false
        System.out.println(s2.endsWith("ing on")); //true
        System.out.println(s2.endsWith("that iam")); //false
        System.out.println(s2.endsWith(s2));
        System.out.println(s2.toUpperCase().endsWith("THAT IAM WORKING ON"));

        //Checks if the given word 'first' is present in the string
        //Returns true if the above condition is satisfied
        //Else it returns false
        System.out.println(s2.contains("first")); //true
        System.out.println(s2.contains("my first that")); //false

        System.out.println(s2.toUpperCase().contains("WORKING ON")); //true

        s2="THis is my first string that iam working on";

        //Replaces the word 'First' with the word 'Second' in the given string
        System.out.println(s2.replace("first","second"));

        //If the word to be replaced is not found, then it will print the original string
        System.out.println(s2.replace("THAT","this"));

        //Prints the character that is present at 5th index position
        //We need to start reading the string chracter by character from 0,1,2,3.................
        System.out.println(s2.charAt(5));
        System.out.println(s2.charAt(42));
        System.out.println(s2.charAt(26));
        System.out.println(s2.charAt(4));

        //Throws StringIndexOutOfBounds Exception, because we are trying to access a character that is not within the length of the string
//        System.out.println(s2.charAt(500));
//        System.out.println(s2.charAt(-5));

        s2="THis is my first string that iam working on";

        //Prints the string starting from 5th index position till the end
        System.out.println(s2.substring(5));
        System.out.println(s2.substring(24));

        //Prints the string starting from 10th index position till 20th index position
        //Inclusive of start index position and exclusive of end index position
        System.out.println(s2.substring(10,20));

        s2="THis is my first string that iam working on";

        //s2.length() --> 43
        //s2.length()/2 --> 21
        //s2.substring(6,21)
        System.out.println(s2.substring(6,s2.length()/2));

        //Throws StringIndexOutOfBoundsException, because the start index position is greater than end index position
//        System.out.println(s2.substring(40,20));

        s2="THis is my first string that iam working on \n";

        //Repeats the same string for 3 times on the same line
        System.out.println(s2.repeat(3)); //JDK 11 Function

        s2="THis is my first string that iam working on";

        //Prints the index position of the first occurence of character 'o' in the given string
        System.out.println(s2.indexOf('o'));
        System.out.println(s2.indexOf('i'));

        System.out.println(s2.indexOf("string"));

        //If the given word or given character is not present in the string
        //it will return -1
        System.out.println(s2.indexOf("zebra"));

        s2="THis is my first string that iam working on";

        //Prints the index position of the last occurence of the character 'i' in the given string
        System.out.println(s2.lastIndexOf('i'));
        System.out.println(s2.lastIndexOf('o'));

        System.out.println(s2.lastIndexOf("am"));

        //ASCII Ranges:
        //A - Z = 65-90
        //a - z = 97-122
        //0- 9  = 48-57
        // =32
        String s4="New Data in making";
        String s5="New Data";

        //Returns true if both the strings are same
        //Else it returns false
        //Case Sensitivity Matters here
        System.out.println(s4.equals(s5));

        //Returns true if both the strings are same
        //Else it returns false
        //Case Sensitivity Does not Matters here
        System.out.println(s4.equalsIgnoreCase(s5));

        //Check whether the given strings are equal
        //We are comparing the string character by character and we are using the ASCII Value of each character
        //Returns 0 if both the strings are equal
        //Return +ve value if the first string is greater than second string
        //Returns -ve value if the first string is lesser than second string
        System.out.println(s4.compareTo(s5));

        //Check whether the given strings are equal
        //We are comparing the string character by character and we are using the ASCII Value of each character
        //Returns 0 if both the strings are equal
        //Return +ve value if the first string is greater than second string
        //Returns -ve value if the first string is lesser than second string
        //Case Sensitivity Does not matter here
        System.out.println(s4.compareToIgnoreCase(s5));

        String s7="                  New Lines of coding data                             ";

        //Removes the white spaces that is present before and after the string
        System.out.println(s7.trim());
//        System.out.println(s7.strip()); //JDK 11 Function

        //Removes the white spaces that is present at the start of the string
        System.out.println(s7.stripLeading());

        //Removes the white spaces that is present at the end of the string
        System.out.println(s7.stripTrailing());

        //Removing the white spaces in the middle of the string
        System.out.println(s7.trim().replace(" ",""));

        s7="Coding Questions";

        //Prints the ASCII Value of the chracter that is present at 6th index position
        System.out.println(s7.codePointAt(6));

        //Join both the strings
        System.out.println(s7.concat(" Yes It Is").concat(" !!!!!"));

        String s8="Java Coding In progress , yes any progress is good to go";

        //Replaces the first occurence of the word 'progress' in the string
        System.out.println(s8.replaceFirst("progress","progressed"));

        //JDK 12 Functionality where I can declare constant string
        Constable c3="New String in Constant";  //No one cannot change the value of the string

        System.out.println(c3);

        //If we want to write paragraphs of data then we have to put it in """ """
        String k40= """
                There were a variety of ways to win the game. 
                James had played it long enough to know most of them and he could see what his opponent was trying to do. 
                There was a simple counterattack that James could use and the game should be his. 
                He began deploying it with the confidence of a veteran player who had been in this situation a thousand times in the past. So, it was with great surprise when his opponent used a move he had never before seen or anticipated to easily defeat him in the game.
                """;

        System.out.println(k40);

        System.out.println(k40.regionMatches(6,"were",0,4));
    }

}