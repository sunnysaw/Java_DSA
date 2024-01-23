package Love_Baber_450.ApnaCollege.Array;
public class Lexography_Largest_String {

    public static void main(String[] args) {
        String[] arr = {"Sunny" , "Muskan" , "Khushi"};
        System.out.println("Printing the result : ");
        String Largest = arr[0];
        for (int start = 1; start < arr.length; start++){
            if (Largest.compareTo(arr[start]) < 0){
                Largest = arr[start];
            }
        }
        System.out.println(Largest);
    }
}
