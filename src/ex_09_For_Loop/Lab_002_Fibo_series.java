package ex_09_For_Loop;

public class Lab_002_Fibo_series {
    public static void main(String[] args) {
        System.out.println("This is the example of fibonacci series");

        int fib = 0;

        for(int i=0; i<5; i++)
        {

            fib = fib +i;
            System.out.println(fib);

        }
    }
}
