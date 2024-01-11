import java.util.*;

public class String_Shortest_Path {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the direction for starting the calculation : ");
        String direction = input.nextLine();
        int HorizontalLocation = 0;
        int VerticalLocation = 0;
        for (int start = 0; start < direction.length(); start++){
           char currentDirection = direction.charAt(start);
           if (currentDirection == 'N'){
               HorizontalLocation++;
           } else if (currentDirection == 'S') {
               HorizontalLocation--;
           } else if (currentDirection == 'W') {
               VerticalLocation--;
           }
           else if (currentDirection == 'E') {
               VerticalLocation++;
           }
        }
        int ResultOne = ( HorizontalLocation * HorizontalLocation );
        int ResultTwo = ( VerticalLocation * VerticalLocation ) ;
        System.out.println("Printing the result : ");
        System.out.println(Math.sqrt(ResultOne + ResultTwo));
    }
}
