import java.util.Scanner;

public class solidRhomus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of row : ");
        int row = input.nextInt();
        System.out.println("Enter the length of column : ");
        int column = input.nextInt();
        for (int start = 1; start <= row; start++){

            for (int secondStart = 1; secondStart <= column - start; secondStart++){
                System.out.print("  ");
            }

            for (int thirdStart = 1; thirdStart <= column; thirdStart++){
                System.out.print(" *");
            }

            System.out.println();
        }
    }
}
