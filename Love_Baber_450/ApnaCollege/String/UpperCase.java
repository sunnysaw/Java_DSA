/*
sunny just focus on your goals => SUNNY JUST FOCUS ON YOUR GOALS
 */
package Love_Baber_450.ApnaCollege.String;

import java.util.Scanner;

public class UpperCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sentence that you want to convert it into uppercase : ");
        String sentence = input.nextLine();
        System.out.println("Now , Printing the result : ");

        StringBuilder modifies = new StringBuilder();
        for (int start = 0; start < sentence.length(); start++) {
            char currentChar = sentence.charAt(start);
                modifies.append(Character.toUpperCase(currentChar));
            }
        System.out.println(modifies.toString());
    }
}

