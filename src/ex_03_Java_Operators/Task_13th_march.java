package ex_03_Java_Operators;

import java.util.Scanner;

public class Task_13th_march {
    public static void main(String[] args) {

        System.out.println("Please enter your score");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        String result; // = a >90 ? "A grade" : a > 80 ? a<89 : " Grade" :

        // using logical operator
        // result = a < 100 && a > 90 ? "Grade is A" : a <89 && a > 80 ? "Grade is B" : a <79 && a>70 ? "Grade is C" : a <69 && a>60 ? "Grade is D" : "Grade is F";

        result = (a <= 59) ? "Grade is F" : (a <69) ? "grade is D":(a<79) ? " Grade is C" : (a<89) ? "grade is B" : (a<100) ? "grade is A": "Enter valid input";

        System.out.println(result);
    }
}
