package ex_03Java_Operators;

public class Lab_003_Concat_Operators {
    public static void main(String[] args) {
        System.out.println("Following is the example of Concat operator");

        String firstname = "Snehal";
        String lastname = "Tambe";

        int a = 10;
        int b = 20;

        System.out.println(firstname + lastname + a + b ); // here compiler treat everything as a string as its first 2 parameters are string

        System.out.println(a + b + firstname + lastname); // here compiler will do first arithmetic operations  and then concat strings

        System.out.println(firstname + lastname + (a + b) );

    }
}
