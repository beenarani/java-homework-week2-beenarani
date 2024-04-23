public class program15_SwapTwoVariables {
    public static void main(String[] args) {
        //call the static method into main method
        swapvariable();
    }

    public static void swapvariable() {
        // Assign values to variables a and b
        int a, b, temp;
        a = 20;
        b = 40;

        // Print the values before swapping
        System.out.println("Before swapping : a, b = " + a + ", " + b);

        // Perform the swap using a temporary variable
        temp = a;
        a = b;
        b = temp;

        // Print the values after swapping
        System.out.println("After swapping : a, b = " + a + ", " + b);
    }
}

