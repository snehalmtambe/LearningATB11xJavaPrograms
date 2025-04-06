package ex_09_For_Loop;

public class Lab_002_Fibo_series {
    public static void main(String[] args) {
        // Print header message
        System.out.println("This is the example of fibonacci series");

        // Initialize first number of Fibonacci series (f1 = 0)
        int f1 = 0;
        System.out.println(f1);  // Print first number

        // Initialize second number of Fibonacci series (f2 = 1)
        int f2 = 1;
        System.out.println(f2);  // Print second number

        // Loop will run 8 times to generate next 8 numbers
        // (total 10 numbers including the initial 0 and 1)
        for(int i = 0; i < 8; i++) {
            // Calculate next number in sequence by adding previous two numbers
            int sum = f1 + f2;
            
            // Print the next number in sequence
            System.out.println(sum);
            
            // Shift numbers for next iteration:
            // f1 becomes f2
            // f2 becomes sum
            f1 = f2;
            f2 = sum;
        }
    }
}
