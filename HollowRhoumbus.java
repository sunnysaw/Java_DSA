import java.util.Scanner;

public class HollowRhoumbus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of row : ");
        int rows = input.nextInt();
        System.out.println("Enter the length of column : ");
        int columns = input.nextInt();
        System.out.println("Printing the result : ");
        for (int start = 1; start <= rows; start++) {

            for (int secondStart = 1; secondStart <= columns - start; secondStart++) {
                System.out.print("  ");
            }

             for (int thirdStart = 1; thirdStart <= columns; thirdStart++){
                 if (thirdStart == 1 || thirdStart == columns || start == 1 || start == rows){
                     System.out.print(" *");
                 }else System.out.print("  ");
             }
            System.out.println();
        }
    }
}
