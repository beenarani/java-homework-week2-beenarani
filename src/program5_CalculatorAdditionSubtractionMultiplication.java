import java.util.Scanner;

public class program5_CalculatorAdditionSubtractionMultiplication {
    //declare add variable
    public void addMeth(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    public void subMeth(int a, int b) {
        //declare sub. variable
        int c = a - b;
        System.out.println(c);
    }

    public static void multiMeth(int a, int b) {
        //declare multi variable
        int c = a * b;
        System.out.println(c);
    }

    public static void divMeth(int a, int b) {
        //declare div. variable
        int c = a / b;
        System.out.println(c);
    }

    public static void main(String[] args) {

        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Please enter 1st number : ");
        System.out.println("Please enter 2nd number : ");
        int a = inputNumber.nextInt();
        int b = inputNumber.nextInt();

        divMeth(a, b);
        multiMeth(a, b);
        program5_CalculatorAdditionSubtractionMultiplication N = new program5_CalculatorAdditionSubtractionMultiplication();
        N.addMeth(a, b);
        N.subMeth(a, b);

    }


}


