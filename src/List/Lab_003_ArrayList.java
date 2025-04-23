package List;

import java.util.*;

public class Lab_003_ArrayList {
    public static void main(String[] args) {
        List l1 = new ArrayList();

        l1.add("Snehal");
        l1.add("Tambe");
        l1.add("QA");
        l1.add("QA");
        l1.add(984513213);
        l1.add(null);

        for(int i=0; i<l1.size(); i++){
            System.out.println(l1.get(i));
        }

        l1.remove(3);

        System.out.println("----------------");

        Iterator iterator = l1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("----------------");

        ArrayList<String> name = new ArrayList<>();
        name.add("Ajay");
        name.add("Viyaj");
        name.add("Sujay");
        name.add("Jay");
        //name.add(8156132);

        for (int i=0; i<name.size(); i++)
        {
            System.out.println(name.get(i));
        }

        System.out.println("----------------");

        Collections.sort(name);
        System.out.println("Names are sorted now:"+name);

        System.out.println("----------------");

    }
}
