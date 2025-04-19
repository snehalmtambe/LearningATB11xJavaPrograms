package ex_17_Oops_Inheritance;

public class Lab_003_Main_class extends Lab_001_Real_Inheritance{
    void connection()
    {
        System.out.println("Connection is made");
    }

    void Start_browser()
    {
        System.out.println("Browser is initiated");
    }

    void end_browser()
    {
        System.out.println("Browser is closed");
    }

    void connection_closed()
    {
        System.out.println("Connection is closed");
    }

    Lab_003_Main_class()
    {
        System.out.println("This is default constructor of Lab_003_Main_Class");
    }

    void sys_exit()
    {
        System.out.println("All connections are terminated and connection are closed");
    }
}
