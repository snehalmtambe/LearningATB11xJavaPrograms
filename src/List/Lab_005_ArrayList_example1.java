package List;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Lab_005_ArrayList_example1 {
    public static void main(String[] args) {

        List vegetables = new ArrayList();
        vegetables.add("Tomatoes");
        vegetables.add("Potatoes");
        vegetables.add("Onions");
        System.out.println(vegetables);

        System.out.println("----------------------");

        List fruits = new ArrayList();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        System.out.println(fruits);

        System.out.println("-----------------------");


        List fruits1 = new ArrayList();
        fruits1.add("mango");
        fruits1.add("Grapes");
        fruits1.add("papaya");
        System.out.println(fruits1);

        System.out.println("-----------------------");

        List all_veg = new ArrayList();
        all_veg.add(fruits);
        all_veg.add(fruits1);
        all_veg.add(vegetables);

        System.out.println(all_veg);
        System.out.println(all_veg.get(1));


    }
}
