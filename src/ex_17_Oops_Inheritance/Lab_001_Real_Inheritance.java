package ex_17_Oops_Inheritance;

public class Lab_001_Real_Inheritance {
    public static void main(String[] args) {

        Lab_002_Test_cases1 tc1 = new Lab_002_Test_cases1();

        Lab_001_Real_Inheritance tc2 = new Lab_003_Main_class();
        System.out.println("Default constructor of Main class is executed here with TC2 reference variable");

        Lab_001_Real_Inheritance tc3 = new Lab_001_Real_Inheritance();
        System.out.println("Default constructor of Real inheritance is executed here with TC3 reference variable");

        System.out.println("Function is called using TC1:");
        tc1.connection();



    }

    Lab_001_Real_Inheritance()
    {
        System.out.println("This is main method's default constructor");
    }

}
