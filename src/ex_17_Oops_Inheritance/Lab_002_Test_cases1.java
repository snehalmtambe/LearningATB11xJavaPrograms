package ex_17_Oops_Inheritance;

public class Lab_002_Test_cases1 extends Lab_003_Main_class{
    public static void main(String[] args) {
        Lab_002_Test_cases1 tc1 = new Lab_002_Test_cases1();

        tc1.connection();
        tc1.Start_browser();
        tc1.test_execution();
        tc1.end_browser();
        tc1.connection_closed();



    }

    void test_execution()
    {
        System.out.println("Test cases gets executed");

    }
}
