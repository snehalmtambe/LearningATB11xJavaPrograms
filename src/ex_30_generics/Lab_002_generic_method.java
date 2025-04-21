package ex_30_generics;

public class Lab_002_generic_method {
    public static void main(String[] args) {

        temp_sum(3,4);
        temp_sum(3.5,9.2);
        temp_sum("Snehal", "Tambe");


    }

    static <G> G temp_sum (G a, G b)
    {
        System.out.println(a);
        System.out.println(b);
        return null;


    }
}
