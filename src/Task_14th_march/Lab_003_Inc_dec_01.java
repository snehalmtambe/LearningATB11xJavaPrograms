package Task_14th_march;

import java.util.Scanner;

public class Lab_003_Inc_dec_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        int salary;

        System.out.println("Please enter your name");
        name = sc.next();

        System.out.println("Please enter your age");
        age = sc.nextInt();

        System.out.println("Please enter your salary");
        salary = sc.nextInt();

        System.out.println("Your name is:"+name);
        System.out.println("Your age is:"+age);
        System.out.println("Your salary is:"+salary);

        //System.out.println("name is:"+name+" age is:"+age+"salary is :"+salary);
    }
}
