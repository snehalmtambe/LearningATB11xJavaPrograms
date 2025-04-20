package ex_29_Exceptions;

public class Lab_002_Exception_ex1 {
    public static void main(String[] args) {
        double pi = 3.14;
        int a = 0;

        try {

            int b = 100 / a;

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("This code will definitely executed");
        }
    }
}
