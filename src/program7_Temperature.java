import java.util.Scanner;

public class program7_Temperature {

    public static void main(String[] Strings) {
        //call static method into main method
        mymethod();
        }
        public static void mymethod(){
        //create scanner object
            Scanner input = new Scanner(System.in);
            //input degree of Fahrenheit
            System.out.print("Input a degree in Fahrenheit: ");
            double fahrenheit = input.nextDouble();
            double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
            System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
        }
    }

