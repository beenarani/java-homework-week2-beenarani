import java.util.Scanner;

public class program18_PrintTheSum {
    public static void main(String[] args) {
        numbers();

    }

    public static void numbers() {
        // Create a Scanner object
        Scanner in = new Scanner(System.in);

        // input the first number
        System.out.print("Input first number: ");
        // Read and store the first number
        int num1 = in.nextInt();

        // input the second number
        System.out.print("Input second number: ");
        int num2 = in.nextInt();


        // Calculate of the two numbers
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        // Calculate the difference of the two numbers
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        // Calculate the product of the two numbers
        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
        // Calculate the division of the two numbers
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        // Calculate remainder of the division of the two numbers
        System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));

    }
}


