package Love_Baber_450.ApnaCollege.String;

import java.util.Scanner;

public class CompressionString {

    static String Compression(String letter){
        int count = 1;
        StringBuilder sentence = new StringBuilder();
        for (int start = 0; start < letter.length(); start++){
            if (start < letter.length() - 1 && letter.charAt(start) == letter.charAt(start + 1)){
                count++;
            }else {
                sentence.append(letter.charAt(start));
                if (count > 1){
                    sentence.append(count);
                }
                count = 1;
            }
        }
        return  sentence.toString();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word or sentence in which you want to perform operation of compression : ");
        String letter = input.nextLine();
        System.out.println("Printing the result : ");
        System.out.println(Compression(letter));
    }
}
