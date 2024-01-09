import java.util.Scanner;

public class numberPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of row : ");
        int row = input.nextInt();
        System.out.println("Enter the length of column : ");
        int col = input.nextInt();
        int temp = col;
        int count = 1;
        for (int start = 1; start <= row; start++){
            for (int secondStart = 1; secondStart <= temp; secondStart++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
            count = 1;
            temp--;
        }
    }
}
