package ex_29_Exceptions;

import javax.management.StringValueExp;

public class Lab_001_Exception_example {
    public static void main(String[] args) {
        try {
            int a = 100;
            Integer c = a;

            System.out.println(c);
            String b = null;
            int x = Integer.parseInt(b);

        }catch (Exception e)
        {
            System.out.println("You can not convert string to integer :"+e.getMessage());
        }

    }
}
