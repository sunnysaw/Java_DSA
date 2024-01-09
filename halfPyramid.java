import java.util.Scanner;
public class halfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = 5;  // Adjust the number of rows as needed

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Print spaces before stars
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  "); // Two spaces for alignment
            }

            // Print stars with spaces between them
            for (int j = 1; j <= i; j++) {
                System.out.print(" *"); // Star followed by two spaces
            }

            // Move to the next line
            System.out.println();
        }
        }
}
/*
             *
          *  *
       *  *  *
    *  *  *  *
 *  *  *  *  *
 */