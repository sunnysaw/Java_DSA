import java.util.Scanner;

public class DiamondPattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int midRow = rows / 2;

        for (int i = 0; i < rows; i++) {
            int numStars = Math.abs(i - midRow) * 2 + 1;

            int spaces = (cols - numStars) / 2;
            if (i < cols / 2) {
                spaces++;
            }
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < numStars; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
