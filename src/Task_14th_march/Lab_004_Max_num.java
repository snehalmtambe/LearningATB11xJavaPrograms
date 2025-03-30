package Task_14th_march;

public class Lab_004_Max_num {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("Vale of A is:"+a);
        System.out.println("Value of B is:"+b);
        String result;

        result = (a<b) ? "B is larger" : "a is larger";

        System.out.println("Result is :"+result);

    }
}

