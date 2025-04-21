package ex_30_generics;

public class Lab_003_genenric_method1 {
    public static void main(String[] args) {
        add(4,5);
        add(6.5,7.8);
        add("John","Smith");

    }
    static  <G> G add(G a, G b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}

