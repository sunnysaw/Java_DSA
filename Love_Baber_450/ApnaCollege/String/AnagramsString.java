package Love_Baber_450.ApnaCollege.String;

import java.util.Scanner;

public class AnagramsString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first letter in which you want to perform operation : ");
        String FirstLetter = input.nextLine();
        System.out.println("Enter the Second letter in which you want to perform operation : ");
        String SecondLetter = input.nextLine();
        int count = 0;
        for (int start = 0; start < FirstLetter.length(); start++){
            for (int secondStart = 0; secondStart < SecondLetter.length(); secondStart++){
                if (FirstLetter.charAt(start) == SecondLetter.charAt(secondStart)){
                    count++;
                }
            }
        }
        System.out.println("Printing the result : ");
        if (count >= FirstLetter.length()){
            System.out.println("Given two letters are Anagram ");
        }else
            System.out.println("Given two letters are not Anagram ");
    }
}
