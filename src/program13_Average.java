import java.util.Scanner;

public class program13_Average {

    public static void avgMethod(int a, int b, int c) {
        int d = (a + b + c) / 3;
        System.out.println("Average of three numbers are   =  " + d);
    }

    public static void main(String[] args) {
        Scanner avg = new Scanner(System.in);
        System.out.print("Enter 1st number  = ");
        int k = avg.nextInt();

        Scanner avg1 = new Scanner(System.in);
        System.out.print("Enter 1st number  = ");
        int k1 = avg1.nextInt();

        Scanner avg2 = new Scanner(System.in);
        System.out.print("Enter 1st number  = ");
        int k2 = avg2.nextInt();

        avgMethod(k, k1, k2);

    }
}
