import java.util.Scanner;

public class program14_Rectangle {

    public static void main(String[] args) {
//call static method into main method

        rectangle();
    }

    public static void rectangle() {
        //width and height of the rectangle
        final double width = 5.5;
        final double height = 8.5;

        //perimeter of the rectangle
        double perimeter = 2 * (height + width);

        //area of the rectangle
        double area = width * height;

        // Print the calculated perimeter using placeholders for values
        Scanner Hi = new Scanner(System.in);
        System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter);

        // Print the calculated area using placeholders for values
        Scanner wi = new Scanner(System.in);
        System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);
    }
}