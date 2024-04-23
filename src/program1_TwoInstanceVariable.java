public class program1_TwoInstanceVariable {
    //create two instance variable
    int A1 = 10;
    String B1 = "Beena Rani";

    public static void main(String[] args) {
        //call instance method into main method

        program1_TwoInstanceVariable obj1 = new program1_TwoInstanceVariable();
        obj1.instanceV();
    }

    //create instance method
    public void instanceV() {
        System.out.println("Print the Value of instance Variable A  = " + A1);
        System.out.println("Print the value of instance Variable B  = " + B1);
    }

}



