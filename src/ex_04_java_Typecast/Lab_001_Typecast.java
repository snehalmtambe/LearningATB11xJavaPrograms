package ex_04_java_Typecast;

public class Lab_001_Typecast {
    public static void main(String[] args) {
        System.out.println("Following is the example of Typecast");

        byte a = 10;
        int b = a; //implicit type casting

        System.out.println("Value of b is:" +b);

        int x = 300;
        byte y =(byte) x; // explicit type cast

        System.out.println("Value of y is:" +y);
    }
}
