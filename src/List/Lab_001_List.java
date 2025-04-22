package List;

import java.util.ArrayList;
import java.util.List;

public class Lab_001_List {
    public static void main(String[] args) {
        List l1 = new ArrayList();
        l1.add("Snehal");
        l1.add("984563217");
        l1.add("Mumbai");

        System.out.println(l1.size());
        System.out.println(l1.getFirst());
        System.out.println(l1.getLast());
        System.out.println(l1.add("Professional"));

        System.out.println("------------------------");

        for(int i=0; i<l1.size(); i++){
            System.out.println(l1.get(i));


        }

        l1.clear();
        System.out.println(l1.size());

    }
}
