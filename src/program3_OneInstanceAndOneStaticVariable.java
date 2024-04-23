public class program3_OneInstanceAndOneStaticVariable {
    //one static one instance variable
    static String Name = "Beena Rani";
    int number = 10;

    public static void main(String[] args) {
        //call static and instance method in main method
        staticMet();
        program3_OneInstanceAndOneStaticVariable obj3 = new program3_OneInstanceAndOneStaticVariable();
        obj3.instanceMet();
    }

    public static void staticMet()
    //declare one static method
    {
        program3_OneInstanceAndOneStaticVariable obj3 = new program3_OneInstanceAndOneStaticVariable();
        System.out.println(Name);
        //System.out.println("calling instance Variable in static "+obj3.nonStatic);
    }

    public void instanceMet()
    //declare one instance method
    {
        System.out.println(number);
        //System.out.println("system print in instance"+nonStatic);
    }
}