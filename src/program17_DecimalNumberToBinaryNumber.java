import java.util.Scanner;

public class program17_DecimalNumberToBinaryNumber {

        public static void toBinary(int decimal) {
        int binary[] = new int[40];
        int index = 0;
        while (decimal > 0) {
            binary[index++] = decimal % 2;
            decimal = decimal / 2;
        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
        System.out.println();
    }
        public static void main(String args[]) {
        System.out.println("Decimal of is: ");
        Scanner scaBinary = new Scanner(System.in);
        int y = scaBinary.nextInt();
        toBinary(y);
    }

    }
