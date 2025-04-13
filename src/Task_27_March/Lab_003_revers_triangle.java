package Task_27_March;

import java.util.Scanner;

public class Lab_003_revers_triangle {
    public static void main(String[] args) {
        System.out.println("Please enter number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i=num; i>=1;i--)
        {
            for(int j=1; j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
