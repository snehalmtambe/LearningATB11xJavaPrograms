package Task_27_March;

import java.util.Scanner;

public class Lab_001_Odd_Even_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of elements you want to enter");
        int num = sc.nextInt();
        int[] abc = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println("please tne Each numbers");

            abc[i] = sc.nextInt();
        }
        for (int number : abc) {
            if (number % 2 == 0) {
                System.out.println("This is even number"+number);
            } else {
                System.out.println("This is odd number"+number);
            }

        }

    }


    }

