package Task_21st_March;

import java.util.Scanner;

public class Lab_leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter year");
        int year = sc.nextInt();

        if(year%4==0)
        {
            System.out.println("This is a leap year");
        }
        else {
            System.out.println("This is not a leap year");
        }

    }
}
