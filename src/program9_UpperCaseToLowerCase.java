import java.util.Scanner;

public class program9_UpperCaseToLowerCase {


    public static void main(String[] args) {
//Create scanner object and call static method into main method
        Scanner txtScan = new Scanner(System.in);
        String x = txtScan.nextLine();
        UpperCase(x);
    }

    public static void UpperCase(String txt) {
        System.out.println("Upper Case    " + txt.toUpperCase());
        System.out.println("Lower Case    " + txt.toLowerCase());
    }
}






