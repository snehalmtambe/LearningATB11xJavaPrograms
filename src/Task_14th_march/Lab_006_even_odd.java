package Task_14th_march;

import java.util.Scanner;

public class Lab_006_even_odd {
    public static void main(String[] args) {
        System.out.println("Please enter number");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if(a%2==0)
        {
            System.out.println("Enter number is even");
        }
        else
        {
            System.out.println("Enter number is odd");
        }

        sc.close();


    }
}
