import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to check whether the number is palindrome or not ! ");
        int number = scanner.nextInt();
        int numb = number;
        int reverseNumber;
        int result = 0;
        while (number != 0){
            reverseNumber = number % 10;
            result = result * 10 + reverseNumber;
            number /= 10;
        }
        if (result == numb){
            System.out.println("The number is an palindrome number.");
        }else System.out.println("The number is not an palindrome number.");
    }
}
