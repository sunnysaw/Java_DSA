import java.util.Scanner;

public class tringlePattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of row : ");
        int row = input.nextInt();
        System.out.println("Enter the length of column : ");
        int col = input.nextInt();
        int temp = 1;
        int count = 1;
        for (int start = 1; start <= row; start++) {
            for (int secondStart = 1; secondStart <= temp; secondStart++) {
                System.out.print(count + " ");
                if (count == 0){
                    count = 1;
                }else count = 0;
            }
            System.out.println();
            if (temp <= row){
                temp++;
            }
        }
    }
}
