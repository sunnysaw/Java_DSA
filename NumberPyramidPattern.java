import java.util.Scanner;

public class NumberPyramidPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of rows : ");
        int rows = input.nextInt();
        System.out.println("Enter the length of columns : ");
        int columns = input.nextInt();
        System.out.println("Printing the result  : ");
        int count = 1;
        for (int start = 1; start <= rows; start++){
            for (int secondStart = 1; secondStart <= columns - start; secondStart++){
                System.out.print(" ");
            }
            for (int thirdStart = 1; thirdStart <= start; thirdStart++){
                System.out.print(count + " ");
            }
            count++;
            System.out.println();
        }
    }
}
