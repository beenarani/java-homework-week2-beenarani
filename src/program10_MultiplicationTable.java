import java.util.Scanner;

public class program10_MultiplicationTable {
    public static void main(String[] args) {
        mymethod();
    }
    public static void mymethod() {
        // Create a Scanner object
        Scanner in = new Scanner(System.in);

        //input a number
        System.out.print("Input a number: ");
        int num1 = in.nextInt();

        // Calculation
        for (int i = 0; i < 10; i++) {

            System.out.println(num1 + " x " + (i + 1) + " = " + (num1 * (i + 1)));
        }
    }
}
