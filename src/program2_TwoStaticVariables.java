public class program2_TwoStaticVariables {
    //create two static variable
    static int A1 = 10;
    static String B1 = "Beena Rani";

    //call static variable into main method
    public static void main(String[] args) {
        staticV();
    }

    public static void staticV() {
        System.out.println("Print the Value of instance Variable A  = " + A1);
        System.out.println("Print the value of instance Variable B  = " + B1);
    }
}
