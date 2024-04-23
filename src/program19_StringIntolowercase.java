import java.util.Scanner;

public class program19_StringIntolowercase {
    public static void main(String[] args) {
        //Call the static method into main method
        lowercase();
    }

    public static void lowercase() {
        // Create a Scanner object for user input
        Scanner in = new Scanner(System.in);
        System.out.print("Input a String: ");
        String line = in.nextLine();
        // Convert the string to lowercase
        line = line.toLowerCase();
        // Print the lowercase
        System.out.println(line);
    }
}




