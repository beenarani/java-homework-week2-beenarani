public class program4_TwoInstanceAndTwoStaticVariables {
    //one static one instance variable
    static String Name = "Beena";
    static String Surname = "Rani";
    int Number1 = 10;
    int Number2 = 20;

    public static void main(String[] args) {
        //call static and instance method in main method
        staticMet();
        program4_TwoInstanceAndTwoStaticVariables obj4 = new program4_TwoInstanceAndTwoStaticVariables();
        obj4.instanceMet();
    }

    public static void staticMet()
    //declare one static method
    {
        program4_TwoInstanceAndTwoStaticVariables obj4 = new program4_TwoInstanceAndTwoStaticVariables();
        System.out.println(Name);
        System.out.println(Surname);
        //System.out.println("calling instance Variable in static "+obj3.nonStatic);
    }

    public void instanceMet()
    //declare one instance method
    {
        System.out.println(Number1);
        System.out.println(Number2);
        //System.out.println("system print in instance"+nonStatic);
    }
}

