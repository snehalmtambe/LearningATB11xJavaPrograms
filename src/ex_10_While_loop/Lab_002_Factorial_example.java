package ex_10_While_loop;

import java.util.Scanner;

public class Lab_002_Factorial_example {
    public static void main(String[] args) {
        System.out.println("This is Factorial example");

        int fact=1;
        System.out.println("Please enter number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num<=0)
        {
            System.out.println(fact);

        }
        else{
            for(int j=1; j<=num; j++)
            {
                fact = fact*j;

            }
            System.out.println(fact);
        }
    }

}
