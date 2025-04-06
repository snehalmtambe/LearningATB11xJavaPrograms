package ex_08_Switch_statement;

import java.util.Scanner;

public class Lab_001_Switch_statement {
    public static void main(String[] args) {
        System.out.println("This is the example of Switch Statement");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter  value between 1 to 7");

        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("This is Monday");
                break;

            case 2:
                System.out.println("This is Tuesday");
                break;

            case 3:
                System.out.println("This is Wednesday");
                break;

            case 4:
                System.out.println("This is Thursday");
                break;

            case 5:
                System.out.println("This is Friday");
                break;

            case 6:
                System.out.println("This is Saturday");
                break;

            case 7:
                System.out.println("This is Sunday");
                break;

            default:
                System.out.println("This is invalid input");
                break;

        }




    }
}
